class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> seen=new HashSet<>();
        for(int i=0;i<9;i++){
            seen.clear();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(seen.contains(board[i][j])){
                    return false;
                }
                seen.add(board[i][j]);
            }
        }
        for(int i=0;i<9;i++){
            seen.clear();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                if(seen.contains(board[j][i])){
                    return false;
                }
                seen.add(board[j][i]);
            }
        }
        for(int k=0;k<9;k++){
            seen.clear();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    int r=(k/3)*3+i;
                    int c=(k%3)*3+j;
                    if(board[r][c]=='.'){
                        continue;
                    }
                    if(seen.contains(board[r][c])){
                        return false;
                    }
                    seen.add(board[r][c]);
                }
            }
        }
        return true;
    }
}
