// 입력: 문자열, 길이 1000 이하, 알파벳 대문자 소문자 숫자 특수문자로 구성
// 출력 : 문자열

class Solution {
    public String solution(String new_id) {
        // 0단계: 기본 입력
        System.out.println("0단계: " + new_id);
        
        // 1단계: 대문자 -> 소문자
        new_id = new_id.toLowerCase();
        System.out.println("1단계: " + new_id);
        
        // 2단계: 제외되는 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9_.-]", "");
        System.out.println("2단계: " + new_id);

        
        // 3단계: 마침표가 2번 이상 연속된 부분을 하나로 치환
        new_id = new_id.replaceAll("[.]{2,}", ".");
        System.out.println("3단계: " + new_id);
        
        // 4단계: 마침표가 처음과 끝에 위치하면 제거
        new_id = new_id.replaceAll("^\\.||\\.$", "");
        System.out.println("4단계: " + new_id);
        
        // 5단계: 빈 문자열이라면, "a" 대입
        if (new_id.equals("")) new_id = "a";
        System.out.println("5단계: " + new_id);
        
        // 6단계: 길이가 16자 이상이라면, 15자 제외 제거. 제거 후 마침표가 마지막이라면 마침표 제거.
        if (new_id.length() > 15) new_id = new_id.substring(0, 15);
        new_id = new_id.replaceAll("\\.$", "");
        System.out.println("6단계: " + new_id);
        
        // 7단계: 길이가 2 이하면, 마지막 문자 반복해서 3 만들기
        if (new_id.length() < 3) {
            char c = new_id.charAt(new_id.length() - 1);
            while(new_id.length() != 3) {
                new_id += c;
            }
        }
        System.out.println("7단계: " + new_id);
        
        String answer = new_id;
        return answer;
    }
}