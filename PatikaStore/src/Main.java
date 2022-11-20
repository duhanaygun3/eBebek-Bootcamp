import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	   /*  Store patikaStore = new Store();
        patikaStore.run();*/
        //Brand brand=new Brand(1,"lwnooc");
        

        TreeSet<Integer> tree_set=new TreeSet<Integer>();


        tree_set.add(20);
        tree_set.add(1);
        tree_set.add(10);

        System.out.println(tree_set);

        Comparator comp =tree_set.comparator();
        System.out.println(comp);


    }
}
