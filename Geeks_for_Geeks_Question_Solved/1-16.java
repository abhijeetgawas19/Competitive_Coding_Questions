class Geeks{
    
    static void printArr(int arr[],int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");    
        }
            System.out.println();
        
    }
    
   static void setToZero(int arr[],int n)
    {
        //use Arrays.fill to set arr to zero
        Arrays.fill(arr,0);
    }
    
   static void xor1ToN(int arr[], int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            arr[i] = arr[i] ^ i;
        }
        
    }
}
