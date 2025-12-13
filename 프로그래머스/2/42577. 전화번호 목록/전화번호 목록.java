// phone_book을 사전순으로 정렬
// 뒤에있는걸 앞에만큼 짤라서 비교?
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 사전순 정렬
        Arrays.sort(phone_book);
        
        for(int i = 0; i < phone_book.length - 1; i++) {
            int length1 = phone_book[i].length();
            int length2 = phone_book[i + 1].length();
            
            if (length1 < length2) {
                String str = phone_book[i + 1].substring(0, length1);
                if (phone_book[i].equals(str)) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}