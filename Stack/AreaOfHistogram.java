import java.util.Arrays;
import java.util.Collections;
import java.math.*;

public class AreaOfHistogram {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 5, 6, 3, 2, 4, 2, -1 };
        int[] prevSmall = new int[arr.length];
        int[] nextSmall = new int[arr.length];
        prevSmall[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            while (j >= 0) {
                if ((arr[i] > arr[j])) {
                    prevSmall[i] = j;
                    break;

                } else {
                    prevSmall[i] = -1;
                }
                j--;
            }
        }
        System.out.println(Arrays.toString(prevSmall));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    nextSmall[i] = j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nextSmall));

        int[] width = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            width[i] = nextSmall[i] - prevSmall[i] - 1;
        }
        System.out.println(Arrays.toString(width));

        int[] area = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            area[i] = arr[i] * width[i];
        }
        System.out.println(Arrays.toString(area));

        int val = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < area.length - 1; i++) {
            if (area[i] > area[i - 1] && area[i] > area[i + 1]) {
                val = area[i];
                max = Math.max(max, val);
            }
        }
        System.out.println("Maximum area got is : " + max );

    }

}
