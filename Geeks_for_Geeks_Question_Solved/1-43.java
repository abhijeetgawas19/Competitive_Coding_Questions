class Solution {
    int isPlaindrome(String S) {
        StringBuilder sf = new StringBuilder(S);
        StringBuilder ss = new StringBuilder(S);
        ss = ss.reverse();
        if(sf.toString().equals(ss.toString()))
            return 1;
        else
            return 0;
    }
};
