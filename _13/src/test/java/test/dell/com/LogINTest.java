package test.dell.com;

import model.dell.com.Purchase;
import model.dell.com.Register;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;

public class LogINTest extends BaseTest{



    @DataProvider(name = "dp",parallel=true)
    public Object[][] dp1() {
        testData = new Object[][] {
                new Object[] { "test@test" },
                new Object[] { "btest@test" },
                new Object[] { "itest@test" },
                new Object[] { "chtest@test" },
                new Object[] { "ntest@test" }

        };
        return testData;
    }



    @Test(dataProvider = "dp")
    public void registerAUser(String mail) {
        try {

            Register register = new Register("Register.json", driver);
            register.fillForm(mail);


        } catch (Exception e) {
            Assert.assertTrue(false);

        }
        driver.close();

    }
}
