package co.semi.edu.web;

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

/**
 * Servlet implementation class EduListController
 */
@WebServlet("/EduList.do")
public class EduListController extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    public EduListController() {
        super();
    }
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("utf-8");
      // db 호출
      EduDAO dao = new EduDAO();
      EduVO vo = new EduVO();
      
      ArrayList<EduVO> list = dao.selectAllList(vo);
      
      request.setAttribute("list", list);
      
      String viewPage = "jsp/edu/eduMain.jsp";
      RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
      dispatcher.forward(request, response);
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }

}