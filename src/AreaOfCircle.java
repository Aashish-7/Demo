import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        double pii = 3.14159;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the redius of circle");
        double redius = scanner.nextDouble();
        double areaofCircle = pii * Math.pow(redius,2);
        System.out.println(areaofCircle);
    }
}
