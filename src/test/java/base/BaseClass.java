package base;

import org.apache.logging.log4j.Logger;
import io.restassured.response.Response;
import org.example.Log4j2;
import org.testng.annotations.Listeners;



public class BaseClass extends Log4j2 {

    static public String token;
    static public Response response;


}
