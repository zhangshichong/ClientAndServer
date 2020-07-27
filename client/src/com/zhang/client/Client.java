package com.zhang.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 9000);

        OutputStream os = client.getOutputStream();
        Scanner sc = new Scanner(System.in);
        while (true){
            String string = sc.nextLine();
            if(string.equals("bye")) {
                os.write("z".getBytes());
                os.close();
                client.close();
                break;
            }
            os.write(string.getBytes());
            os.write("\n".getBytes());
        }
    }
}
