class Sol
{
    int binaryPalin (long N)
    {
        StringBuilder fsb = new StringBuilder();
        StringBuilder ssb = new StringBuilder();
        long rem;
        while(N>0)
        {
            rem = N % 2;
            fsb.append(rem);
            ssb.append(rem);
            N = N / 2;
        }
        ssb = ssb.reverse();
        //System.out.println(fsb+" "+ssb);
        if(fsb.toString().equals(ssb.toString()))
            return 1;
        else
            return 0;
    }
}
