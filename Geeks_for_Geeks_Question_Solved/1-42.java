class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        String val = Integer.toBinaryString(n);
        int len = val.length();
        StringBuilder sb = new StringBuilder();
        sb.append(val);
        sb = sb.reverse();
        char x = sb.charAt(k);
        if(x=='1')
            return true;
        else
            return false;
    }
    
}
