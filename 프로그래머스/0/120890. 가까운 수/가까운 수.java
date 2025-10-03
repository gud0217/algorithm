// 정수 배열 중, n에 가장 가까운 원소 return. 같은경우, 더 작은 수 return
// 원소와 n값의 차이가 가장 가까운 값을 써야할 듯
// 절댓값

// answer = 해당 원소
// result = (원소 - n) 절대값
// 만약 answer = result이면, answer와 원소 중 작은 값으로.

class Solution {
    public int solution(int[] array, int n) {
        int answer = 10000;
        int interval = 1000;
        
        for(int i = 0; i < array.length; i++){
            int result = array[i] - n;
            if (result < 0) {
                result = -result;
            }
            
            if (interval > result) {
                answer = array[i];
                interval = result;
            } else if (interval == result) {
                answer = (answer > array[i]) ? array[i] : answer;
            }
        }
        
        return answer;
    }
}