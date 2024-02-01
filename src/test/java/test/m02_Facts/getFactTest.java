package test.m02_Facts;

import base.Hooks;
import endpoints.Breeds_EP;
import endpoints.Facts_EP;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.App;
import org.testng.annotations.Test;

public class getFactTest extends Hooks {

    Logger logger = LogManager.getLogger(App.class);

    @Test(testName = "M02-TC07 GET list of any of the 'fact' that max_length is 20 characters and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFact_TC07() {
        response = Facts_EP.getRandomFact(20);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFact_TC07() is done successfully");
    }


    @Test(testName = "M02-TC08 GET list of any of the 'fact' that max_length is 20 characters and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFact_TC08() {
        response = Facts_EP.getRandomFact(20);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFact_TC08() is done successfully");
    }


    @Test(testName = "M02-TC09 GET list of any of the 'fact' that max_length is 66 characters and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFact_TC09() {
        response = Facts_EP.getRandomFact(66);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFact_TC09() is done successfully");
    }


    @Test(testName = "M02-T10 GET list of any of the 'fact' that max_length is 66 characters and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFact_TC10() {
        response = Facts_EP.getRandomFact(66);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFact_TC10() is done successfully");
    }


    @Test(testName = "M02-TC11 GET list of any of the 'fact' that max_length is 111 characters and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFact_TC11() {
        response = Facts_EP.getRandomFact(111);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFact_TC11() is done successfully");
    }


    @Test(testName = "M02-TC12 GET list of any of the 'fact' that max_length is 111 characters and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFact_TC12() {
        response = Facts_EP.getRandomFact(111);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFact_TC12() is done successfully");
    }


    @Test(testName = "M02-TC13 GET list of any of the 'fact' that max_length is 222 characters and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFact_TC13() {
        response = Facts_EP.getRandomFact(222);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFact_TC13() is done successfully");
    }


    @Test(testName = "M02-T14 GET list of any of the 'fact' that max_length is 222 characters and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFact_TC14() {
        response = Facts_EP.getRandomFact(222);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFact_TC14() is done successfully");
    }


    @Test(testName = "M02-TC15 GET list of any of the 'fact' that max_length is 333 characters and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFact_TC15() {
        response = Facts_EP.getRandomFact(333);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFact_TC15() is done successfully");
    }


    @Test(testName = "M02-TC16 GET list of any of the 'fact' that max_length is 333 characters and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFact_TC16() {
        response = Facts_EP.getRandomFact(333);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFact_TC16() is done successfully");
    }


    @Test(testName = "M02-TC17 GET list of any of the 'fact' that max_length is 444 characters and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFact_TC17() {
        response = Facts_EP.getRandomFact(444);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFact_TC17() is done successfully");
    }


    @Test(testName = "M02-T18 GET list of any of the 'fact' that max_length is 1000 characters and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFact_TC18() {
        response = Facts_EP.getRandomFact(1000);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFact_TC18() is done successfully");
    }

}
