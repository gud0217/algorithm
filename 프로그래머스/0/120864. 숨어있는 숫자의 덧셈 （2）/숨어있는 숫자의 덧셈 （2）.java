import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String numStrArr[] = my_string.split("[a-zA-Z]");
        System.out.println(Arrays.toString(numStrArr));
        
        for (int i = 0; i < numStrArr.length; i++) {
            if(!numStrArr[i].equals("")) {
                answer += Integer.parseInt(numStrArr[i]);
            }
        }

        return answer;
    }
}