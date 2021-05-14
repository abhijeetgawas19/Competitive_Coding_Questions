class Solution {
    long KthLSB(long n,int k) {
        // code here
        long [] arr = new long[1000];
	    int j=0,rem;
	    while(n>0)
	    {
	        rem =(int) n % 2;
	        n = n / 2;
	        arr[j]=rem;
	        j++;
	    }
	    return arr[k-1];
    }
}
