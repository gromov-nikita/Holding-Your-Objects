import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sequence {
    private List<Object> items = new ArrayList<Object>();
    public void add(Object x) {
        items.add(x);
    }

    public Iterator<Object> getIterator() {
        return items.iterator();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Iterator<Object> it = sequence.getIterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}