import com.sun.jdi.Value;

import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.security.Key;
import java.util.*;
import java.util.List;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

/*
Exercise 21: (3) Using a Map<String,Integer>, follow the form of
UniqueWords.java to create a program that counts the occurrence of words in a file. Sort
the results using Collections.sort( ) with a second argument of
String.CASE_INSENSITIVE_ORDER (to produce an alphabetic sort), and display the
result.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        int fcounter = 0;
        Map<String,Integer> map = new HashMap<String,Integer>();
        FileReader file = new FileReader("src\\read.txt");
        Scanner scanner = new Scanner(file);
        Vector<String> vector = new Vector<String>();
        while(scanner.hasNextLine()) {
            vector.add(scanner.nextLine());
        }
        file.close();
        Iterator<String> it1 = vector.iterator();
        Iterator<String> it2 = vector.iterator();
        String save;
        /*
        qwer ty ty qwer y u i qwerty ty qwer qwer qwer qwer
         */
        while(it1.hasNext()) {
            save = it1.next();
            if(!map.containsKey(save)) {
                while (it2.hasNext()) {
                    if (save.equals(it2.next())) {
                        fcounter++;
                    }
                }
                map.put(save, fcounter);
                fcounter = 0;
                it2 = vector.iterator();
            }
        }
        System.out.println(map.toString());
        //LinkedHashMap<String,Integer> lMap = new LinkedHashMap<String,Integer>(map);
        List<String> list = new ArrayList<String>(map.keySet();
        System.out.println(list.toString());
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        System.out.println(list.toString());
    }

}

