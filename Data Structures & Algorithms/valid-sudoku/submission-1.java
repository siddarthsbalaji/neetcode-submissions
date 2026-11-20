class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<9;i++){
            set.clear();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(set.contains(board[i][j])){
                    return false;
                }
                else{
                    set.add(board[i][j]);
                }
            }
            set.clear();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                if(set.contains(board[j][i])){
                    return false;
                }
                else{
                    set.add(board[j][i]);
                }
            }
            set.clear();
            int br=3*(i/3);
            int bc=3*(i%3);
            for(int k=0;k<3;k++){
                for(int l=0;l<3;l++){
                    if(board[k+br][l+bc]=='.'){
                        continue;
                    }
                    if(set.contains(board[k+br][l+bc])){
                        return false;
                    }
                    else{
                        set.add(board[k+br][l+bc]);
                    }
                }
            }
        }
        return true;
    }
}
