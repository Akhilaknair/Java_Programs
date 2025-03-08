import java.net.*;
public class Qn28 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress add = InetAddress.getLocalHost();
        System.out.println("local host:" + add);
        InetAddress add1 = InetAddress.getByName("www.facebook.com");
        System.out.println("All ip addresses:" + add1); }
}
