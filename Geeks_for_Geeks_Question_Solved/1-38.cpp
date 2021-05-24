class Solution{
  public:
    void swapElements(int arr[], int sizeof_array){
        int i,j,temp;
        for(i=0;i<sizeof_array;i++)
        {
            j=i+2;
            if(j<sizeof_array)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
    }
};
