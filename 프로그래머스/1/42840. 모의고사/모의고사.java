import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int scoreA = 0;
        int scoreB = 0;
        int scoreC = 0;
        int max = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (a[i % 5] == answers[i]) scoreA++;
            if (b[i % 8] == answers[i]) scoreB++;
            if (c[i % 10] == answers[i]) scoreC++;
        }
        
        max = Math.max(Math.max(scoreA, scoreB), scoreC);
        
        ArrayList<Integer> list = new ArrayList<>();
        if(scoreA == max) list.add(1);
        if(scoreB == max) list.add(2);
        if(scoreC == max) list.add(3);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}