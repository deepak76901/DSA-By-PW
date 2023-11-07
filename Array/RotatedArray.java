import java.util.*;

public class RotatedArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int col=4;
        int row=4;
        int arr[][] = new int[row][col];
        System.out.println("Enter the elements of Array");

        for(int i =0 ; i<row ; i++){
            for(int j =0 ; j<col ; j++){

                arr[i][j] = sc.nextInt();
            }
        } 
        sc.close();
        System.out.println();
        System.out.println("Entered Array is Here");

        for(int i = 0 ;i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        
        for(int i =0;i<row ;i++){
            for(int j=i+1 ; j<col ; j++){
                if(i!=j){
                    int temp = arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("Transpose of Array is Here...");

        for(int i = 0 ;i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        
        for(int i =0 ;i<row ;i++){
            for(int j = 0;j<col/2 ;j++){
                int flag = arr[i][col-1-j];
                arr[i][col-1-j] = arr[i][j] ; 
                arr[i][j] = flag;
            }
        }
        System.out.println();

        System.out.println("Rotated Array is Here...");

        for(int i = 0 ;i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
