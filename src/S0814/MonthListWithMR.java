package S0814;

import java.util.List;

public class MonthListWithMR {

    public static void main(String[] args) {

        List<String> MonthsList = List.of("January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        );

        MonthsList.forEach(System.out::println);
    }
}
