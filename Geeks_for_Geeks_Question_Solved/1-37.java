class Solution{
    static int countFactors(int N) {
        int count = 2; // For 1 and Last Number
        int i;
        for(i=2;i<=N/2;i++)
        {
            if(N%i==0)
                count++;
        }
            return count;
    }
}
