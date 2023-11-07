import java.util.*;

class Q1 {
    public static void main(String[] args) {
        // Q1: Take m and n input from the user and m * n integer inputs from user and
        // print the following:
        // number of positive numbers
        // number of negative numbers
        // number of odd numbers
        // number of even numbers
        // number of 0

        int m = 4;
        int n= 4;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array element");
        int [][] arr = new int[m][n];
        for(int i=0 ; i<m ;i++){
            for(int j=0 ; j<n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array is here");
        for(int i=0 ; i<m ;i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(arr[i][j] + "\t");
            }System.out.println();
        }

        int Positivenumber=0;
        for(int i=0 ; i<m ;i++){
            for(int j=0 ; j<n ; j++){
                if(arr[i][j] > 0){
                    Positivenumber ++;
                }                
            }
        }
        System.out.println("Number of Positive number are : " + Positivenumber);


        int Negativenumber=0;
        for(int i=0 ; i<m ;i++){
            for(int j=0 ; j<n ; j++){
                if(arr[i][j] < 0){
                    Negativenumber ++;
                }                
            }
        }
        System.out.println("Number of Negative number are : " + Negativenumber);


        int Oddnumber=0;
        for(int i=0 ; i<m ;i++){
            for(int j=0 ; j<n ; j++){
                if(arr[i][j] %2 ==1 || arr[i][j] %2== -1){
                    Oddnumber ++;
                }                
            }
        }
        System.out.println("Number of Odd number are : " + Oddnumber);


        int Evennumber=0;
        for(int i=0 ; i<m ;i++){
            for(int j=0 ; j<n ; j++){
                if(arr[i][j] %2 ==0 ){
                    Evennumber ++;
                }                
            }
        }
        System.out.println("Number of Even number are : " + Evennumber);


        int Zeronumber=0;
        for(int i=0 ; i<m ;i++){
            for(int j=0 ; j<n ; j++){
                if(arr[i][j] ==0 ){
                    Zeronumber ++;
                }                
            }
        }
        System.out.println("Number of Zero number are : " + Zeronumber);


        

    }
}