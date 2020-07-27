import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(888);
        byte[] b = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(b, b.length);
        datagramSocket.receive(datagramPacket);
        System.out.println(new String(b, 0, datagramPacket.getLength()));
        datagramSocket.close();
    }
}
