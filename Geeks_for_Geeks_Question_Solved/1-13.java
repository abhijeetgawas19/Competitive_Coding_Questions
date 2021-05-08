class Sol
{
    int closing (String s, int pos)
    {
        int len = s.length();
        int i,count=1,endValue=0;
        for(i=pos+1;i<len;i++)
        {
            if(s.charAt(i)=='[')
            {
                count++;
            }
            else if(s.charAt(i)==']')
            {
                count--;
            }
            if(count==0)
            {
                endValue=i;
                break;
            }
        }
        return endValue;
    }
}
