import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        // 평균 점수를 저장하는 정수 배열 avg
        int[] avg = new int[score.length];
        int[] answer = new int[score.length];
        
        // 정수 배열 avg에 국어와 영어 점수의 합 저장
        for(int i = 0; i < score.length; i++) {
            avg[i] = score[i][0] + score[i][1];
        }
        
        // 각각 rank가 몇인지 답에 넣기
        for(int i = 0; i < score.length; i++){
            int rank = 1;
            for(int j = 0; j < score.length; j++){
                if(avg[i] < avg[j]){
                    rank++;
                }
            }
            answer[i] = rank;
        }
        
        return answer;
    }
}