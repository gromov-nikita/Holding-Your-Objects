import java.util.*;

public class Iterators {
    private Vector<Str> vector = new Vector<Str>();
    private List<Str> arrayList = new ArrayList<Str>();
    private List<Str> linkedList = new LinkedList<Str>();
    private ArrayDeque<Str> arrayDeque = new ArrayDeque<Str>();
    public void addVector(Str x) {
        vector.add(x);
    }
    public void addArrayList(Str x) {
        arrayList.add(x);
    }
    public void addLinkedList(Str x) {
        linkedList.add(x);
    }
    public void addArrayDeque(Str x) {
        arrayDeque.addFirst(x);
    }
    public void addBackArrayDeque(Str x) {
        arrayDeque.addLast(x);
    }
    public Iterator<Str> getIteratorVector() {
        return vector.iterator();
    }
    public Iterator<Str> getIteratorArrayList() {
        return arrayList.iterator();
    }
    public Iterator<Str> getIteratorLinkedList() {
        return linkedList.iterator();
    }
    public Iterator<Str> getIteratorArrayDeque() {
        return arrayDeque.iterator();
    }
    public void print (Iterator<Str> it) {
        while(it.hasNext()) {
            System.out.print(it.next().toString() + " ");
        }
        System.out.println();
    }
}
