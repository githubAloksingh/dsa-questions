 class Solution {
    
     private List<List<String>> res = new ArrayList<>();
     
    public List<List<String>> solveNQueens(int n) {
        List<String> board = new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder row = new StringBuilder();
            for(int j=0;j<n;j++){
                row.append('.');
            }
            board.add(row.toString());
        }
            solve(board,0,n);
            return res;
        }
     
     
     
     private void solve(List<String> board, int row, int n){
         if(row==n){
             res.add(new ArrayList<>(board));
             return;
         }
         for(int col=0;col<n;col++){
             if(isValid(board,row, col,n)){
                 StringBuilder newRow = new StringBuilder(board.get(row));
                 newRow.setCharAt(col,'Q');
                 board.set(row, newRow.toString());
                 solve(board,row+1, n);
                 
                 newRow.setCharAt(col,'.');
                 board.set(row, newRow.toString());
             }
         }
     }
     private boolean isValid(List<String> board, int row, int col, int n){
         for(int i=row-1;i>=0;i--){
             if(board.get(i).charAt(col) == 'Q'){
                 return false;
             }
         }
         for(int i=row-1,j=col-1; i>=0&&j>=0; i--,j--){
              if(board.get(i).charAt(j) == 'Q'){
                 return false;
             }
         }
         for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
              if(board.get(i).charAt(j) == 'Q'){
                 return false;
             }
         
     }
         return true;
     
 }
 }
        