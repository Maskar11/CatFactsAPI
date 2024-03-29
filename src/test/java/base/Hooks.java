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
    public void setUpClass() {
        RestAssured.baseURI = ConfigurationReader.get("url");
        token = Token.getToken();

        Log4j2.startLoggerClass(this.getClass().getSimpleName());
    }

    @BeforeMethod
    public void startLoggerMethod() {
        Log4j2.startLoggerMethod(this.getClass().getSimpleName());
    }

    @AfterMethod
    public void endLoggerMethod() {
        Log4j2.endLoggerMethod(this.getClass().getSimpleName());
    }

    @AfterClass
    public void tearDownClass() {
        Log4j2.endLoggerClass(this.getClass().getSimpleName());

        Driver.closeDriver();
    }

}
