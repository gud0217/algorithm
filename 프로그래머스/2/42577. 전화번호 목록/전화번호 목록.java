// 1. 문자열 배열을, 문자열 길이 순으로 정렬
// 2. 경우의 수 전부 계산
import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
                
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].indexOf(phone_book[i]) == 0) {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}