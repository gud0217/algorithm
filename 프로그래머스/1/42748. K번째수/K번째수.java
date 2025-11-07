// 1.commands 배열 크기만큼 반복
//  1. 자르기
//  2. 정렬하기
//  3. k번째 수 구하기
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int startIndex = commands[i][0] - 1;
            int endIndex = commands[i][1] - 1;
            int findIndex = commands[i][2] - 1;
            
            int[] arr = Arrays.copyOfRange(array, startIndex, endIndex + 1);
            
            Arrays.sort(arr);
            
            answer[i] = arr[findIndex];
        }
        
        return answer;
    }
}