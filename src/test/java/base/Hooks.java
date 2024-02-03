package base;

import io.restassured.RestAssured;
import org.example.Log4j2;
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
        Log4j2.startLog(this.getClass().getSimpleName());
    }


    @AfterClass
    public void tearDown() {
        Log4j2.endLog(this.getClass().getSimpleName());
        Driver.closeDriver();
    }

}
