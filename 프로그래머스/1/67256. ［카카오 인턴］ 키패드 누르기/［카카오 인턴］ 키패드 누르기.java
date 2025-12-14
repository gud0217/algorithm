// [1, 4, 7]은 무조건 L
// [3, 6, 9]은 무조건 R
// [2, 5, 8, 0]은 현재 위치 기준 거리 가까운 순
//  거리 같다면, hand로.

// 왼손 오른손이 현재 어디있는지 알고있어야 함.
// 상하좌우만 이동 가능하기 때문에, 대각선은 거리 2임을 유의.
import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder(); // answer

        int[][] map = {{4,2}, {1,1}, {1,2}, {1,3}, {2,1}, {2,2}, {2,3}, {3,1}, {3,2}, {3,3}};
        
        int[] L = {4, 1}; // L 시작위치
        int[] R = {4, 3}; // R 시작위치
        
        for (int i : numbers) {
            // 1, 4, 7 인 경우 왼손
            if (i == 1 || i == 4 || i == 7) {
                sb.append("L");
                L = map[i];
            }
            
            // 3, 6, 9 인 경우 오른손
            else if (i == 3 || i == 6 || i == 9) {
                sb.append("R");
                R = map[i];
            }
            
            // 2, 5, 8, 0 인 경우
            else {
                // 거리 비교
                int dl = Math.abs(L[0] - map[i][0]) + Math.abs(L[1] - map[i][1]);
                int dr = Math.abs(R[0] - map[i][0]) + Math.abs(R[1] - map[i][1]);
                
                // 오른손이 더 가까운 경우
                if (dl > dr) {
                    sb.append("R");
                    R = map[i];
                }
                
                // 왼손이 더 가까운 경우
                else if (dl < dr) {
                    sb.append("L");
                    L = map[i];
                }
                
                // 길이가 같은 경우
                else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        R = map[i];
                    } else {
                        sb.append("L");
                        L = map[i];
                    }
                }
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}