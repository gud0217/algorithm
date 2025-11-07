// DFS 

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, target, 0, 0);
        return answer;
    }
    
    private int dfs(int[] numbers, int target, int depth, int currentSum) {
        if (depth == numbers.length) {
            if (target == currentSum) return 1;
            else return 0;
        }
        
        int plus = dfs(numbers, target, depth + 1, currentSum + numbers[depth]);
        int minus = dfs(numbers, target, depth + 1, currentSum - numbers[depth]);

        return plus + minus;
    }
}