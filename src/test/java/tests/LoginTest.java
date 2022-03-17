package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class LoginTest extends BaseTest{
    private static final String EMAIL = "vera30701@yandex.by";
    private static final String PASSWORD = "s5tVcGyyfmDJhiR";

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(EMAIL,PASSWORD);
        MainPage mainPage = new MainPage();
        Assert.assertEquals(mainPage.getTitleQuantity(),2,"Quantity of titles isn't expected");

    }

}
