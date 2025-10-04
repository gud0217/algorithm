import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String strNum = String.valueOf(num);
        int length = strNum.length();
        
        int[] numArray = new int[length];
        
        for(int i = 0; i < length; i++) {
            numArray[i] = num % 10;
            System.out.println(numArray[i]);
            num /= 10;
        }
        
        System.out.println(Arrays.toString(numArray));
        
        for (int i = 0; i < length; i++) {
            if (numArray[length - i - 1] == k) {
                answer = i + 1;
                break;
            }
        }
        
        if (answer == 0) {
            answer = -1;
        }
        
        return answer;
    }
}