import java.util.*;

/*
Exercise 14: (3) Create an empty LinkedList<Integer>. Using a Listlterator, add
Integers to the List by always inserting them in the middle of the List.
 */
public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-1);
        list.addLast(-2);
        ListIterator<Integer> lit = list.listIterator(1);
        for(int i = 0; i < 10; i++) {
            lit.add(i);
            lit = list.listIterator(list.size()/2);
        }
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
