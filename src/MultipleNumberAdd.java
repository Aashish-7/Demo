import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class MultipleNumberAdd {

    static void sum(int... num){
        int sum = 0;
        for (int i : num){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers !!");
        int ints = 0;
        while (ints == Integer.parseInt(scanner.nextLine())){
            ints = scanner.nextInt();
        }        MultipleNumberAdd.sum(ints);
    }
}
