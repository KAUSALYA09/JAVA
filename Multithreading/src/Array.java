/*Task 4:
        give an array of size n, where n is a multiple of 4,
        multiply all the numbers in block of 4 and store them in one more array using threads and create another matrix using those values
*/


import java.util.*;

class Multiplier implements Runnable {
    private int[] arr;
    private int[] multipliedArr;
    private int start;

    public Multiplier(int[] arr, int[] multipliedArr, int start) {
        this.arr = arr;
        this.multipliedArr = multipliedArr;
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i < start + (arr.length/4); i+=4) {
            multipliedArr[i/4] = arr[i] * arr[i+1] * arr[i+2] * arr[i+3];
        }
    }
}


public class Array {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int n = arr.length;
        int[] multiply = new int[n/4];
        int[][] matrix = new int[n/4][n/4];

        Thread[] threads = new Thread[4];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Multiplier(arr, multiply, i*(n/4)));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        // Creating matrix from multiplied array
        for (int i = 0; i < multiply.length; i++) {
            for (int j = 0; j < multiply.length; j++) {
                matrix[i][j] = multiply[i] * multiply[j];
            }
        }


        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Multiplied array: " + Arrays.toString(multiply));
        System.out.println("Matrix:- ");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
