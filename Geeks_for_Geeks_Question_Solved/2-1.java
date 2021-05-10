class GfG
{
    public static long count2s(long n)
    {
        long count = 0;
        long i,val,rem;
        for(i=1;i<=n;i++)
        {
            val = i;
            while(val>0)
            {
                rem = val % 10;
                if(rem==2)
                {
                    count = count + 1;
                }
                val = val / 10;
            }
        }
        return count;
    }
    
    public static long count2sinRangeAtDigit(long n, long d)
    {
        long count = 0;
        long i,val,rem;
        for(i=n;i<=d;i++)
        {
            val = i;
            while(val>0)
            {
                rem = val % 10;
                if(rem==2)
                {
                    count = count + 1;
                }
                val = val / 10;
            }
        }
        return count;
    }
}
