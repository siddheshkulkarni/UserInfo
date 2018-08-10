package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegistrationDao;
import com.model.Users;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String firstname = request.getParameter("firstname");
	  String lastname = request.getParameter("lastname");
	  String address = request.getParameter("address");
	  String nationality = request.getParameter("nationality");
	  String username = request.getParameter("username");
	  String password = request.getParameter("password");
	  
	  Users user = new Users(firstname, lastname, address, nationality, username, password);
	  RegistrationDao dao = new RegistrationDao();
	  boolean hasRegistered = dao.register(user);
	  if (hasRegistered) {
	    response.sendRedirect("login.jsp");	  
	  }
	}

}
