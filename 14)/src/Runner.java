import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
Exercise 14: (3) Create an empty LinkedList<Integer>. Using a Listlterator, add
Integers to the List by always inserting them in the middle of the List.
 */
public class Runner {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        ListIterator<Integer> lit = list.listIterator(0);
        for(int i = 0; i < 10; i++) {
            list.add(lit.nextIndex(),i);
        }
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
