

import java.util.*;

class Solution {
    public int[] solution(int[][] arr) {
        return press(arr);
    }
    
    private int[] press(int[][] arr) {
        // 종료 조건
        
        boolean flag = true;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[0][0] != arr[i][j]) flag = false;
            }
        }
        
        if (flag) {
            if (arr[0][0] == 0) {
                int[] result = {1, 0};
                return result;
            } else {
                int[] result = {0, 1};
                return result;
            }
        }
        
        int[][] arr1 = new int[arr.length / 2][arr.length / 2];
        int[][] arr2 = new int[arr.length / 2][arr.length / 2];
        int[][] arr3 = new int[arr.length / 2][arr.length / 2];
        int[][] arr4 = new int[arr.length / 2][arr.length / 2];
        
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                arr1[i][j] = arr[i][j];
                arr2[i][j] = arr[i + arr.length / 2][j];
                arr3[i][j] = arr[i][j + arr.length / 2];
                arr4[i][j] = arr[i + arr.length / 2][j + arr.length / 2];
            }
        }
        
        // 점화식
        return add(press(arr1), press(arr2), press(arr3), press(arr4));
    }
    
    private int[] add(int[] result1, int[] result2, int[] result3, int[] result4) {
        int a = result1[0] + result2[0] + result3[0] + result4[0];
        int b = result1[1] + result2[1] + result3[1] + result4[1];
        
        int[] sum = {a, b};
        return sum;
    }
}