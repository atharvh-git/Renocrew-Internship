package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")

public class RequestDispatch1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String emailString = req.getParameter("email");
		String password = req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		RequestDispatcher rd;
		if("demo@gmail.com".equals(emailString) && "demo".equals(password)) {
			//redirecting to home page
			resp.sendRedirect("servlet2");
		}else {
			// redirecting to Login Page
			out.println("<h3>Invalid Email ID and Password!</h3>");
			rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
		
		
	}

}
