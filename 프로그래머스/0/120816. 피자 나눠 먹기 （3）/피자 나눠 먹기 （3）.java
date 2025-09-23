// 같은 양 안먹어도 됨
// slice * ? >= n;
// ? = n / slice
class Solution {
    public int solution(int slice, int n) {
        int answer = (n % slice == 0) ? (n / slice) : (n / slice) + 1;
        return answer;
    }
}