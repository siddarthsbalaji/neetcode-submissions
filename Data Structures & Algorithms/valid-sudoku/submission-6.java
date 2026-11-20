class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') {
                    continue;
                }
                int n = c - '1';
                int b = ((i / 3) * 3) + (j / 3);
                if ((row[i][n]) || (col[j][n]) || (box[b][n])) {
                    return false;
                }
                row[i][n] = true;
                col[j][n] = true;
                box[b][n] = true;
            }
        }
        return true;
    }
}
