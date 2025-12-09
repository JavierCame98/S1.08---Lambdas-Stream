package S0811;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("Cama");
        list.add("Polo");

        List<String> oLists = filterByLetterO(list);
        System.out.print(oLists);
    }

    public static List<String> filterByLetterO (List<String> originalList){
        if(originalList == null){
            return Collections.emptyList();
        }
        List<String> streamList = originalList.stream()
                .filter(s -> s.contains("o"))
                .toList();
        return streamList;
    }
}
