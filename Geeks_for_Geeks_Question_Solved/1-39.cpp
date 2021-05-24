class Solution {
    public:
    int repeatedSubtraction(int A,int B){
        int count = 0;
        while(A!=0 && B!=0)
        {
            if(A>B)
                A = A-B;
            else
                B = B-A;
            count++;
        }
            return count;
    }
};
