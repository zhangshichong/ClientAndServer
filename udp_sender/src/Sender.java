import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Sender {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        DatagramPacket datagramPacket = null;

        while (true){
            Scanner sc = new Scanner(System.in);
            String string = sc.nextLine();
            datagramPacket = new DatagramPacket(string.getBytes(), string.getBytes().length, InetAddress.getByName("localhost"), 888);
            datagramSocket.send(datagramPacket);
        }
    }
}
