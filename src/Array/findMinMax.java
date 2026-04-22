package Array;

public class findMinMax
{
    public static int findMax(int []arr)
    {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max = arr[i];
        }

        return max;
    }

    public static int findMin(int arr[])
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
            if(arr[i]<min)
                min = arr[i];
        return min;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(findMin(arr));
        System.out.println(findMax(arr));
    }
}
