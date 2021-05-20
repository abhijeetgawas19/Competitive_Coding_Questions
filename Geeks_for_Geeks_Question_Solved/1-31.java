class Solution{
    public int getXor(int[] nums, int a, int b){
        int result = 0,i;
        for(i=a;i<=b;i++)
        {
            result = result ^ nums[i];
        }
            return result;
    }
}
