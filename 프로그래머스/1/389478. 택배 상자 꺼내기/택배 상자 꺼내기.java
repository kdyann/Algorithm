class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;

        int targetRow = (num - 1) / w;
        int targetCol;

        if (targetRow % 2 == 0) {
            targetCol = (num - 1) % w;
        } else {
            targetCol = w - 1 - (num - 1) % w;
        }

        for (int box = num; box <= n; box++) {
            int row = (box - 1) / w;
            int col;

            if (row % 2 == 0) {
                col = (box - 1) % w;
            } else {
                col = w - 1 - (box - 1) % w;
            }

            if (col == targetCol) {
                answer++;
            }
        }

        return answer;
    }
}