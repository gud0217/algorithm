import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] exp = quiz[i].split(" ");
            
            int a = Integer.parseInt(exp[0]);
            int b = Integer.parseInt(exp[2]);
            int c = Integer.parseInt(exp[4]);
            int result = 0;
            
            if (exp[1].equals("+")) {
                result = a + b;
            } else {
                result = a - b;
            }
            
            if (result == c) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
            
        }
        
        return answer;
    }
}