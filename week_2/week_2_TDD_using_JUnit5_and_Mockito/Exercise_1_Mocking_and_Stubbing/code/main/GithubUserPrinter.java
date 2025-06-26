import org.junit.entity.GithubUser;
import org.junit.services.GithubUserService;

public class GithubUserPrinter {
    private GithubUserService service;

    public GithubUserPrinter(GithubUserService service) {
        this.service = service;
    }

    public void printUserInfo(String username) {
        GithubUser user = service.fetchGithubUser(username);
        if (user != null) {
            System.out.println("Name: " + user.getName());
            System.out.println("Location: " + user.getLocation());
            System.out.println("Bio: " + user.getBio());
        } else {
            System.out.println("User not found.");
        }
    }
}
