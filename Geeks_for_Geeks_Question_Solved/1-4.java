class Solution {
    static int setBits(int N) {
        // code here
        int i,count=0,rem;
        StringBuilder str = new StringBuilder();
        while(N>0)
        {
            rem = N % 2;
            N = N / 2;
            str.append(rem);
        }
            // Reverse String 
            str = str.reverse();
            int len = str.length();
            for(i=0;i<len;i++)
            {
                if(str.charAt(i)=='1')
                    count++;
            }
        return count;
    }
}
