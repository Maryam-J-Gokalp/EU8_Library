package dia1;

import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3(num);
    }
    public static void next3(int num){
        int next1 = num+1,
                next2 = num+2,
                next3 = num+3;
        System.out.println("next 3 are:");
        System.out.println(next1+" "+next2+" "+next3);

    }


}