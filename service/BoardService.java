package board.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Date;

import board.dao.BoardDAO;
import board.main.BoardSequence;
import board.vo.BoardVO;

public class BoardService {
	private BoardDAO dao;
	private BoardSequence seq;
	
	public BoardService() {
		dao = new BoardDAO();
		seq = new BoardSequence();
		seq.setNo(getSeq());
	}

	public void insertBoard(BoardVO board) {
		//System.out.println("�Խñ��� ����ϴ� ���� �޼ҵ� ȣ��...");
		board.setNo(seq.getNo());
		board.setRegDate(new Date());
		dao.insertBoard(board);
	}

	public boolean updateBoard(BoardVO board) {
		//System.out.println("�Խñ��� �����ϴ� ���� �޼ҵ� ȣ��...");
		return dao.updateBoard(board);
		
	}

	public boolean deleteBoard(BoardVO board) {
		//System.out.println("�Խñ��� �����ϴ� ���� �޼ҵ� ȣ��...");

		return dao.deleteBoard(board); 
	}

	public BoardVO selectOneBoard(BoardVO board) throws Exception{
		//System.out.println("�۹�ȣ�� ��ȸ�ϴ� ���� �޼ҵ� ȣ��...");
		
		return dao.selectOneBoard(board);
	}

	public ArrayList selectBoard() {
		//System.out.println("��ü�Խù��� ��ȸ�ϴ� ���� �޼ҵ� ȣ��...");
		ArrayList list = dao.selectBoard();
		return list;
	}
	
	public void exitBoard(){
		dao.exitBoard();
	}
	
	public int getSeq(){
		FileInputStream fis =null;
		ObjectInputStream ois = null;
		int no = 1;
		try {
			fis = new FileInputStream("D:/sequence.txt");
			ois = new ObjectInputStream(fis);
			no = (int)ois.readInt()+1;
			//System.out.println("���Ͽ��� �б⸦ �Ϸ��Ͽ����ϴ�.");
			
		} catch (Exception e) {
			//e.printStackTrace();
			no = 1;
		}finally{
			try {
				if(fis != null)
				fis.close();
				if(ois != null)
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return no;
	}

}
