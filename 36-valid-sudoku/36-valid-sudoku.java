class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> row = new HashSet<>();
        HashSet<String> col = new HashSet<>();
        HashSet<String> box = new HashSet<>();
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char val = board[i][j];
                if(val != '.'){
                    if(!row.add(i+"row"+board[i][j]) || 
                       !col.add(j+"col"+board[i][j]) ||
                       !box.add(i/3+""+j/3+"box"+board[i][j]))
                        return false;
                }
            }
        }
        return true;
    }
}