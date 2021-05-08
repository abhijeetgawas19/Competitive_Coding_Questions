Class Solution{
    // arr: input array
    // n: size of the array
    //Function to sort the array into a wave-like array.
    public static int [] swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
    public static void convertToWave(int arr[], int n){
        int len = arr.length;
        int count = len%2,i;
        if(count%2==0)
        {
            for(i=0;i<len;i=i+2)
            {
                arr = swap(arr,i,i+1);
            }
        }
        if(count%2!=0)
        {
            for(i=0;i<len-1;i=i+2)
            {
                arr = swap(arr,i,i+1);
            }
        }
        
    }
    
}
