package Array;

import java.util.Arrays;

public class sort012
{
    public static void sort(int [] arr)
    {
        int left = 0, right = arr.length - 1,mid = 0;

        while (mid <= right)
        {
            if(arr[mid]==0)
            {
                int temp =  arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }

            // CASE 2: Agar mid mai zero ha
            if (arr[mid] ==1)
            {
                mid++;
            }

            // CASE 3:
            else {
                int temp =  arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }
    public static void main(String[] args) {

        int [] arr = {1,1,1,1,2,0,1,0,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
