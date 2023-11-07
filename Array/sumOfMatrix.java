import java.util.*;

public class sumOfMatrix {
    public static void main(String[] args) {
        int m,n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        m = sc.nextInt();
        System.out.println("Enter the no. of colomns : ");
        n= sc.nextInt();

        // Entering value of Array
        int [][] arr = new int[m][n];
        System.out.println("Enter the elements of Matrix : ");
        int i,j;
        for(i=0 ; i<m ;i++){
            for(j=0 ; j<n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // Printing of Array
        System.out.println("Array is here...");
        for(i=0 ; i<m ; i++){
            for(j=0 ; j<n ; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int r1,r2,c1,c2;

        System.out.println("Enter the value of r1 : ");
        Scanner sc1 = new Scanner(System.in);
        r1 = sc1.nextInt();

        System.out.println("Enter the value of c1 : ");
        Scanner sc2 = new Scanner(System.in);
        c1 = sc2.nextInt();

        System.out.println("Enter the value of r2 : ");
        Scanner sc3 = new Scanner(System.in);
        r2 = sc3.nextInt();
        
        System.out.println("Enter the value of c2 : ");
        Scanner sc4 = new Scanner(System.in);
        c2 = sc4.nextInt();

        System.out.println();
        int sum=0;
        for(i=r1 ; i<=r2 ; i++){
            for(j=c1 ; j<=c2 ; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of Rectangular Matrix is : " + sum);


    }
}
