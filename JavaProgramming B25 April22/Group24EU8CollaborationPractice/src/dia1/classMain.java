package dia1;

import java.util.Arrays;
import java.util.Scanner;


import java.util.Scanner;
import java.util.Arrays;

class classMain {
    public static void add_to_r(int[] r,int n) {
        //create new array with one more position.

        int[] arr1 = Arrays.copyOf(r,r.length+1);
        arr1[arr1.length-1]=n;
        System.out.println(Arrays.toString(arr1));

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i <=size-1; i++){
            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);

    }
}


