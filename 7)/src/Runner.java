import java.util.ArrayList;
import java.util.List;

/*
Exercise 7: (3) Create a class, then make an initialized array of objects of your class. Fill
a List from your array. Create a subset of your List by using subList( ), then remove this
subset from your List.

 */
public class Runner {
    public static void main(String[] args) {
        Class [] array = new Class[5];
        array[0] = new Class();
        array[1] = new Class();
        array[2] = new Class();
        array[3] = new Class();
        array[4] = new Class();
        List<Class> list = new ArrayList<Class>();
        for(int i = 0; i < 5; i++) {
            list.add(array[i]);
        }
        System.out.println(list.size());
        List<Class> subList = list.subList(1,3);
        subList.clear();
        System.out.println(list.size());

    }
}
