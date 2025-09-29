// 원순열?
// numbers 개수 나머지

class Solution {
    public int solution(int[] numbers, int k) {
        int length = numbers.length;
        
        int idx = 2 *(k - 1) % length;
        
        return numbers[idx];
    }
}