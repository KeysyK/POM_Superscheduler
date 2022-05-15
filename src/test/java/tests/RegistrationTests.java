package tests;

import configuration.AppiumConfiguration;
import org.testng.annotations.Test;
import screens.LoginScreen;

public class RegistrationTests extends AppiumConfiguration {
    @Test
    public void regSuccess(){
        int i = (int)(System.currentTimeMillis()/1000%3600);
        new LoginScreen(driver).fillEmail("arielle"+i+"@gmail.com")
                .fillPassword("Arielle12345$")
                .submitReg().skipWizard()
                .openMenu()
                .logout();
    }

    @Test
    public void loginRegSuccess(){

        new LoginScreen(driver)
                .fillEmail("arielle90@mail.ru")
                .fillPassword("Aarielle1234$")
                .submitReg()
                .skipIfWizard()
                .checkFabButtonPresent()
                .openMenu()
                .logout();
    }
}
