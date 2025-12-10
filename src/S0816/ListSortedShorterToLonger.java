package S0816;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListSortedShorterToLonger {

    public static void main(String[] args) {

        List<Object> mixtList = new ArrayList<>();
        mixtList.add("Hola");
        mixtList.add(1);
        mixtList.add("Macarron");
        mixtList.add(34);
        mixtList.add("Salamandra");
        mixtList.add(123456789);



        List<Object> sortedList = mixtList.stream().sorted(Comparator.comparingInt(
                item -> {
                    String allToString;
                    if(item instanceof String){
                        allToString = (String) item;
                    }else if(item instanceof Integer){
                        allToString = String.valueOf(item);
                    }else{
                        return 0;
                    }
                    return allToString.length();
                }
        )).collect(Collectors.toList());


        System.out.println(sortedList);

    }


}
