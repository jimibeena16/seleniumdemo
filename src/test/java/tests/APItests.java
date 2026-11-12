package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APItests {

    @Test
    public void apiTestingDemo() {

        RestAssured.baseURI = "https://reqres.in";
        RestAssured.useRelaxedHTTPSValidation();

        //----------------------------------------------------
        // GET Request
        //----------------------------------------------------

        System.out.println("===== GET REQUEST =====");

        Response getResponse =
                given()
                    .header("x-api-key", "reqres-free-v1")
                    .queryParam("page", 2)
                .when()
                    .get("/api/users")
                .then()
                    .statusCode(200)
                    .body("page", equalTo(2))
                    .extract()
                    .response();

        System.out.println(getResponse.asPrettyString());


        //----------------------------------------------------
        // POST Request
        //----------------------------------------------------

        System.out.println("===== POST REQUEST =====");

        String postBody = "{\n" +
                "  \"name\":\"Jimi\",\n" +
                "  \"job\":\"QA Engineer\"\n" +
                "}";

        Response postResponse =
                given()
                    .header("Content-Type","application/json")
                    .body(postBody)
                .when()
                    .post("/api/users")
                .then()
                    .statusCode(201)
                    .body("name", equalTo("Jimi"))
                    .extract()
                    .response();

        System.out.println(postResponse.asPrettyString());


        //----------------------------------------------------
        // PUT Request
        //----------------------------------------------------

        System.out.println("===== PUT REQUEST =====");

        String putBody = "{\n" +
                "  \"name\":\"Jimi Updated\",\n" +
                "  \"job\":\"Senior QA\"\n" +
                "}";

        given()
            .header("Content-Type","application/json")
            .body(putBody)
        .when()
            .put("/api/users/2")
        .then()
            .statusCode(200)
            .body("name", equalTo("Jimi Updated"));



        //----------------------------------------------------
        // PATCH Request
        //----------------------------------------------------

        System.out.println("===== PATCH REQUEST =====");

        String patchBody = "{\n" +
                "  \"job\":\"Automation Lead\"\n" +
                "}";

        given()
            .header("Content-Type","application/json")
            .body(patchBody)
        .when()
            .patch("/api/users/2")
        .then()
            .statusCode(200)
            .body("job", equalTo("Automation Lead"));



        //----------------------------------------------------
        // DELETE Request
        //----------------------------------------------------

        System.out.println("===== DELETE REQUEST =====");

        given()
            .header("Content-Type","application/json")
        .when()
            .delete("/api/users/2")
        .then()
            .statusCode(204);
    }
}