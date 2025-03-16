import java.util.*;
import java.io.*;

public class PayLoad {

    public static String payLoad(){

        String requestBody1 = "{\n" +
                "    \"id\": \"6\",\n" +
                "    \"name\": \"SamratCh\",\n" +
                "    \"location\": \"India\",\n" +
                "    \"phone\": \"1234567890\",\n" +
                "    \"course\": [\n" +
                "      \"Spring\",\n" +
                "      \"Selenium\"\n" +
                "    ]\n" +
                "  }";
        return requestBody1;
    }
}
