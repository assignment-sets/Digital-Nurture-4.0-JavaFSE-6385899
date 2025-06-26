import org.junit.entity.GithubUser;
import org.junit.jupiter.api.Test;
import org.junit.services.GithubUserService;

import static org.mockito.Mockito.*;

public class GithubUserPrinterTest {
    @Test
    public void printUserInfoTest() {
        GithubUserService mockService = mock(GithubUserService.class);
        GithubUser dummyUser = new GithubUser("John Doe", "New York", "Test Bio");

        when(mockService.fetchGithubUser("assignment-sets")).thenReturn(dummyUser);

        GithubUserPrinter printer = new GithubUserPrinter(mockService);

        printer.printUserInfo("assignment-sets");

        // verification
        verify(mockService, times(1)).fetchGithubUser("assignment-sets");
    }
}
