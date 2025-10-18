class Solution {
    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (char c : charArr) {
            if (c >= 'a' && c <= 'z') {
                c = (c + n > 'z') ? (char)(c + n - 26) : (char)(c + n);
            } else if (c >= 'A' && c <= 'Z') {
                c = (c + n > 'Z') ? (char)(c + n - 26) : (char)(c + n);
            }
            sb.append(c);
        }
        
        System.out.println(sb.toString());
        String answer = sb.toString();
        
        return answer;
    }
}