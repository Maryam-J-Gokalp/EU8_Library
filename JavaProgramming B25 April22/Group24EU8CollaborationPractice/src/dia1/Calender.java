package dia1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Calender {
    public static void main (String[] args) {

        // calculate 27mese
        List<Integer> list = new ArrayList<>();
        long startTime;
        long endTime;
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        startTime = Calendar.getInstance().getTimeInMillis();
        int size = list.size();
        for (int j = 0; j < size; j++) {
            int a = list.get(j);
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("By calculating collection.size() first :: " + (endTime - startTime) + " ms");


    }
}
