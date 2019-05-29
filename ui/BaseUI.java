package board.ui;

import java.util.Scanner;

import board.main.BoardSequence;
import board.main.BoardServiceFactory;
import board.service.BoardService;

public abstract class BaseUI implements IBoardUI{
	private Scanner scan;
	protected BoardService service;
	
	public BaseUI() {
		 scan = new Scanner(System.in);
		 service = BoardServiceFactory.getInstance();
		 
	}

	String scanStr(String msg) {
		System.out.print(msg);
		return scan.nextLine();
	}

	int scanInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(scan.nextLine());
	}
}
