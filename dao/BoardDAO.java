package board.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import board.vo.BoardVO;

public class BoardDAO {

	ArrayList<BoardVO> boardList;
	private FileOutputStream fos = null;
	private ObjectOutputStream oos = null;
	private FileInputStream fis = null;
	private ObjectInputStream ois = null;

	public BoardDAO() {
		boardList = new ArrayList<>();
		try {
			fis = new FileInputStream("D:/file.txt");
			ois = new ObjectInputStream(fis);

			int size = (int)ois.readInt();
			
			for (int i =0; i < size; i ++){
			BoardVO vo = (BoardVO) ois.readObject();
			boardList.add(vo);
			}


			// }
			// System.out.println("���Ͽ��� �б⸦ �Ϸ��Ͽ����ϴ�.");

		} catch (Exception e) {
			//e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void insertBoard(BoardVO board) {
		boardList.add(board);
	}

	public BoardVO selectOneBoard(BoardVO board) {
		for (BoardVO vo : boardList) {
			if (vo != null && vo.getNo() == board.getNo())
				return vo;
		}
		return null;
	}

	public ArrayList selectBoard() {

		// ArrayList<BoardVO> list = new ArrayList<>();
		// list.addAll(boardList);

		return boardList;
	}

	public boolean updateBoard(BoardVO board) {

		if (boardList.isEmpty())
			return false;

		for (BoardVO vo : boardList) {
			if (board.getNo() == vo.getNo()) {
				vo.setTitle(board.getTitle());
				return true;
			}
		}
		return false;
	}

	public boolean deleteBoard(BoardVO board) {
		if (boardList.isEmpty())
			return false;

		for (BoardVO vo : boardList) {
			if (vo != null && vo.getNo() == board.getNo()) {
				boardList.remove(vo);
				return true;
			}
		}

		return false;
	}

	public void exitBoard() {
		try {
			fos = new FileOutputStream("D:/file.txt");
			oos = new ObjectOutputStream(fos);

			oos.writeInt(boardList.size());

			for (BoardVO vo : boardList) {
				oos.writeObject(vo);
			}
			// System.out.println("���Ͽ� ��ü������ �Ϸ�Ǿ����ϴ�.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
				if (oos != null)
					oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}

		}
	}

}