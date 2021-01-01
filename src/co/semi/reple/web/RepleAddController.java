package co.semi.reple.web;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.semi.dao.RepleDAO;
import co.semi.vo.RepleVO;

@WebServlet("/RepleAdd.do")
public class RepleAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RepleAddController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();//세션값 session으로 지정
		
		RepleDAO dao = new RepleDAO();
		RepleVO vo = new RepleVO();
		
		vo.setReplenumber(Integer.parseInt(request.getParameter("rNum")));
		vo.setPassword(request.getParameter("password"));
		vo.setReplecontent(request.getParameter("rContent"));
		vo.setRepleid(request.getParameter("rId"));
		
		int id = (int) session.getAttribute("rId");
		vo.setBoardnumber(id);
		int n = dao.insert(vo);
		
		if (n != 0) {
			String viewPage = ("BoardRead.do");
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		} else {
			String msg = "데이터베이스에 정상적으로 입력하지 못하였습니다.";
			request.setAttribute("msg", msg);
			String viewPage = "jsp/board/inputError.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
