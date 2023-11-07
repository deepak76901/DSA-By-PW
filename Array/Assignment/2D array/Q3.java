import java.util.*;

public class Q3 {

    public static void main(String[] args) {

        System.out.println("Enter the array element");
        Scanner sc = new Scanner(System.in);
        int m = 3, n = 3, num = 0;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ++num;
            }
        }

        System.out.println("Array is here");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Number on the Diagonals are : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j || i+j==2) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
        }

    }
}
