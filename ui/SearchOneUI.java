package board.ui;

import java.util.Scanner;

import board.vo.BoardVO;

public class SearchOneUI extends BaseUI {
	private Scanner scan = new Scanner(System.in);

	public void execute() throws Exception {
		int no = scanInt("��ȸ�� �� ��ȣ�� �Է��ϼ���: ");

		BoardVO board = new BoardVO();
		board.setNo(no);

		BoardVO result = service.selectOneBoard(board);

		System.out.println("=================================================");
		if (result != null) {
			System.out.println("��ȣ: " + result.getNo());
			System.out.println("����: " + result.getTitle());
			System.out.println("�۾���: " + result.getWriter());
			System.out.println("��¥: " + result.getRegDate());
		} else
			System.out.println(no + "�� �Խù��� �������� �ʽ��ϴ�.");
		System.out.println("=================================================");

	}

	int scanInt(String msg) {
		System.out.print(msg);

		return Integer.parseInt(scan.nextLine());
	}
}
