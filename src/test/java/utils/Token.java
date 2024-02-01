package utils;

import io.restassured.module.jsv.JsonSchemaValidator;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Token {


    public static String getToken() {

        String token = ConfigurationReader.get("token");

   /*     if (tokenTimeCounter() > 30) {
            getDriver().get(ConfigurationReader.get("url"));
           // getDriver().findElement(By.id("loginButton")).click();
            getDriver().findElement(By.xpath("//*[@id='username']")).sendKeys(ConfigurationReader.get("email"));
            getDriver().findElement(By.xpath("//*[@id='password']")).sendKeys(ConfigurationReader.get("password"), Keys.ENTER);
            getDriver().navigate().to(ConfigurationReader.get("tokenURL"));
            String text = getDriver().findElement(By.xpath("//pre")).getText();

            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(text, JsonObject.class);
            token = jsonObject.get("access_token").getAsString();

            closeDriver();
            ConfigurationReader.set("token", token);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            ConfigurationReader.set("previousDateTime", LocalDateTime.now().format(formatter));
        }
*/
        return "Bearer " + token;
    }

    public static long tokenTimeCounter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime previousDateTime = LocalDateTime.parse(ConfigurationReader.get("previousDateTime"), formatter);
        LocalDateTime currentDateTime = LocalDateTime.now();
        Duration duration = Duration.between(previousDateTime, currentDateTime);
        return duration.toMinutes();
    }


    // Shema Validation Method

    public static JsonSchemaValidator schemaValidator(String path) throws IOException {
        JsonSchemaValidator jsonSchemaValidator = JsonSchemaValidator.matchesJsonSchemaInClasspath(path);
        return jsonSchemaValidator;
    }

}
