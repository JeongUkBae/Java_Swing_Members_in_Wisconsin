package board.main;

import board.service.BoardService;

public class BoardServiceFactory {
	
	private static BoardService service = null;
	
	private BoardServiceFactory() {
		super();
	}



	public static synchronized BoardService getInstance(){  //�ϳ��� �����ϴϱ� synchronized������.
		if(service ==null){
			
			service = new BoardService();
		}
		return service;
	}

}
