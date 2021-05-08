class Solution {

    public long factorial(int N) {
        long result=1,i;
        for(i=1;i<=N;i++)
        {
            result = result * i;
        }
        return result;
    }
}
