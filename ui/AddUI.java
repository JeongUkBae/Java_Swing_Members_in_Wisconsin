package board.ui;

import java.util.Scanner;

import board.vo.BoardVO;

public class AddUI extends BaseUI {

	private Scanner scan = new Scanner(System.in);

	public void execute() throws Exception {
		String title = scanStr("������ �Է��ϼ���: ");
		String writer = scanStr("�۾��̸� �Է��ϼ���: ");

		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		//board.setNo(seq.getNo());
		service.insertBoard(board);
	}

	String scanStr(String msg) {
		System.out.print(msg);
		return scan.nextLine();
	}
}
