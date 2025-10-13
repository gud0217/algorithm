class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for (String[] d : db) {
            if (id_pw[0].equals(d[0])) {
                if (id_pw[1].equals(d[1])) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                    break;
                }
            } else {
                answer = "fail";
            }
        }
        
        return answer;
    }
}