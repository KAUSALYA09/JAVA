/*
    We use the integers a, b, and n to create the following series:

    (a + 2^0 * b), (a + 2^0 * b + 2^1 * b), ...... , (a + 2^0 * b + 2^1 * b + ... + 2^n-1 * b)

    You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.

    Input Format

    The first line contains an integer, q, denoting the number of queries.
    Each line i of the q subsequent lines contains three space-separated integers describing the respective a, b, and n values for that query.

    Constraints:
    0 <= q <= 500
    0 <= a, b <= 50
    1 <= n <= 15

    Output Format

    For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

    Sample Input:

    2
    0 2 10
    5 3 5

    Sample Output:

    2 6 14 30 62 126 254 510 1022 2046
    8 14 26 50 98
*/

import java.util.*;
import java.lang.Math;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of queries");
        int q = sc.nextInt();
        for (int i = 0; i <= q; i++) {
            System.out.println("Enter a value-");
            int a = sc.nextInt();
            System.out.println("Enter b value-");
            int b = sc.nextInt();
            System.out.println("Enter n value-");
            int n = sc.nextInt();

                int series[] = new int[n];
            series[0] = (int) (a + (Math.pow(2, 0) * b));
            for (int j = 1; j < n; j++) {
                series[j]=series[j-1]+(int)(Math.pow(2, j) * b);
            }
            for(int k=0;k<series.length;k++){
                System.out.print(series[k]+" ");
            }
            System.out.println();
        }
    }
}
