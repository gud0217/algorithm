// commands 길이만큼 반복
//  i번째 숫자부터, j번째포함 자르기
//  정렬하기
//  k번째 숫자 찾기
//  결과값에 넣기

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        
        for (int[] i : commands) {
            int[] slice = Arrays.copyOfRange(array, i[0] - 1, i[1]);
            Arrays.sort(slice);
            list.add(slice[i[2] - 1]);
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}