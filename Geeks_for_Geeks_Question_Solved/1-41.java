class Solution {
    int findMaximum(int[] arr, int n) {
        int max=0,i;
        for(i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            else
            {
                break;
            }
        }
        return max;
    }
}
