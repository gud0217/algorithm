// i번째부터, j번째까지 자르기
// 정렬하기
// k번째 수 구하기
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 답, 길이는 commands의 배열 길이만큼.
        
        // 그만큼 반복
        for (int i = 0; i < commands.length; i++) {
            int size = commands[i][1] - commands[i][0] + 1; // 자른 길이
            int[] arr = new int[size]; // 만들기
            
            // 복사하기
            for (int j = 0; j < size; j++) {
                arr[j] = array[commands[i][0] - 1 + j]; // 복사
            }
            
            Arrays.sort(arr);
            
            answer[i] = arr[commands[i][2] - 1];
        }
        
        return answer;
    }
}