class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                char c=board[i][j];
                if((!set.add(c+"row"+i))||(!set.add(c+"col"+j))||(!set.add(c+"box"+(i/3)+(j/3)))){
                    return false;
                }
            }
        }
        return true;
    }
}
