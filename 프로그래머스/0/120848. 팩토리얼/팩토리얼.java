class Solution {
    public int solution(int n) {
        int number = 1;
        int k = 1;
        
        while(number <= n) {
            number *= k;
            k++;
        }
        
        return k-2;
    }
}