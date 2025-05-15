package com.login;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		if(name.equals("Ujwal") && pass.equals("shinde") ) {
			
			HttpSession session = req.getSession();
			session.setAttribute("username", name);
			res.sendRedirect("welcome.jsp");
		}
		else {
			res.sendRedirect("login.jsp");
		}
	}

}
