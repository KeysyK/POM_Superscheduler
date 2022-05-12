package tests;

import configuration.AppiumConfiguration;
import org.testng.annotations.Test;
import screens.LoginScreen;
import screens.SplashScreen;

public class LoginTests extends AppiumConfiguration {

    @Test
    public void loginSuccess(){
        new SplashScreen(driver).checkVersion("0.0.3").fillEmail("arielle@gmail.com").fillPassword("Arielle12345$").submitLogin();
    }

    @Test
    public void loginSuccessModel(){
        new LoginScreen(driver).complexLogin();
    }

}

