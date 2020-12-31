package co.semi.board.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.semi.dao.BoardDAO;
import co.semi.vo.BoardVO;

@WebServlet("/BoardSearch.do")
public class BoardSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardSearchController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		BoardDAO dao = new BoardDAO();
		BoardVO vo = new BoardVO();
		
		vo.setBoardnumber(Integer.parseInt(request.getParameter("id")));
		vo = dao.selectSearch(vo);
		
		request.setAttribute("vo", vo);
		String viewPage = "jsp/board/boardEdit.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
