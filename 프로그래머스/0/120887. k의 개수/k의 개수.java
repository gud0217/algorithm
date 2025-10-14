class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        StringBuilder a = new StringBuilder();

        for (int p = i; p <= j; p++) {
            a.append(p);
        }

        String onlyK = a.toString().replaceAll("[^" + k + "]", "");
        answer = onlyK.length();

        return answer;
    }
}