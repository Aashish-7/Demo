import java.util.ArrayList;
import java.util.List;

public class Genrics<T> {

    private  T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        /*List<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add(1);

        for (Object o : list){
            System.out.println(o);
        }
        System.out.println(list.get(1));*/

        Genrics<String> stringGenrics = new Genrics<>();
        stringGenrics.setT("Hello");
        System.out.println(stringGenrics.getT());

        Genrics genrics = new Genrics();
        genrics.setT("Jadu");
        genrics.setT(1);
        genrics.setT("Again");

        System.out.println(genrics.t);

    }
}
