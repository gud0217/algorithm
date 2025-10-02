import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        Set<Integer> integers = new HashSet<>();

        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                if(n % i == 0) {
                    integers.add(i);
                    n = n / i;
                    break;
                }
            }
        }

        List<Integer> list = new ArrayList<>(integers);
        Collections.sort(list);

        int[] answer = list.stream()
                .mapToInt(i -> i)
                .toArray();

        return answer;
    }
}