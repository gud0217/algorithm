import java.util.*;

class Solution {
    public int solution(int[] array) {        
        // 원소는 1~99개, 원소 범위는 0~999
        // 최빈값을 구한다
            // 1. 각 원소가 몇 번 나왔는지 각각 비교 해야함
            // 2. 그 많이 나온 원소가 뭔지도 알아야함
            // 3. 최빈값이 한개인지 확인해야 함
            
        // 1000 크기의 배열을 만든다 (0~999)
        int[] arr = new int[1000];
        
        // array 배열을 전체 순회하며, 각 원소가 몇번 나왔는지 체크한다
        for (int i = 0; i < array.length; i++) {
            arr[array[i]]++;
        }
        
        // 1000 배열(arr)에서, 최빈값의 횟수를 구한다
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        
        // 이후 이 값을 통해, 최빈값을 찾는다
        int answer = 0;
        boolean solo = true;
        
        for (int i = 0; i < 1000; i++) {
            if (arr[i] == max) {
                if (solo == false) {
                    answer = -1;
                    break;
                }
                answer = i;
                solo = false;
            }
        }
        
        return answer;
    }
}