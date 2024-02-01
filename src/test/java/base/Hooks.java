package base;

import io.restassured.RestAssured;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Driver;
import utils.ConfigurationReader;
import utils.Token;

public class Hooks extends BaseClass {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = ConfigurationReader.get("url");
        token = Token.getToken();
    }


    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }

}
