package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.controller.UserController;
import com.model.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String pass=request.getParameter("pass");
		String submit=request.getParameter("submit");
		
		if(submit.equalsIgnoreCase("Register"))
		{
			User u=new User(username,pass);
			UserController.addUser(u);
			response.sendRedirect("show.jsp");
		}
		
		if(submit.equalsIgnoreCase("Delete")) {
			int id=Integer.parseInt(request.getParameter("id"));
			User u=UserController.getUser(id);
			UserController.deleteUser(u);
			response.sendRedirect("show.jsp");
			
		}
		if(submit.equalsIgnoreCase("Edit")) {
			int id=Integer.parseInt(request.getParameter("id"));
			User u=UserController.getUser(id);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			request.setAttribute("userdata", u);
			rd.forward(request, response);
		}
		
		if(submit.equalsIgnoreCase("Update")) {
			int id=Integer.parseInt(request.getParameter("id"));
			User u=new User(id,username,pass);
			UserController.updateUser(u);
			response.sendRedirect("show.jsp");   
		}
		
		if(submit.equalsIgnoreCase("login")) {
			
			User u=new User(username,pass);
			int i= UserController.loginUser(u);
			if(i==1)
			{
				response.sendRedirect("index.jsp");
				
			}else {
				response.sendRedirect("login.jsp");
			}
			
		}
		

}
}
