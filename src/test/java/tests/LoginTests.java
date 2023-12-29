package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void preCondition(){
        if(app.getHelperUser().isLogged()){
            app.getHelperUser().logout();
        }

    }

    @Test
    public void loginSuccess(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("ret@het.com", "Qc$123456");
        app.getHelperUser().submitLogin();

        Assert.assertTrue(app.getHelperUser().isLogged());

//        Assert.assertEquals();
//        Assert.assertTrue();
//        Assert.assertNotEquals();
//        Assert.assertFalse();


    }
}
