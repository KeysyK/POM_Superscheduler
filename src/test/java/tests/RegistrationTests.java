package tests;

import configuration.AppiumConfiguration;
import models.Auth;
import org.testng.annotations.Test;
import screens.LoginScreen;

public class RegistrationTests extends AppiumConfiguration {
    @Test
    public void regSuccess(){
        int i = (int)(System.currentTimeMillis()/1000%3600);
        new LoginScreen(driver)
                .complexLoginReg(Auth.builder().email("arielle"+i+"@gmail.com").password("Arielle12345$").build())
                .skipWizard()
                .checkFabButtonPresent()
                .openMenu()
                .logout();
    }

    @Test
    public void loginRegSuccess() throws InterruptedException {

        new LoginScreen(driver)
                .complexLoginReg(Auth.builder().email("arielle98@gmail.com").password("Arielle12345$").build())
                .skipIfWizard()
                .checkFabButtonPresent()
                .openMenu()
                .logout();
    }
}
