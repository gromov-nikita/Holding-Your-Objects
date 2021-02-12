import com.sun.source.doctree.SeeTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        Set<Character> set = new HashSet<Character>();
        set.add('A');//«A», «E», «I», «O», «U», «Y»
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('Y');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('y');
        Scanner scanner = new Scanner(System.in);
        String str = "qweAfghiIffff";
        for(int i = 0; i < str.length(); i++) {
            if(set.contains(str.charAt(i))) {
                counter++;
            }
        }
        System.out.println(counter);
        FileReader file = new FileReader("D:\\2\\Holding-Your-Objects\\16)\\src\\read.txt");
        int fsize = 0;
        while(file.read() != -1) {
            fsize++;
        }
        System.out.println(fsize);
        file.close();
        char [] array = new char[fsize];
        file = new FileReader("D:\\2\\Holding-Your-Objects\\16)\\src\\read.txt");
        file.read(array);
        for(int i = 0; i < array.length; i++) {
            if(set.contains(array[i])) {
                fcounter++;
            }
        }
        System.out.println(fcounter);
        file.close();
    }

}
