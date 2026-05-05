package Array;

import java.util.Arrays;

// Steps
/*
  Step 1: Sort Array => Array.sort
  Step 2: Initial answer => int ans = arr[n - 1] - arr[0];
  Step 3: Base Values define karo
  -> int smallest = arr[0] + k;
  -> int largest = arr[n - 1] - k;
  Step 4:
   -> Left side [0 → i-1] → +k
   -> Right side [i → n-1] → -k
 */
public class getMinDiffSolution
{
    public static int getMinDiff(int arr[],int k)
    {
        int n = arr.length;
        Arrays.sort(arr);

        int ans = arr[n-1] -  arr[0];

        // initial base values
        int smallestValue = arr[0];
        int largestValue = arr[n-1];

        for (int i = 1; i < n; i++)
        {
            int minValue = Math.min(smallestValue, arr[i] - k);
            // Is line ka matlab ha minimum value kaha sa a sakhti ha ya tu small jo
            // already define ha ya decrease kar ka right sa left
            int maxValue = Math.max(largestValue, arr[i - 1] + k); // i-1 means left side ki last value

            if (minValue < 0) continue;

            ans = Math.min(ans, maxValue - minValue);
        }

        return ans;


    }
}
