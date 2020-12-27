package co.semi.edu.dao;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EduListServ.do")
public class EduListServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EduListServ() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		EduDAO dao = null;
		dao = new EduDAO();
		ArrayList<EduVO>elist = new ArrayList<EduVO>();
		elist = dao.select("sub");
		request.setAttribute("edulists", elist);
		String viewPage = "<%=request.getContextPath() %>/jsp/edu/edu";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
