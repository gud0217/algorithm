class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[200];
        
        for(int k = 0; k < 3; k++) {
            for (int i = lines[k][0] + 100; i < lines[k][1] + 100; i++) {
            arr[i]++;
            }
        }
        
        for(int i : arr) {
            if (i > 1) {
                answer++;
            }
        }
        
        
        return answer;
    }
}