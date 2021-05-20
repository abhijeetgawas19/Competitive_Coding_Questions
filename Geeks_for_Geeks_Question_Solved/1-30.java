class Solution{
    static int isPossible(int N, int arr[]){
        StringBuffer sb = new StringBuffer();
        int i,sum=0;
        for(i=0;i<N;i++)
        {
            sb.append(arr[i]);
        }
        for(i=0;i<sb.length();i++)
        {
            sum = sum + Character.getNumericValue(sb.charAt(i));
        }
        if(sum%3==0)
            return 1;
        else
            return 0;
    }
}
