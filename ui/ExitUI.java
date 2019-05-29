package board.ui;

public class ExitUI extends BaseUI{

	@Override
	public void execute() throws Exception{
		System.out.println("�Խ��� ���α׷��� �����մϴ�.");
		service.exitBoard();
		System.exit(0); // ���α׷��� �����Ű�� �޼ҵ�
	}

}
