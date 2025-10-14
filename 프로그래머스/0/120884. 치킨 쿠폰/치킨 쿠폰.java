class Solution {
    public int solution(int chicken) {
        int answer = 0; // 시켜먹은 서비스 치킨 수
        int service = 0; // 쿠폰으로 시킨 치킨으로 받은 쿠폰
        int nam = 0; // 남은 쿠폰 수
        
        while(chicken > 9) {
            service = chicken / 10;
            nam = chicken % 10;
            answer += service;
            chicken = service + nam;
        }
        
        return answer;
    }
    

}