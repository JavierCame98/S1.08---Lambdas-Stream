package S0812;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilterByOAndSize {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("Cama");
        list.add("Polo");
        list.add("Caramelo");
        list.add("Elefante");

        List<String> oLists = filterByLetterOANdSize(list);
        System.out.print(oLists);
    }

    public static List<String> filterByLetterOANdSize (List<String> originalList){
        if(originalList == null){
            return Collections.emptyList();
        }
        List<String> streamList = originalList.stream()
                .filter(s -> s.contains("o"))
                .filter(s -> s.length() > 5)
                .toList();
        return streamList;
    }
}
