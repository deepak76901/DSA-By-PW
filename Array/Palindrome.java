class Palindrome {
    public static void main(String[] args) {
        int[] arr = { 6, 2, 3, 2, 5};
        int n = arr.length;
        int[] copy = new int[arr.length];
        int flag = 0;

        for (int i = 0; i < n; i++) {
            copy[i] = arr[n - 1 - i];
        }
        System.out.println(arr[0]);
        System.out.println(copy[0]);

        for (int i = 0; i < n; i++) {
            if (copy[i] != arr[i]) {             
                flag =1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("It is Not a Palindrome");
        } else {
            System.out.println("It is a Palindrome");
        }

        
    }
}