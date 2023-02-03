import java.util.Arrays;
import java.util.stream.DoubleStream;

public class MacAddress {
    public static void main(String[] args) {

        String macAddress = "ac:74:b1:32:5c:b7";
        String[] macAddressParts = macAddress.split(":");
//        for (String s : macAddressParts){
//            System.out.print(s + " ");
//        }
//        System.out.println();
        Byte[] bytes = new Byte[6];
        for (int i = 0; i<6; i++){
//            System.out.print(Arrays.toString(macAddressParts[i].getBytes()) + " ");
            Integer hex = Integer.parseInt(macAddressParts[i], 16);
//            System.out.print(hex + " ");
            bytes[i] = hex.byteValue();

        }
//        System.out.println();
//        System.out.println(Arrays.toString("ac".getBytes()));
        for (int i = 0; i< bytes.length; i++){
            System.out.print((byte)bytes[i] + " ");
        }
        System.out.println(MacAddress.add(12,22,16));
    }
    static double add(double... operands){
        return DoubleStream.of(operands).sum();
    }
}
