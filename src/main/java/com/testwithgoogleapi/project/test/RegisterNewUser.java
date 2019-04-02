package com.testwithgoogleapi.project.test;


import com.testwithgoogleapi.project.base.BaseTest;
import com.testwithgoogleapi.project.pages.HomePage;
import org.junit.Test;

import java.io.IOException;

public class RegisterNewUser extends BaseTest {

    /**
     * Register new user
     * Confirm registration
     */
    @Test
    public void testRegisterNewUser() {

        // Open site
        HomePage homePage = openSite();
        log("Opened site");

        // Click 'Register new user'
        homePage.clickRegisterNewUser();
        log("Clicked 'Register new user'");

        // Register new user
        try {
            homePage.registerNewUser();
        } catch (IOException e) {
            e.printStackTrace();
        }
        log("Registered new user");

        // Verify that registration is ok
        homePage.verifyRegistration();
        log("Verified registration");
    }

}
