// 모든 명함을 가로가 더 짧다고 생각해보자
// 그다음 가장 긴 가로길이와, 가장 긴 세로길이를 찾자

import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {

        int max_w = 0;
        int max_h = 0;

        // 모든 명함에 대해, 각각 오름차순으로 정렬
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            System.out.println(Arrays.toString(sizes[i]));

            max_w = Math.max(max_w, sizes[i][0]);
            max_h = Math.max(max_h, sizes[i][1]);
        }

        return max_w * max_h;
    }
}