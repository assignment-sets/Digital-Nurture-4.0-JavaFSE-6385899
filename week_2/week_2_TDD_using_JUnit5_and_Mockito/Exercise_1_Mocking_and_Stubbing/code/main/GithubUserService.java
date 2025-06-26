import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.entity.GithubUser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GithubUserService {
    private static final String BASE_API_URL = "https://api.github.com/users/";

    public GithubUser fetchGithubUser(String username) {
        try {
            String fullUrl = BASE_API_URL + username;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(fullUrl))
                    .build();

            HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (res.statusCode() == 200) {
                String jsonResponse = res.body();

                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode root = objectMapper.readTree(jsonResponse);

                String name = root.path("name").asText();
                String location = root.path("location").asText();
                String bio = root.path("bio").asText();

                return new GithubUser(name, location, bio);
            } else {
                System.out.println("GitHub API request failed with status code: " + res.statusCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
