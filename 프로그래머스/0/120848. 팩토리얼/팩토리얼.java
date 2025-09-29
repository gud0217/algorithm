class Solution {
    public int solution(int n) {
        int answer = 1;
        int k = 0;
        
        while(true) {
            k++;
            answer *= k;
            if (answer > n) break;
        }
        
        return k-1;
    }
}