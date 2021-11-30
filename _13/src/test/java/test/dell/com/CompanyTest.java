package test.dell.com;

import model.dell.com.Register;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CompanyTest extends  BaseTest {



    @Test()
    public void company() {
        try {
            Register register = new Register("Register.json", driver);
            register.checkCompany();
            driver.close();

        } catch (Exception e) {

            Assert.assertTrue(false);

        }

    }
}
