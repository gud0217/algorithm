class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int wL = Math.max(wallet[0], wallet[1]);
        int wS = Math.min(wallet[0], wallet[1]);
        int bL = Math.max(bill[0], bill[1]);
        int bS = Math.min(bill[0], bill[1]);

        while (true) {
            if (bL <= wL && bS <= wS) {
                break;
            }

            bL /= 2;

            if (bS > bL) {
                int temp = bL;
                bL = bS;
                bS = temp;
            }

            answer++;
        }
        return answer;
    }
}