import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.*;

/*
Exercise 16: (5) Create a Set of the vowels. Working from UniqueWords.Java, count
and display the number of vowels in each input word, and also display the total number of
vowels in the input file.
*/
public class Runner {
    public static void main(String[] args) throws IOException {
        int counter = 0;
        int fcounter = 0;
        //Set<Character> set = new HashSet<Character>();
        String vowels= "AEIOUYaeiouy";
        char [] set = vowels.toCharArray();//«A», «E», «I», «O», «U», «Y»
        String str = "qweAfghiIffffy";
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < set.length; j++) {
                if (set[j] == str.charAt(i)) {
                    counter++;
                    break;
                }
            }
        }
        System.out.println(counter);
        try {
            FileReader file = new FileReader("src\\read.txt");
            List<Character> list = new ArrayList<>();
            int save = file.read();
            while(save != -1) {
                list.add((char)save);
                save = file.read();
            }
            System.out.println(list.size());
            Iterator<Character> it = list.iterator();
            char saveC;
            while(it.hasNext()) {
                saveC = it.next();
                for(int j = 0; j < set.length; j++) {
                    if (set[j] == saveC) {
                        fcounter++;
                        break;
                    }
                }
            }
            System.out.println(fcounter);
            file.close();
        }
        catch(FileNotFoundException t) {
            System.err.println("File not found");
        }
    }
}
