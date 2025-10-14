class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int len = common.length;
        
        if (common[2] - common[1] == common[1] - common[0]) {
            answer = common[len - 1] + common[len - 1] - common[len - 2];
        } else {
            answer = common[len - 1] * common[len - 1] / common[len - 2];
        }
        return answer;
    }
}