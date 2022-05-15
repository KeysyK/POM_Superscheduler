package tests;

import configuration.AppiumConfiguration;
import models.Auth;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import screens.HomeScreen;
import screens.LoginScreen;
import screens.SplashScreen;

public class LoginTests extends AppiumConfiguration {

    @Test
    public void loginSuccess(){
        boolean isFabButtonPresent = new SplashScreen(driver).checkVersion("0.0.3")
                .fillEmail("arielle@gmail.com")
                .fillPassword("Arielle12345$")
                .submitLogin()
                .isFabPlusPresent();
        Assert.assertTrue(isFabButtonPresent);
    }

    @Test
    public void loginSuccessModel(){
        new LoginScreen(driver).complexLogin(Auth.builder().email("arielle@gmail.com").password("Arielle12345$").build())
                .checkFabButtonPresent();
    }

    @Test
    public void loginNegPassword(){
        new LoginScreen(driver).complexLoginNeg(Auth.builder().email("arielle@gmail.com").password("Arielle12345*").build())
                .errorMessagePresent()
                .closeMessage();
    }

    @AfterTest (enabled = false)
    public void pastCondition(){
        new HomeScreen(driver).openMenu().logout();
    }
}

