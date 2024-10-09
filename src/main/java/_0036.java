// https://leetcode.com/problems/valid-sudoku/description
public class _0036 {
    private boolean isSafeInRow(char[][] board, int[] position) {
        final var row = position[0];
        final var column = position[1];
        final var compareWith = board[row][column];

        var safe = true;
        for (var i = 0; i < 9; i++) {
            if (i != column && board[row][i] == compareWith) {
                safe = false;
                break;
            }
        }

        return safe;
    }

    private boolean isSafeInColumn(char[][] board, int[] position) {
        final var row = position[0];
        final var column = position[1];
        final var compareWith = board[row][column];

        var safe = true;
        for (var i = 0; i < 9; i++) {
            if (i != row && board[i][column] == compareWith) {
                safe = false;
                break;
            }
        }

        return safe;
    }

    private boolean isSafeInBox(char[][] board, int[] position) {
        final var row = position[0];
        final var column = position[1];
        final var compareWith = board[row][column];
        final var boxRow = row / 3 * 3;
        final var boxColumn = column / 3 * 3;
        var safe = true;

        for (var i = 0; i < 3; i++) {
            final var rowIndex = boxRow + i;
            for (var j = 0; j < 3; j++) {
                final var columnIndex = boxColumn + j;

                if (rowIndex == row && columnIndex == column) {
                } else if (board[rowIndex][columnIndex] == compareWith) {
                    safe = false;
                    break;
                }
            }
        }

        return safe;
    }

    public boolean isValidSudoku(char[][] board) {
        var result = true;
        for (var i = 0; i < 9; i++) {
            for (var j = 0; j < 9; j++) {
                final var position = new int[] { i, j };
                if (board[i][j] == '.') {
                    continue;
                }
                if (!(isSafeInRow(board, position) && isSafeInColumn(board, position)
                        && isSafeInBox(board, position))) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
