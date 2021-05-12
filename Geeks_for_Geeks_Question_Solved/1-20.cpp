class Solution{
public:
    int revCoding(int n, int m) {
        int i, sum = 0;
        for(i=1;i<=n;i++)
        {
            sum = sum + i;
        }
        if(sum==m)
            return 1;
        else
            return 0;
    }
};
