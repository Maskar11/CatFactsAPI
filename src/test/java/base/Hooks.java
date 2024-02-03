package base;

import io.restassured.RestAssured;
import org.example.Log4j2;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.Driver;
import utils.ConfigurationReader;
import utils.Token;

public class Hooks extends BaseClass {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = ConfigurationReader.get("url");
        token = Token.getToken();
    }


    @BeforeMethod
    public void setUpMethod() {
        Log4j2.startLogger(this.getClass().getSimpleName());
    }


    @AfterMethod
    public void tearDownMethod() {
        Log4j2.endLogger(this.getClass().getSimpleName());
    }


    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }

}
