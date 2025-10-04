// 공백 기준 배열로
// 12 + 34 - 56
import java.util.*;

class Solution {
    public int solution(String my_string) {
        
        String[] strArr = my_string.split(" ");
        System.out.println(Arrays.toString(strArr));
        
        int answer = Integer.parseInt(strArr[0]);
        
        for (int i = 1; i < strArr.length; i += 2) {
            if (strArr[i].equals("+")) {
                answer += Integer.parseInt(strArr[i + 1]);
            } else {
                answer -= Integer.parseInt(strArr[i + 1]);
            }
        }
        
        return answer;
    }
}