package test.m02_Facts;

import base.Hooks;
import endpoints.Facts_EP;
import org.example.App;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class getFactsTest extends Hooks {

    Logger logger = LogManager.getLogger(App.class);

    @Test(testName = "M02-TC19 GET list of any of the 'fact' that max_length is 25 characters and limit=3 and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFacts_TC19() {
        response = Facts_EP.getFacts(25, 3);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFacts_TC19() is done successfully");
    }


    @Test(testName = "M02-TC20 GET list of any of the 'fact' that max_length is 44 characters and limit=11 and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFacts_TC20() {
        response = Facts_EP.getFacts(44, 11);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFacts_TC20() is done successfully");
    }


    @Test(testName = "M02-T21 GET list of any of the 'fact' that max_length is 44 characters and limit=22 and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFacts_TC21() {
        response = Facts_EP.getFacts(44, 22);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFacts_TC21() is done successfully");
    }


    @Test(testName = "M02-TC22 GET list of any of the 'fact' that max_length is 88 characters and limit=44 and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFacts_TC22() {
        response = Facts_EP.getFacts(88, 44);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFacts_TC22() is done successfully");
    }


    @Test(testName = "M02-TC23 GET list of any of the 'fact' that max_length is 188 characters and limit=44 and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFacts_TC23() {
        response = Facts_EP.getFacts(188, 44);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFacts_TC23() is done successfully");
    }


    @Test(testName = "M02-TC24 GET list of any of the 'fact' that max_length is 188 characters and limit=98 and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFacts_TC24() {
        response = Facts_EP.getFacts(188, 98);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFacts_TC24() is done successfully");
    }


    @Test(testName = "M02-TC25 GET list of any of the 'fact' that max_length is 188 characters and limit=99 and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFacts_TC25() {
        response = Facts_EP.getFacts(188, 99);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFacts_TC25() is done successfully");
    }


    @Test(testName = "M02-TC26 GET list of any of the 'fact' that max_length is 387 characters and limit=99 and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFacts_TC26() {
        response = Facts_EP.getFacts(387, 99);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFacts_TC26() is done successfully");
    }


    @Test(testName = "M02-TC27 GET list of any of the 'fact' that max_length is 387 characters and limit=98 and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFacts_TC27() {
        response = Facts_EP.getFacts(387, 98);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFacts_TC27() is done successfully");
    }


    @Test(testName = "M02-TC28 GET list of any of the 'fact' that max_length is 387 characters and limit=200 and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFacts_TC28() {
        response = Facts_EP.getFacts(387, 200);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFacts_TC28() is done successfully");
    }


    @Test(testName = "M02-TC29 GET list of any of the 'fact' that max_length is 387 characters and limit=332 and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFacts_TC29() {
        response = Facts_EP.getFacts(387, 332);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFacts_TC29() is done successfully");
    }


    @Test(testName = "M02-TC30 GET list of any of the 'fact' that max_length is 387 characters and limit=332 and response status is 200",
            groups = {"Positive", "Regression"})
    public void getFacts_TC30() {
        response = Facts_EP.getFacts(387, 387);
        System.out.println("Response: " + response.then().log().all());
        response.then()
                .statusCode(200);
        response.prettyPeek();
        logger.info("getFacts_TC30() is done successfully");
    }

}
