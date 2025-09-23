class Solution {
    // 최대 공약수 
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        
        return gcd(b, a % b);
    }
    
    // 최소 공배수
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 기약분수라..
        // 두 수의 최소 공배수를 찾아보자
        // 최소 공배수 = 두 수의 곱 / 두 수의 최대 공약수
        // 그렇다면 최대 공약수는 어떻게 구할까?
        
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        int resultNumer = numer / gcd(numer, denom);
        int resultDenom = denom / gcd(numer, denom);
            
        int[] answer = {resultNumer, resultDenom};
        
        return answer;
    }
}