import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static void plusMinus(int[] arr) {
        double size = arr.length;
        double posNums = 0, negNums = 0, numZeros = 0;
        for(int i = 0; i < size; i++) {
            if(arr[i] > 0) {
                posNums++;
            }
            else if(arr[i] < 0) {
                negNums++;
            }
            else {
                numZeros++;
            }
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(posNums/ size));
        System.out.println(df.format(negNums/ size));
        System.out.println(df.format(numZeros/ size));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
