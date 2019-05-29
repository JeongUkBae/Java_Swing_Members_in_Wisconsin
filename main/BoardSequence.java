package board.main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BoardSequence implements Serializable {

	private static int no;
	private FileOutputStream fos = null;
	private ObjectOutputStream oos = null;
	
	public BoardSequence() {
		//System.out.println("������ ȣ��");
	}
	
	public synchronized int getNo() {

		try {
			fos = new FileOutputStream("D:/sequence.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeInt(no);
			//System.out.println("���Ͽ� ��ü������ �Ϸ�Ǿ����ϴ�.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(oos != null)
				oos.close();
				if(fos != null)
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		//System.err.println(no);
		return no++;
	}
	
	public synchronized void setNo(int no){
		this.no = no; 
	}
	


}
