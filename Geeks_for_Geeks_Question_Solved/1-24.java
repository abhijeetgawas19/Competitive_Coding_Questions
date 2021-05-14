class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        int arr[] = new int[1000];
        int rem,k=0,i,j=0;
        while(n>0)
        {
            rem=n % 2;
            n = n / 2;
            arr[k] = rem;
            k++;
        }
        for(i=0;i<k;i++)
        {
            if(arr[i]==1)
            {
                j=i+1;
                break;
            }
        }
            return j;
    }
}
