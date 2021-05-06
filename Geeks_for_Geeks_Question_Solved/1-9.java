class Solution {
    String removeDups(String S) {
        int len = S.length();
        LinkedHashSet <Character> ts = new LinkedHashSet<Character>();
        char x;
        for(int i=0;i<len;i++)
        {
            ts.add(S.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (char c:ts)
        {
            sb.append(c);
        }
        String result = sb.toString();
        return result;
    }
}
