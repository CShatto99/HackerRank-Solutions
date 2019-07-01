import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int diagonalDifference(int[][] arr) {
        int ans, sum1 = 0, sum2 = 0, counter = 0; 
        for (int i = 0; i < arr[0].length; i++) {
            counter++;
        }
        for(int i = 0; i < counter; i++) {
            for(int j = 0; j < counter; j++) {
                if(i == j) {
                    sum1 += arr[i][j];
                }
                if((i+j) == (counter-1)) {
                    sum2 += arr[i][j];
                }
            }
        }
        ans = Math.abs(sum1-sum2);
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
