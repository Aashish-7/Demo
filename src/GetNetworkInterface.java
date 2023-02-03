import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.stream.Collectors;

public class GetNetworkInterface {

    public static void main(String[] args) throws SocketException {

        Enumeration<NetworkInterface> interfaceEnumeration = NetworkInterface.getNetworkInterfaces();

        while (interfaceEnumeration.hasMoreElements()){
            NetworkInterface networkInterface = interfaceEnumeration.nextElement();
            System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*");
            System.out.println("interface name :" + networkInterface.getName());
            System.out.println("interface display name :" + networkInterface.getDisplayName());
            System.out.println("getInterface address :" + networkInterface.getInterfaceAddresses());
            System.out.println("subInterface :" + networkInterface.getSubInterfaces());
            System.out.println("MTU size :" +networkInterface.getMTU());
            System.out.println("Index size :" +networkInterface.getIndex());
//            byte[] macAddress = networkInterface.getHardwareAddress();
//            System.out.println(Arrays.toString(macAddress));
            System.out.println("Hardware address :" + Arrays.toString(networkInterface.getHardwareAddress()));
            System.out.println("next Inet address name  :" +networkInterface.getInetAddresses().nextElement().getHostAddress());
            System.out.println("inetAddress :" +networkInterface.inetAddresses());
            System.out.println("get Parent :" +networkInterface.getParent());
            System.out.println("loopBack Interface :" +networkInterface.isLoopback());


            Enumeration<NetworkInterface> interfaceEnumeration1 = networkInterface.getSubInterfaces();
            for (NetworkInterface networkInterface1 : Collections.list(interfaceEnumeration1)){
                System.out.println("subInterface name :" + networkInterface1.getName());
                System.out.println("subInterface displayName : " + networkInterface1.getDisplayName());
            }
        }
        System.out.println("***********");
        NetworkInterface anInterface = NetworkInterface.getByName("wlp0s20f3");
        System.out.println(anInterface);
    }
}
