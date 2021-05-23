class Solution {
    static Long squaresInChessBoard(Long N) {
        double counting=0;
        long count;
        long i;
        for(i=N;i>=1;i--)
        {
            counting = counting + (Math.pow(i,2));
        }
        count = (long) counting;
        return count;
    }
};
