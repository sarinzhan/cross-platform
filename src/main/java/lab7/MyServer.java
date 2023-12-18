package lab7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(7777);
        System.out.println("Server is running");
        Socket socket = server.accept();
        System.out.println("Cleint have connected to the server: " + socket.toString());

        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        DataInputStream input = new DataInputStream(socket.getInputStream());
        String req = input.readUTF();
        while (!req.equals("")) {
            System.out.println("Cliean request: " + req);
            output.writeUTF(LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
            req = input.readUTF();
        }


    }

}