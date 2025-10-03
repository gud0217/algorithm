// n의 약수를 오름차순으로 담은 배열 return

// 1 ~ 제곱근까지 나누며 약수 배열에 저장하기
// 정렬 후 반환

import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (n != i * i) {
                    list.add(n / i);
                }
            }
        }
        
        // System.out.println(list);
        Collections.sort(list);
        // System.out.println(list);
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}