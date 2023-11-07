public class Q2 {
    public static void main(String[] args) {

        // Q2: Write a program to traverse over the elements of the array using for each
        // loop and print all even
        // elements.
        // Input 1: arr[] = {34,21,54,65,43}
        // Output 1: 34 54

        int arr[] =  {4,3,6,7,1};
        int num ;
        for(int a : arr){
            if(a %2==0){
                System.out.println(a);
            }
        }

    }
}
