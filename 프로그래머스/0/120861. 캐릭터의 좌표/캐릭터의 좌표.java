class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int max_width = board[0] / 2;
        int min_width = -(board[0] / 2);
        int max_height = board[1] / 2;
        int min_height = -(board[1] / 2);
        
        int answer[] = {0,0};
        
        for (String str : keyinput) {
           if (str.equals("left")) {
               if (answer[0] != min_width) {
                   answer[0]--;
               }
           } else if (str.equals("right")) {
               if (answer[0] != max_width) {
                   answer[0]++;
               }
           } else if (str.equals("up")) {
               if (answer[1] != max_height) {
                   answer[1]++;
               }
           } else {
               if (answer[1] != min_height) {
                   answer[1]--;
               }
           }
        }
        
        return answer;
    }
}