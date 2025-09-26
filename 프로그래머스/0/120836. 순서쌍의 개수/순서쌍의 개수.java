class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int nSqrt = (int) Math.sqrt(n);
        
        for (int i = 1; i <= nSqrt; i++) {
            if (n % i == 0) {
                answer += 2;
            }
        }
        
        if (n == Math.pow(nSqrt, 2)) {
            answer -= 1;
        }
        
        return answer;
    }
}