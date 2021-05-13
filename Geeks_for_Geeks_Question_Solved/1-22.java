class Solution
{
    public int reverseBits(int n)
    {
        int arr[] = new int[1000];
        int rem,j=0,i,k;
        double result=0;
        while(n>0)
        {
            rem =  n %  2;
            arr[j]=rem;
            j++;
            n = n / 2;
        }
        j=j-1;
        for(i=0, k=j ; i<=j ; i++, k--)
        {
            result = result + (arr[i] * Math.pow(2,k));
        }
            int r = (int) result;
            return r;
    }
}
