package com.zhang.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("server is running on port 9000");
        ServerSocket server = new ServerSocket(9000);

        Socket socket = server.accept();

        InputStream is = socket.getInputStream();

        int b = 0;
        while ((b = is.read()) != -1){
            System.out.print((char) b);
        }
        while (true){
            if(is.read() == 'z'){
                is.close();
                socket.close();
                server.close();
                break;
            }
            System.out.print((char) is.read());
        }
        is.close();
        socket.close();
        server.close();

    }
}
