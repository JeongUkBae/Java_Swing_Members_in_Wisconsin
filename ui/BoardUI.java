package board.ui;

public class BoardUI extends BaseUI{

	public void excute() throws Exception{

		while (true) {
			IBoardUI ui = null;
			String type = menu();			
			switch (type) {
			case "1":
				ui = new SearchUI(); // ��ü�Խñ� ��ȸ
				break;
			case "2":
				ui = new SearchOneUI(); // �۹�ȣ ��ȸ
				break;
			case "3":
				ui = new AddUI();  //�۵��
				break;
			case "4":
				ui = new UpdateUI(); // �� ����
				break;
			case "5":
				ui = new DeleteUI(); // �� ����
				break;
			case "0":
				ui = new ExitUI(); // ���α׷� ����
				break;
			}
			ui.execute();
		}
	}

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		
	}

	String menu() {
		System.out.println("----------------------------------------");
		System.out.println("    �Խñ� ���� ���α׷�");
		System.out.println("----------------------------------------");
		System.out.println("    1. ��ü �Խñ� ��ȸ");
		System.out.println("    2. �۹�ȣ ��ȸ");
		System.out.println("    3. �� ���");
		System.out.println("    4. �� ����");
		System.out.println("    5. �� ����");
		System.out.println("    0. ���α׷� ����");
		System.out.println("----------------------------------------");
		String type = scanStr("�޴� �� ó���� �׸��� �����ϼ���: ");

		return type;
	}

}
