package test.m01_Breeds;

import base.Hooks;
import endpoints.Breeds_EP;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Log4j2;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;


public class getBreedsTest extends Hooks {

    Logger logger = LogManager.getLogger(Log4j2.class);

    @Test(testName = "M01-TC01 GET the first 3 of the Breeds list with limit 3 and response status is 200",
            groups = {"Positive", "Regression"})
    public void getBreeds_TC01() {

        response = Breeds_EP.getBreeds(3);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();

        logger.info("getBreeds_TC01() is done successfully");
    }


    @Test(testName = "M01-TC02 GET the first 11 of the Breeds list with limit 11 and response status is 200", groups = {"Positive", "Regression"})
    public void getBreeds_TC02() {

        response = Breeds_EP.getBreeds(11);
        response.then()
                .statusCode(200)
                .time(lessThan(2000L));
        response.prettyPeek();
        logger.info("getBreeds_TC02() is done successfully");
    }

    @Test(testName = "M01-TC03 GET the first 33 of the Breeds list with limit 33 and response status is 200", groups = {"Positive", "Regression"})
    public void getBreeds_TC03() {

        response = Breeds_EP.getBreeds(33);
        response.then()
                .statusCode(200)
                .time(lessThan(2000L));
        response.prettyPeek();
        logger.info("getBreeds_TC03() is done successfully");
    }


    @Test(testName = "M01-TC04 GET the first 66 of the Breeds list with limit 66 and response status is 200", groups = {"Positive", "Regression"})
    public void getBreeds_TC04() {

        response = Breeds_EP.getBreeds(66);
        response.then()
                .statusCode(200)
                .time(lessThan(2000L));
        response.prettyPeek();
        logger.info("getBreeds_TC04() is done successfully");
    }

    @Test(testName = "M01-TC05 GET the first 99 of the Breeds list with limit 99 and response status is 200", groups = {"Positive", "Regression"})
    public void getBreeds_TC05() {

        response = Breeds_EP.getBreeds(99);
        response.then()
                .statusCode(200)
                .time(lessThan(2000L));
        response.prettyPeek();
        logger.info("getBreeds_TC05() is done successfully");
    }

    @Test(testName = "M01-TC06 GET the first 15 of the Breeds list with limit 0 and response status is 200", groups = {"Positive", "Regression"})
    public void getBreeds_TC06() {

        response = Breeds_EP.getBreeds(0);
        response.then()
                .statusCode(200)
                .time(lessThan(2000L));
        response.prettyPeek();
        logger.info("getBreeds_TC06() is done successfully");
    }


}
