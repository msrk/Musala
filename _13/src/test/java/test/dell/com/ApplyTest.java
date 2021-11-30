package test.dell.com;

import model.dell.com.Register;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplyTest extends  BaseTest {
    @Test()
    public void job() {
        try {

            Register register = new Register("Register.json", driver);
            register.apply();
            driver.close();

        } catch (Exception e) {

            Assert.assertTrue(false);

        }

    }
}
