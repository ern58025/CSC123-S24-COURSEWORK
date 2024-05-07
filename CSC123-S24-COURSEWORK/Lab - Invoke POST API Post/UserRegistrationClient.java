import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class UserRegistrationClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter user information:");
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("City: ");
            String city = scanner.nextLine();
            System.out.print("School: ");
            String school = scanner.nextLine();
            


            String json = "{\"cust_id\":\"" + userId() + "\","
                          + "\"first_name\":\"" + firstName + "\","
                          + "\"last_name\":\"" + lastName + "\","
                          + "\"email\":\"" + email + "\","
                          + "\"city\":\"" + city + "\","
                          + "\"school\":\"" + school + "\",";                         

            try {
                HttpResponse response = invokeAPI(json);

                if (response.statusCode() == 200) {
                    System.out.println("User registration successful!");
                } else {
                    System.out.println("Error: Failed to register user. HTTP status code: " + response.statusCode());
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Do you want to register another user? (yes/no): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }

    private static String userId() {
        return "unique_id"; 
    }
    public static HttpResponse invokeAPI(String url) throws Exception {

		// STEP 1 - Build HTTP Request
		HttpRequest.Builder builder = HttpRequest.newBuilder();
		builder.uri(URI.create(url));
		builder.GET();
		
		
		builder.setHeader("X-RapidAPI-Key", "8bd2a7169amsh407ba58b10b6967p1f555ejsn7bd01ded4340");
		builder.setHeader("X-RapidAPI-Host", "weatherapi-com.p.rapidapi.com");
			
		
		HttpRequest req = builder.build();


		HttpClient client = HttpClient.newHttpClient();


		return client.send(req, BodyHandlers.ofString());

	}

}
