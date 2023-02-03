import java.net.NetworkInterface;

public class GenricsMethods<E> {

    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public <T> boolean isEqual(GenricsMethods<E> genrics1, GenricsMethods<E> genrics2){
        return genrics1.getE().equals(genrics2.getE());
    }

    public static void main(String[] args) {
        GenricsMethods<String> stringGenrics = new GenricsMethods<>();
        stringGenrics.setE("Java");

        GenricsMethods<String> genrics = new GenricsMethods<>();
        genrics.setE("Java");


        GenricsMethods genricsMethods = new GenricsMethods();

        boolean b = genricsMethods.isEqual(stringGenrics,genrics);
        System.out.println(b);
    }
}
