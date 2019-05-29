package board.ui;

import java.util.Scanner;

import board.vo.BoardVO;

public class UpdateUI extends BaseUI {

	private Scanner scan = new Scanner(System.in);

	public void execute() throws Exception {
		int no = scanInt("������ �� ��ȣ�� �Է��ϼ���: ");
		String title = scanStr("������ �� ������ �Է��ϼ���: ");
		BoardVO board = new BoardVO();
		board.setNo(no);
		board.setTitle(title);

		boolean result = service.updateBoard(board);
		if (result)
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		else
			System.out.println(no + "�� �Խù��� �������� �ʾƼ� ������ �����Ͽ����ϴ�.");
	}

	int scanInt(String msg) {
		System.out.print(msg);

		return Integer.parseInt(scan.nextLine());
	}

	String scanStr(String msg) {
		System.out.print(msg);
		return scan.nextLine();
	}

}
