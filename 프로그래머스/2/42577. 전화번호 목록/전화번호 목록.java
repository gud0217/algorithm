// phone_book을 사전순으로 정렬
// 뒤에있는걸 앞에만큼 짤라서 비교?
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();

// 1. 전부 저장
for (String num : phone_book) {
    set.add(num);
}

// 2. 접두어 검사
for (String num : phone_book) {
    for (int i = 1; i < num.length(); i++) {
        if (set.contains(num.substring(0, i))) {
            return false;
        }
    }
}
return true;
    }
}