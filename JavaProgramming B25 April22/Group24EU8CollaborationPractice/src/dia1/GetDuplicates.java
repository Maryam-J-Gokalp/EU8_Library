package dia1;

import java.util.Scanner;

public class GetDuplicates {

    public static int getDup(String[] r) {
        String duplicates = "";

        int i = 0;
        int countTotal = 0;
        for (String s : r) {
            int count = 0;
            for (String s1 : r) {
                if ((s == s1 || s.equals(s1))) {
                    count++;
                }
            }
            if (count >= 2) {
                duplicates += s + " ";
            }
        }
        duplicates = duplicates.trim();
        String[] arr = duplicates.split(" ");
        countTotal = arr.length;
        return countTotal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }

}