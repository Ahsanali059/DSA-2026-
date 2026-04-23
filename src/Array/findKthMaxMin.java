package Array;

import java.util.Arrays;

public class findKthMaxMin
{
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};

        int k=3;

        Arrays.sort(arr);

        int minValue = arr[k-1];
        int kthMax = arr[arr.length - k];

        System.out.println(minValue);
        System.out.println(kthMax);
    }
}
