import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<HeavyBox> heavyBox1 = new ArrayList<>();
        ArrayList<HeavyBox> heavyBox2 = new ArrayList<>();

        HeavyBox box1 = new HeavyBox(250);
        HeavyBox box2 = new HeavyBox(400);
        HeavyBox box3 = new HeavyBox(100);
        HeavyBox box4 = new HeavyBox(520);
        HeavyBox box5 = new HeavyBox(700);

        heavyBox1.add(box1);
        heavyBox1.add(box2);
        heavyBox1.add(box3);
        heavyBox1.add(box4);
        heavyBox1.add(box5);

        Iterator <HeavyBox> iterator = heavyBox1.listIterator();
        while (iterator.hasNext()){
            HeavyBox i = iterator.next();
            if (i.getWeight() > 300) {
                heavyBox2.add(i);
                iterator.remove();
            }
        }

        System.out.println(heavyBox1);
        System.out.println(heavyBox2);


    }
}
