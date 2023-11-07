import java.util.*;
public class inputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the Row Size");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("Please Enter the Column Size");

        int [][] arr = new int[row][col];

        int total = row*col;

        System.out.println("Please Enter " + total + " Elements.");

        
        for(int i =0 ; i<row ; i++){
            for(int j =0 ; j<col ; j++){

                arr[i][j] = sc.nextInt();
            }
        } 
        sc.close();

        System.out.println("Entered Array is Here");

        for(int i = 0 ;i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        



    }
}
