class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        
        int max=0,rem,i,len,count=0;
        StringBuilder sb = new StringBuilder();
        while(N>0)
        {
            rem = N % 2;
            sb.append(rem);
            N = N / 2;
        }
        sb = sb.reverse();
        len = sb.length();
            for(i=0;i<len;i++)
            {
                if(sb.charAt(i)=='1')
                {
                    count++;
                }
                else if(count>max)
                {
                    max = count;
                    count=0;
                }
                else
                {
                    count=0;
                }
                    
            }
            if(count>max)
            max = count;
        return max;   
    }
}
