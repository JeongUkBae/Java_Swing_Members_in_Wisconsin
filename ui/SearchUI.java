package board.ui;

import java.util.ArrayList;

import board.vo.BoardVO;

public class SearchUI  extends BaseUI{

	@Override
	public void execute() throws Exception{
		System.out.println("��ü �Խñ� ��ȸ �޴� ����");
		ArrayList<BoardVO> boardList = service.selectBoard();
		
		//��ü�Խñ� ȭ�鿡 ���
		System.out.println("�Խù� ���: "+ boardList.size()+ "��");
		System.out.println("=================================================");
		System.out.println("��ȣ\t�۾���\t�����\t\t����");
		System.out.println("=================================================");
		for(BoardVO vo : boardList){
			System.out.print(vo.getNo()+"\t");
			System.out.print(vo.getWriter()+"\t");
			System.out.print(vo.getRegDate()+"\t");
			System.out.println(vo.getTitle()+"\t");
		}
		if(boardList.size() == 0)
			System.out.println("\t��ȸ�� �Խñ��� �����ϴ�.");
		System.out.println("=================================================");
	}
}
