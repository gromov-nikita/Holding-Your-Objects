import com.sun.jdi.Value;
import java.awt.*;
import java.io.FileNotFoundException;
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
    public static List<String> fileReader(String s) throws IOException {
        List<String> list = new LinkedList<String>();
        FileReader file = null;
        try {
            file = new FileReader(s);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        }
        catch(FileNotFoundException t) {
            System.out.println("FileNotFoundException");
        }
        finally {
            if(file != null) {
                file.close();
            }
        }
        return list;
    }
    public static Map<String,Integer> fileCounter(List<String> list) {
        int fcounter = 0;
        Map<String,Integer> map = new HashMap<String,Integer>();
        Iterator<String> it1 = list.iterator();
        Iterator<String> it2 = list.iterator();
        String save;
        /*
        qwer ty ty qwer y u i qwerty ty qwer qwer qwer qwer
         */
        while(it1.hasNext()) {
            save = it1.next();
            if(!map.containsKey(save)) {
                fcounter = Collections.frequency(list,save);
                map.put(save, fcounter);
            }
        }
        return map;
    }
    public static List<String> sortListStr(List<String> list) {
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;
    }
    public static void main(String[] args) throws IOException {
        Map<String,Integer> map = fileCounter(Runner.fileReader("src\\read.txt"));
        System.out.println(map.toString());
        System.out.println(map.keySet().toString());
        List<String> list = sortListStr(new ArrayList<String>(map.keySet()));
        System.out.println(list.toString());
    }
}

