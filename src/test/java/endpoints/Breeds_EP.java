package endpoints;

import base.BaseClass;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static base.BaseClass.token;
import static io.restassured.RestAssured.given;

public class Breeds_EP {

    private static final String GET_BREEDS = "/breeds";


    public static Response getBreeds(int limit) {

        Response response = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParam("limit", limit)
                .header("Authorization", BaseClass.token)
                .when()
                .log().all()
                .get(GET_BREEDS);
        return response;
    }

}
