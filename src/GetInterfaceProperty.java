
import java.net.NetworkInterface;

public class GetInterfaceProperty {
    public static void main(String args[]) throws Exception {

        NetworkInterface anInterface = NetworkInterface.getByName("wlp0s20f3");  //lo
        System.out.println("name :" + anInterface.getName());
        System.out.println("displayName :" + anInterface.getDisplayName());
        System.out.println("isUp :" + anInterface.isUp());
        System.out.println("isLoopback :" + anInterface.isLoopback());
        System.out.println("isPointToPoint :" + anInterface.isPointToPoint());
        System.out.println("supportMulticast :" + anInterface.supportsMulticast());
        System.out.println("isVirtual :" + anInterface.isVirtual());

        byte[] macAdd =  anInterface.getHardwareAddress();
        if (macAdd != null){
            System.out.print("hardware Address : ");
            for (int i = 0; i< macAdd.length; i++){
                System.out.format("%02X%s", macAdd[i], (i < macAdd.length - 1) ? ":" : "");
            }
            System.out.println();
            System.out.println("MTU :" +anInterface.getMTU());
        }
    }
}
