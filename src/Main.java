import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main implements Comparable<Main> {
    public static void main(String[] args) {

        int[] a = new int[]{7,100,2,4,3};

        LinkedList<Integer> integers = new LinkedList<>();
        for (int i: a){
            integers.add(i);
            System.out.println(i);
        }
        Collections.sort(integers);

        Arrays.sort(a);
        for (int i : a){
            System.out.println(i);
        }
    }

    @Override
    public int compareTo(Main o) {
        return o.compareTo(o);
    }

//    @Override
//    public int compareTo(Main o) {
//        return
//    }
}

//Collections.sort(employees);
//
//        for (Employee employee3 : employees){
//        System.out.println(employee3.id + " " + employee3.name + " " + employee3.address);
//        }
//        }
//
//@Override
//public int compareTo(Employee o) {
//        return this.id - o.id;
//        }
//        }