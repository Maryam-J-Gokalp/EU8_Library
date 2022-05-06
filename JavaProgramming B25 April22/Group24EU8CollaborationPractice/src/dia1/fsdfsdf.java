package dia1;

import java.util.ArrayList;
import java.util.Scanner;

class TwoTimes {
    //create your method below

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer each : list){
            result.add(each);

        }
        return result;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        System.out.println(twoTimes(list));

    }

}