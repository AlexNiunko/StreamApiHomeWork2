import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String [] array={"Alex","Alexandr","Azx","Warfolkd","Ydfla","Yfr??@s","ale^^xa"};
        TreeSet<String> treeSet = Arrays.stream(array)
                .map(str -> str.toLowerCase().trim().replaceAll("[^A-Za-zА-Яа-я]", ""))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);

    }
}
