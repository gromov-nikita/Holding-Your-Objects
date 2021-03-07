import java.util.*;

public class Iterators {
    private Vector<Integer> vector = new Vector<Integer>();
    private List<Integer> arrayList = new ArrayList<Integer>();
    private List<Integer> linkedList = new LinkedList<Integer>();
    private ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
    public void addVector(Integer x) {
        vector.add(x);
    }
    public void addArrayList(Integer x) {
        arrayList.add(x);
    }
    public void addLinkedList(Integer x) {
        linkedList.add(x);
    }
    public void addArrayDeque(Integer x) {
        arrayDeque.addFirst(x);
    }
    public void addBackArrayDeque(Integer x) {
        arrayDeque.addLast(x);
    }
    public Iterator<Integer> getIteratorVector() {
        return vector.iterator();
    }
    public Iterator<Integer> getIteratorArrayList() {
        return arrayList.iterator();
    }
    public Iterator<Integer> getIteratorLinkedList() {
        return linkedList.iterator();
    }
    public Iterator<Integer> getIteratorArrayDeque() {
        return arrayDeque.iterator();
    }
    public void print (Iterator<Integer> it) {
        while(it.hasNext()) {
            System.out.print(it.next().toString() + " ");
        }
        System.out.println();
    }
}
