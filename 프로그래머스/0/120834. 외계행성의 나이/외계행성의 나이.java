class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String strAge = String.valueOf(age);
        
        for (char c : strAge.toCharArray()) {
           sb.append((char)(c - '0' + 'a'));
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}