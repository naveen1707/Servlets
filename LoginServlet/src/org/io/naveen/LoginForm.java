package org.io.naveen;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.io.naveen.dto.User;
import org.io.naveen.service.LoginService;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/Login")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId,password;
		
		userId=request.getParameter("userId");
		password=request.getParameter("password");
		LoginService loginservice= new LoginService();
		boolean result=loginservice.authenticate(userId, password);
		System.out.println(result);
		if(result)
		{
			User user=loginservice.getuserdetails(userId);
			//request.getSession().setAttribute("user", user);
			//response.sendRedirect("sucess.jsp");
			request.setAttribute("user", user);
			RequestDispatcher dispatcher=request.getRequestDispatcher("sucess.jsp");
			dispatcher.forward(request,response);
			return;
		}
		else
    		{
				response.sendRedirect("login.jsp");
				return;
			}
	}

}
