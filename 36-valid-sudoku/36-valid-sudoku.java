class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0; i<9 ; i++){
            int[] countCheckRow = new int[10];
            int[] countCheckCol = new int[10];
            for(int j=0; j<9; j++){
                if(Character.compare(board[i][j],'.')!=0){
                    countCheckRow[Integer.parseInt(String.valueOf(board[i][j]))]++;
                    if(countCheckRow[Integer.parseInt(String.valueOf(board[i][j]))]>1)
                        return false;
                }
                
                if(Character.compare(board[j][i],'.')!=0){
                    countCheckCol[Integer.parseInt(String.valueOf(board[j][i]))]++;
                    if(countCheckCol[Integer.parseInt(String.valueOf(board[j][i]))]>1)
                        return false;
                }
                
            }
        }
        
        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                int[] countCheckBox = new int[10];
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                    System.out.println(k+""+l);
                    if(Character.compare(board[k][l],'.')!=0){
                        countCheckBox[Integer.parseInt(String.valueOf(board[k][l]))]++;
                            if(countCheckBox[Integer.parseInt(String.valueOf(board[k][l]))]>1)
                                return false;
                    }
                }
            }
        }
    }
        
        
        return true;
    }
}