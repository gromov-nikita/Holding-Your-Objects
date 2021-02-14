import java.util.*;

/*
Exercise 18: (3) Fill a HashMap with key-value pairs. Print the results to show
ordering by hash code. Extract the pairs, sort by key, and place the result into a
LinkedHashMap. Show that the insertion order is maintained
 */
public class Runner {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(21,"Nick");
        map.put(20,"Hanna");
        map.put(34,"Illa");
        map.put(40,"Sasha");
        System.out.println(map.toString());
        Map<Integer,String> lMap = new LinkedHashMap<Integer, String>(new TreeMap<Integer, String>(map));
        System.out.println(lMap.toString());
    }
}
