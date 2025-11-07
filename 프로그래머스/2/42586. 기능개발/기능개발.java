// 각각 며칠후에 완성되는지 계산
//  [7, 3, 9], [5, 10, 1, 1, 20, 1]

// 인접 비교로, 앞이 더 크면 뒤를 앞이랑 맞춰버림
//  [7, 7, 9], [5, 10, 10, 10, 20, 20]

// 중복된 수 만큼 리턴
//  첫 원소를 잡고, 같으면 count++;
//  다르면 pre초기화, count초기화;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        // 각 작업에 필요한 날짜 배열
        int[] days = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            days[i] = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) days[i]++;
        }
        
        // 앞선 작업이 더 오래걸리면, 뒷 작업도 맞춤
        for (int i = 0; i < progresses.length - 1; i++) {
            if (days[i] > days[i + 1]) {
                days[i + 1] = days[i];
            }
        }
        
        // 몇번 반복되는지 구하기
        int pre = days[0];
        int count = 1;
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1; i < progresses.length; i++) {
            if (pre == days[i]) {
                count++;
            } else {
                list.add(count);
                pre = days[i];
                count = 1;
            }
            if (i + 1 == progresses.length) {
                list.add(count);
            }
        }
        
        int answer[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}