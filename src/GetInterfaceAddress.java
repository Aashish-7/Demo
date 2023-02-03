import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class GetInterfaceAddress {
    public static void main(String[] args) throws SocketException {

        System.setProperty("java.net.preferIPv4Stack", "true");
        Enumeration<NetworkInterface> interfaceEnumeration = NetworkInterface.getNetworkInterfaces();

        while (interfaceEnumeration.hasMoreElements()){
            NetworkInterface anInterface = interfaceEnumeration.nextElement();
            Enumeration<InetAddress> addressEnumeration = anInterface.getInetAddresses();
            if(addressEnumeration.hasMoreElements()){
                System.out.println("******************");
                System.out.println("name :"+ anInterface.getName());
                System.out.println("displayName :"+anInterface.getDisplayName());
                while (addressEnumeration.hasMoreElements()){
                    InetAddress address = addressEnumeration.nextElement();
                    System.out.println("address :" +address);
                    System.out.println("hostName :" +address.getHostName());
                    System.out.println("hostAddress :" +address.getHostAddress());
                }
            }
        }
    }
}

//To get IPv6 addresses, comment the line
//System.setProperty("java.net.preferIPv4Stack","true");
