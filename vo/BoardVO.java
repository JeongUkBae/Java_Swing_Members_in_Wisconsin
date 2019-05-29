package board.vo;

import java.io.Serializable;
import java.util.Date;

/*
 * �⺻������ ���� 		: alt + shift + s ���� �� c
 * �Ű����������� ����	: alt + shift + s ���� �� o
 * getter/setter ����	: alt + shift + s ���� �� r
 * override �޼ҵ� ����	: alt + shift + s ���� �� v
 * toString �޼ҵ� ����	: alt + shift + s ���� �� s
 */

public class BoardVO implements Serializable{

	private int no;
	private String title;
	private String writer;
	private Date regDate;

	public BoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardVO(int no, String title, String writer, Date sregDate) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.regDate = sregDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer
				+ ", sregDate=" + regDate + "]";
	}
	
	

}
