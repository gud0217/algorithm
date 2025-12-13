// HashSet을 이용, 포켓몬 종류 압축
// size >= n/2면 n/2, size < n/2면 size
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        
        int size = hs.size();
        
        if (size >= (nums.length / 2)) {
            answer = nums.length / 2;
        } else {
            answer = size;
        }
        
        return answer;
    }
}