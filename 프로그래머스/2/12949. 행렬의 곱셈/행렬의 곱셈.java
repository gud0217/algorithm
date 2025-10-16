class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // arr1의 행의 수, arr2의 열의 수;
        int raw = arr1.length;
        int col = arr2[0].length;
        System.out.println(raw);
        System.out.println(col);
        
        int[][] answer = new int[raw][col];
        
        //answer[0][0] = arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0] + arr1[0][2] * arr2[2][0];
        //answer[0][1] = arr1[0][0] * arr2[0][1] + arr1[0][1] * arr2[1][1] + arr1[0][2] * arr2[2][1];
        //answer[0][2] = arr1[0][0] * arr2[0][2] + arr1[0][1] * arr2[1][2] + arr1[0][2] * arr2[2][2];
        
        //answer[0][0] = arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0] + arr1[0][2] * arr2[2][0];
        //answer[1][0] = arr1[1][0] * arr2[0][0] + arr1[1][1] * arr2[1][0] + arr1[1][2] * arr2[2][0];
        //answer[2][0] = arr1[2][0] * arr2[0][0] + arr1[2][1] * arr2[1][0]...arr1[2][2] * arr2[2][0];
        
        for(int i = 0; i < raw; i++) {
            for(int j = 0; j < col; j++) {
                for(int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}