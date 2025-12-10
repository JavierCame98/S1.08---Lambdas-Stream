package S0813;

import java.util.List;

public class MonthList {

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

        MonthsList.forEach(month -> System.out.println(month));
    }




}
