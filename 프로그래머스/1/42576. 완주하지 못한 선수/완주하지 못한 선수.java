// 전부 다 비교?
// 동명이인 있으면 어카지 [a,a,b,c] [a,b,c]

import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
//         System.out.println(Arrays.toString(participant));
//         System.out.println(Arrays.toString(completion));

        
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        
        if (answer.equals("")) {
            answer = participant[participant.length - 1];
        }
        
        return answer;
    }
}