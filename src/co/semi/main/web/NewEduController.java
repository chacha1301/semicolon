package co.semi.main.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.semi.dao.EduDAO;
import co.semi.vo.EduVO;

@WebServlet("/NewEdu.do")
public class NewEduController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewEduController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		EduDAO dao = new EduDAO();
		EduVO vo = new EduVO();
				
		System.out.println(request.getParameter("newEdu"));
		
		vo.setEduNumber(Integer.parseInt(request.getParameter("newEdu")));
		ArrayList<EduVO> list = dao.getMainNew(vo);
		
		request.setAttribute("list", list);
		
		String viewPage ="jsp/menu/main_1.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
