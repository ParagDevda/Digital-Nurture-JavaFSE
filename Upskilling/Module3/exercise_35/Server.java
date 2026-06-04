package Upskilling.Module3.exercise_35;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server Started");

        Socket socket = serverSocket.accept();

        BufferedReader br = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

        String msg = br.readLine();
        System.out.println("Client: " + msg);

        pw.println("Hello Client");

        socket.close();
        serverSocket.close();
    }
}