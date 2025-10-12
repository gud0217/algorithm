// spell 알파벳 모두 쓴 단어? n!개 필요..
// dic에 있는 원소 하나하나 확인해보기?
import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        String s = "";
        
        for (String strArr : spell) {
            s += strArr;
        }
        
        char[] charArr1 = s.toCharArray();
        
        Arrays.sort(charArr1);

        for (String str : dic) {
            char[] charArr2 = str.toCharArray();
            Arrays.sort(charArr2);
            if (Arrays.equals(charArr1, charArr2)) {
                answer = 1;
                break;
            }

        }

        return answer;
    }
}