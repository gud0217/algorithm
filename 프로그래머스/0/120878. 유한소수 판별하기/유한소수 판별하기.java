class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        b /= gcd(a, b);
        
        while(true) {
            if (b % 2 == 0) {
                b /= 2;
            }
            
            if (b % 5 == 0) {
                b /= 5;
            }
            
            if (b % 2 != 0 && b % 5 != 0) {
                break;
            }
        }
        
        if(b == 1) {
            answer = 1;
        }
        
        return answer;
    }
    
    private int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        
        return gcd(b, a % b);
    }
}