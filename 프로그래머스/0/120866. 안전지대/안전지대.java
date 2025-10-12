// 안전지대 찾기
// 전체 배열을 순회하며, 지뢰를 찾는다.
// 지뢰를 찾은 경우, 반경 1 범위를 0 -> 2로 변환한다.
//  1인경우 그대로 둔다.
// 이후 0의 갯수를 센다.

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] step = {-1, 0, 1};

        int n = board.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (i + step[k] >= 0 && i + step[k] < n && j + step[l] >= 0 && j + step[l] < n && board[i+step[k]][j+step[l]] == 0){
                                board[i+step[k]][j+step[l]] = 2;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}