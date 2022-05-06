package dia1;

import java.util.Scanner;
public class BadProduct {
    public static boolean badP(int[] products, int limit) {
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i];
        }
        if (sum < limit) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int limit = in.nextInt();
        System.out.println(badP(nums, limit));
    }
}