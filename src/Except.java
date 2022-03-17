import java.util.ArrayList;
import java.util.List;

public class Except {

    public static void main(String[] args) {

        List<String> coll = new ArrayList<>();

        coll.add(0, "BMW");
        coll.add(1, "Audi");
        coll.add(2, "Opel");

        for (Object o : coll) {
            System.out.println(o);
        }

        try {
            coll.set(3, "Lamborghini");
        } catch (IndexOutOfBoundsException i) {
            System.out.println("Exception handled");
        }
    }
}
