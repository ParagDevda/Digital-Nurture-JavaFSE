package Upskilling.Module3.exercise_36;

import java.net.URI;
import java.net.http.*;

public class HttpClientExample {

    public static void main(String[] args) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com"))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request,
                        HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code: "
                + response.statusCode());

        System.out.println(response.body());
    }
}
