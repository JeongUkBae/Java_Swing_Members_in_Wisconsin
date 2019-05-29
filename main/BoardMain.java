package board.main;

import board.ui.BoardUI;


public class BoardMain {

	public static void main(String[] args) {

		BoardUI ui = new BoardUI();
		
		try {
			ui.excute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
