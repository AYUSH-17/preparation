package src.test.api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class TestApi {
    public static void main(String[] args) {
      Response res =  RestAssured.given().baseUri("https://jsonplaceholder.typicode.com").when().get("/posts/1")
                .then().extract().response();

        JsonPath jpath=new JsonPath(res.asString());
        System.out.println(jpath.getString("title"));

        System.out.println(res.asString());
    }

}
