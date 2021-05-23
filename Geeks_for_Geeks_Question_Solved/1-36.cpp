class Solution {
  public:
    int isAmicable(int A , int B) {
        int n1 = A;
        int n2 = B;
        int sum_1=0,sum_2=0,i;
        for(i=1;i<=A/2;i++)
        {
            if(A%i==0)
                sum_1 = sum_1 + i;
        }
        for(i=1;i<=B/2;i++)
        {
            if(B%i==0)
                sum_2 = sum_2 + i;
        }
        if(sum_1==B && sum_2==A)
            return 1;
        else
            return 0;
    }
};
