package Medium;

public class Word_Search {
    public static void main(String[] args) {
       char[][] board = {{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
       boolean ans = exist(board,"ABCCED");
        System.out.println(ans);

    }

    static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[i].length ; j++) {
                if (board[i][j] == word.charAt(0) && checkCell(board,word,i,j,0)) {
                    return true;
                }

            }
        }
        return false;
    }
    static boolean checkCell(char[][] board,String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';

        boolean found = checkCell(board,word,i+1,j,index+1)
                ||  checkCell(board,word,i-1,j,index+1)
                ||  checkCell(board,word,i,j+1,index+1)
                || checkCell(board,word,i,j-1,index+1);

        board[i][j] = temp;
        return found;


    }
}
