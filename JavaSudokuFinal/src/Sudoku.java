public class Sudoku {
	
	public int[][] board = {
			{7, 8, 0, 4, 0, 0, 1, 2, 0},
			{6, 0, 0, 0, 7, 5, 0, 0, 9},
			{0, 0, 0, 6, 0, 1, 0, 7, 8},
			{0, 0, 7, 0, 4, 0, 2, 6, 0},
			{0, 0, 1, 0, 5, 0, 9, 3, 0},
			{9, 0, 4, 0, 6, 0, 0, 0, 5},
			{0, 7, 0, 3, 0, 0, 0, 1, 2},
			{1, 2, 0, 0, 0, 7, 4, 0, 0},
			{0, 4, 9, 2, 0, 6, 0, 0, 7}
	};

	public static void main(String[] args) {
		Sudoku myObj = new Sudoku();
		//System.out.println("Rows: " + myObj.board.length);
		//System.out.println("Cols: " + myObj.board[0].length);
		System.out.printf("\nUnsolved board: \n");
		myObj.printBoard(myObj.board);
		
		//System.out.println("Row 8 column 0: " + myObj.board[8][8]);
		
		myObj.solve(myObj.board);
		
		System.out.printf("\nSolved board: \n");
		myObj.printBoard(myObj.board);
		
	}
	
	public boolean solve(int[][] board) {
		int row;
		int col;
		
		int[] find = findEmpty(board);
		if (find[0] == -1) {
			return true;
		} else {
			row = find[0];
			col = find[1];
		}
		
		for (int i = 0; i < 10; i++) {
			if (valid(board, i, row, col)) {
				board[row][col] = i;
				
				if (solve(board)) {
					return true;
				}
				
				board[row][col] = 0;
				
			}
		}
		
		return false;
	}
	
	public boolean valid(int[][] board, int num, int row, int col) {
		// Check row
		for (int i = 0; i < board[0].length; i++) {
			if (board[row][i] == num && col != i) {
				return false;
			}
		}
		
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == num && row != i) {
				return false;
			}
		}
		
		int boardx_x = col / 3;
		int boardx_y = row / 3;
		
		for (int i = (boardx_y * 3); i < (boardx_y * 3 + 3); i++) {
			for (int j = (boardx_x * 3); j < (boardx_x * 3 + 3); j++) {
				if (board[i][j] == num && i != row && j != col) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public void printBoard(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.println("- - - - - - - - - - -");
			}
			
			for (int j = 0; j < board[0].length; j++) {
				if (j % 3== 0 && j != 0) {
					System.out.printf("| ");
				}
				
				if (j == 8) {
					System.out.printf(board[i][j] + "\n");
				} else {
					System.out.printf(board[i][j] + " ");
				}
			}
		}
	}
	
	public int[] findEmpty(int[][] board) {
		int[] results = new int[2];
		for (int i = 0; i < (board.length-1); i++) {
			System.out.println("Row: " + i);
			for (int j = 0; j < (board[0].length); j++) {
				// System.out.printf(i + " ");
				// if (i == 8 && j == 0) {
				// 	System.out.println("Row 8: " + board[8][0]);
				// }
				if (board[i][j] == 0) {
					results[0] = i;
					results[1] = j;
					return results;
				}
			}
		}
		
		results[0] = -1;
		return results;
	}
}