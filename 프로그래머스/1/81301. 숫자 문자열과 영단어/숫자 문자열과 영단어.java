// 입력 : 문자와 숫자가 섞인 문자열, 길이 <= 50;
// 출력 : 입력을 해석해 숫자로, 20억 이하

// one -> 1, ... 전부 replace

class Solution {
    public int solution(String s) {
        String a = s.replaceAll("zero", "0");
        String b = a.replaceAll("one", "1");
        String c = b.replaceAll("two", "2");
        String d = c.replaceAll("three", "3");
        String e = d.replaceAll("four", "4");
        String f = e.replaceAll("five", "5");
        String h = f.replaceAll("six", "6");
        String i = h.replaceAll("seven", "7");
        String j = i.replaceAll("eight", "8");
        String k = j.replaceAll("nine", "9");
        
        int answer = Integer.parseInt(k);
        
        return answer;
    }
}