package Array;

import java.util.Arrays;

public class ReverseArray
{
    public static int [] reverse(int []arr)
    {
        int left = 0;
        int right = arr.length - 1;

        while (left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        final var result = reverse(arr);

        System.out.println(Arrays.toString(result));

        // When we type this System.out.println(result);
        // it print this [I@6ce253f1 I means its int array and
        // this @6ce253f1 is hashcode value hashcode value is a memory
        // reference




    }



    
}
