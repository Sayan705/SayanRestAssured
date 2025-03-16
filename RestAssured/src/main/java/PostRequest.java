import org.junit.jupiter.api.Test;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PostRequest {


    public void postRequest(){

        baseURI="http://localhost:3000/student";

        PayLoad pl = new PayLoad();

//        HashMap data=new HashMap();
//
//        data.put("name", "Sayan");
//        data.put("job",  "leader");

        given()
                .contentType("application/json")
                .body(PayLoad.payLoad().toString())

                .when()
                .post()

                .then()
                .log()
                .all();
    }
}
