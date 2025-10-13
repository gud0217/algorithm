class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[100];
        int num = 0;
        
        for (int i = 0; i < 100; i++) {
            while(true) {
                num++;
                String strN = String.valueOf(num);
                
                if (num % 3 == 0 || strN.contains("3")) {
                    continue;
                } else {
                    arr[i] = num;
                    break;
                }
            }
        }
        
        answer = arr[n - 1];
        
        return answer;
    }
}