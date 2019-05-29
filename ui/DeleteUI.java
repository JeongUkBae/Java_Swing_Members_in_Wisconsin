package board.ui;

import java.util.Scanner;

import board.vo.BoardVO;

public class DeleteUI extends BaseUI {

	private Scanner scan = new Scanner(System.in);

	public void execute() throws Exception {
		int no = scanInt("������ �� ��ȣ�� �Է��ϼ���: ");

		BoardVO board = new BoardVO();
		board.setNo(no);

		boolean bool = service.deleteBoard(board);
		if (bool) {
			System.out.println(no + "�� �Խñ��� �����Ǿ����ϴ�.");
		} else
			System.out.println(no + "�� �Խù��� ��� ���� �����Ͽ����ϴ�.");
	}

	int scanInt(String msg) {
		System.out.print(msg);

		return Integer.parseInt(scan.nextLine());
	}
}
