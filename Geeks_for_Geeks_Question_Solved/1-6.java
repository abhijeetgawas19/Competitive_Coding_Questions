class Sol
{
    Boolean balancedNumber(String N)
    {
        int leftSideCount = 0,i;
	    int rightSideCount = 0,j;
	    int len = N.length();
	    char l,h;
	    int middleNumber = len/2;
	    for(i=0;i<middleNumber;i++)
	    {
	        l = N.charAt(i);
	        leftSideCount = leftSideCount + Character.getNumericValue(l);
	    }
	    for(j=middleNumber+1;j<len;j++)
	    {
	        h = N.charAt(j);
	        rightSideCount = rightSideCount + Character.getNumericValue(h);
	    }
	    if(leftSideCount==rightSideCount)
	        return true;
	    else
	        return false;
    }
}
