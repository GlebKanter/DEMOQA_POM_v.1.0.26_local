package testcases;

import com.telran.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    //"GlebKa").withPassword("Tglebson#13"));
    //   https://demoqa.com/login
    @Test
    public void loginTest() {
        new LoginPage(driver)
                .login("GlebKa", "Tglebson#13")
                .verifyUserName("GlebKa")
                .logout();

    }
}
