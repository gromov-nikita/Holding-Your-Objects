/*
Exercise 11: (2) Write a method that uses an Iterator to step through a Collection and
print the toString( ) of each object in the container. Fill all the different types of
Collections with objects and apply your method to each container.
 */
public class Runner {
    public static void main(String[] args) {
        Iterators obj = new Iterators();
        for(int i = 0; i < 10; i++) {
            obj.addVector(i);
            obj.addArrayList(i);
            obj.addLinkedList(i);
            obj.addArrayDeque(i);
            obj.addBackArrayDeque(i);
        }
        System.out.println("Vector");
        obj.print(obj.getIteratorVector());
        System.out.println("ArrayList");
        obj.print(obj.getIteratorArrayList());
        System.out.println("LinkedList");
        obj.print(obj.getIteratorLinkedList());
        System.out.println("Array Deque");
        obj.print(obj.getIteratorArrayDeque());
    }
}
