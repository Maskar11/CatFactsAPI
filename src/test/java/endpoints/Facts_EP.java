package endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static base.BaseClass.token;
import static io.restassured.RestAssured.given;

public class Facts_EP {

    private static final String GET_RANDOM_FACT = "/fact";
    private static final String GET_FACTS = "/facts";


    public static Response getRandomFact(int max_length) {

        Response response = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParam("max_length", max_length)
                .header("Authorization", token)
                .when()
                .log().all()
                .get(GET_RANDOM_FACT);
        return response;
    }


    public static Response getFacts(int max_length, int limit) {

        Response response = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParams("max_length", max_length, "limit", limit)
                .header("Authorization", token)
                .when()
                .log().all()
                .get(GET_FACTS);
        return response;
    }

}
