// 연속으로 나타나는 숫자는 하나만 남기고, 순서를 보장
// 1. 배열 전체 순회
// 1.1 앞 숫자와 다음 숫자 비교
// 1.2 다를때까지 continue;
// 1.3 다르면 해당 숫자를 리스트에 집어넣자
// 2. 리스트를 정수 배열로 바꾸자

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                list.add(arr[i]);
                break;
            }
            if (arr[i] == arr[i + 1]) continue;
            list.add(arr[i]);
        }
                
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}