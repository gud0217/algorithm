// [3x,+,7,+,x]
import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int a = 0;
        int c = 0;
        
        String[] strArr = polynomial.split(" ");
        System.out.println(Arrays.toString(strArr));
        
        for (String s : strArr) {
            if (s.contains("x")) {
                String pureString = s.replace("x", "");
                if (pureString.equals("")) {
                    a += 1;
                } else {
                    a += Integer.parseInt(pureString);
                }
            } else if (!s.equals("+")) {
                c += Integer.parseInt(s);
            }
        }
        System.out.println(a);
        System.out.println(c);
        
        String v = String.valueOf(a);
        if (a == 1) {
            v = "";
        }
        
        if (c == 0) {
            answer += v + "x";
        } else if (a == 0) {
            answer += c;
        } else {
            answer += v + "x " + "+ " + c; 
        }
        
        return answer;
    }
}