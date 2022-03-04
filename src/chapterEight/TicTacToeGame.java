package chapterEight;

public class TicTacToeGame {
    private Symbol symbol;
    private final Symbol[][] board;

    public TicTacToeGame() {
        board = new Symbol[][]{
                {Symbol.E, Symbol.E, Symbol.E},
                {Symbol.E, Symbol.E, Symbol.E},
                {Symbol.E, Symbol.E, Symbol.E}
        };
    }

    public void playerInput(int position, Symbol symbol) {
        switch (position) {
            case 1 -> board[0][0] = symbol;
            case 2 -> board[0][1] = symbol;
            case 3 -> board[0][2] = symbol;
            case 4 -> board[1][0] = symbol;
            case 5 -> board[1][1] = symbol;
            case 6 -> board[1][2] = symbol;
            case 7 -> board[2][0] = symbol;
            case 8 -> board[2][1] = symbol;
            case 9 -> board[2][2] = symbol;
        }
    }

    public boolean isPositionOccupied(int position) {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;
        return board[row][col] != Symbol.E;
    }
    public boolean isValidMove(int position) {
        return position > 0 && position < 10;
    }
    public boolean boardIsFull() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == Symbol.E){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isAWinner(Symbol symbol) {
        if ((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }
        return false;
    }

    public void displayBoard() {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("\n".repeat(2));
    }
}
    


