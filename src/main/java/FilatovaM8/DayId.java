package FilatovaM8;

//Create a method with an array list of days of the week from Sunday to Saturday.
// The method can receive a number and return the day of the week (or error).

import java.util.ArrayList;

public class DayId {



    public static String getDay(Integer dayNumber) {


        ArrayList<String> daysId = new ArrayList<>();

        daysId.add("Sunday");
        daysId.add("Monday");
        daysId.add("Tuesday");
        daysId.add("Wednesday");
        daysId.add("Thursday");
        daysId.add("Friday");
        daysId.add("Saturday");


        if (dayNumber == null) {
            throw new NullPointerException();
        }
        else if (dayNumber < 1) {
            return "The number should be equal or larger than 1";
        } else if (dayNumber > 7) {
            return "The number should be equal or smaller than 7";
        } else {
            return daysId.get(dayNumber - 1);
        }
    }
}


