class Solution {
    static int[] changeBits(int N) {
        // code here
        int rem=0,count=0;
        int i=0,j=0,v=N;
        int [] newarray = new int[10000];
        int [] reverse = new int[10000];
        int [] result = new int[2];
        // Reverse Binary Form
        while(N>0)
        {
            rem = N % 2;
            newarray[count]=rem;
            count++;
            N = N / 2;
        }
        // Binary form
        for(i=count-1,j=0;i>=0;i--,j++)
        {
            if(newarray[i]==0)
                reverse[j]=1;
                
            else
                reverse[j]=newarray[i];
        }
        // Int Value
        double value=0;
        for(i=0,j=count-1;i<count;i++,j--)
        {
            value = value + (reverse[i] * Math.pow(2,j));
        }
            result[0] = (int) value - v;
            result[1] = (int) value;
            return result;
        
    }
};
