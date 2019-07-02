import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static void staircase(int n) {
        char[] arr = new char[n];
        for(int i = 0; i < n; i++) {
            arr[i] = ' ';
        }

        for(int i = n-1; i >= 0; i--) {
            arr[i] = '#';
            for(int j = 0; j < n; j++) {
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
