package lab7;

import com.sun.security.jgss.GSSUtil;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class MyClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",7777);
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());

        try {
            for (int i = 0; i < 3; i++) {
                outputStream.writeUTF("Time");
                System.out.println(i + 1 + " RESPONSE FROM SERVER: " + inputStream.readUTF());

                Thread.sleep(5000);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}