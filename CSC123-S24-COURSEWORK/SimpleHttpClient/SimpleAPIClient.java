import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class SimpleAPIClient {

    public static void main(String[] args) throws Exception {
        // STEP 1 - Use scanner class to ask for Input (customer id)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();

        // STEP 2 - Use SimpleJson Library to create a Json document
        String json = "{\"cust_id\":\"" + customerId + "\"}";

        // STEP 3 - Invoke the document on the API given below
        HttpResponse<String> res = invokeAPI(json);

        // STEP 4 - Print results
        System.out.println("Status Code: " + res.statusCode());
        System.out.println("Response Body: " + res.body());
        System.out.println("Headers: " + res.headers().map());
    }

    public static HttpResponse<String> invokeAPI(String json) throws Exception {
        // STEP 1 - Build HTTP Request
        HttpRequest.Builder builder = HttpRequest.newBuilder();
        builder.uri(URI.create("https://e3m1dkivq8.execute-api.us-west-1.amazonaws.com/Production/get-record"));

        builder.POST(HttpRequest.BodyPublishers.ofString(json));

        builder.setHeader("x-api-key", "RdOufnPVRh7ns4WzLWk509UFrx9nL9aZ2jFBDMP5");

        HttpRequest req = builder.build();

        // STEP 2 - Send HTTP Request
        HttpClient client = HttpClient.newHttpClient();

        // Step 3 - Receive HTTP Response
        return client.send(req, BodyHandlers.ofString());
    }
}
