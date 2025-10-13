class Solution {
    public int solution(String[] babbling) {
        String[] babList = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        // 주어진 문자열 배열 순회
        for (String bab : babbling) {
            // 말할 수 있는 문자열 순회
            for (String bl : babList) {
                bab = bab.replaceFirst(bl, "-"); // 맞으면 -로 대체.
                System.out.println(bab);
            }
            
            bab = bab.replaceAll("-", "");
            
            if (bab.equals("")) {
                answer++;
            }
        }
        
        
        
        return answer;
    }
}