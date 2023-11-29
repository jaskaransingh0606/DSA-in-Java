public class SudokuSolver {

    public boolean solveSudoku(int[][] board) {
        int[] emptyCell = findEmptyCell(board);
        int row = emptyCell[0];
        int col = emptyCell[1];

        if (row == -1 && col == -1) {
            return true; // If no empty cell, puzzle solved
        }

        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;

                if (solveSudoku(board)) {
                    return true; // If the current number works, move to the next cell
                }

                board[row][col] = 0; // Backtrack if the number doesn't work
            }
        }

        return false; // No solution exists
    }

    public int[] findEmptyCell(int[][] board) {
        int[] cell = {-1, -1};
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    cell[0] = i;
                    cell[1] = j;
                    return cell;
                }
            }
        }
        return cell;
    }

    public boolean isSafe(int[][] board, int row, int col, int num) {
        // Check row
        for (int x = 0; x < 9; x++) {
            if (board[row][x] == num) {
                return false;
            }
        }

        // Check column
        for (int y = 0; y < 9; y++) {
            if (board[y][col] == num) {
                return false;
            }
        }

        // Check subgrid
        int startRow = 3 * (row / 3);
        int startCol = 3 * (col / 3);
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (board[x + startRow][y + startCol] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        SudokuSolver solver = new SudokuSolver();
        if (solver.solveSudoku(board)) {
            System.out.println("Sudoku Solved:");
            solver.printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}