package base;

import org.apache.logging.log4j.Logger;
import io.restassured.response.Response;
import org.example.App;
import org.testng.annotations.Listeners;



public class BaseClass extends App {

    static public String token;
    static public Response response;


}
