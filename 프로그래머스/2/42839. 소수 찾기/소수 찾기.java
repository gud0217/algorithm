import java.util.*;

class Solution {
    Set<Integer> primeSet = new HashSet<>();
    boolean[] visited;
    
    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        dfs("", numbers);
        return primeSet.size();
    }
    
    // 숫자 조합을 만드는 재귀 함수
    private void dfs(String cur, String numbers) {
        // 현재 문자열이 비어있지 않다면, 숫자로 변환
        if (!cur.isEmpty()) {
            int num = Integer.parseInt(cur);
            
            // 소수인지 검사
            if (isPrime(num)) {
                primeSet.add(num);
            }
        }
        
        // numbers에 있는 각 숫자를 한 번씩 선택
        for (int i = 0; i < numbers.length(); i++) {
            if (visited[i]) continue;
            visited[i] = true;
            dfs(cur + numbers.charAt(i), numbers);
            visited[i] = false;
        }
    }
    
    // 소수 판별 함수
    private boolean isPrime(int n) {
        if(n < 2) return false;
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}