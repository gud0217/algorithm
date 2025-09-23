// 피자 1판은 6조각
// n명이 남김없이 똑같이 먹어야함
// 최소 몇판을 시켜야 할까?
// n과 6의 최소공배수 만큼의 조각이 필요
// 최소공배수 / 6 만큼의 판수 필요
        

class Solution {
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
        
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    
    public int solution(int n) {
        int answer = lcm(n, 6) / 6;
        return answer;
    }
}