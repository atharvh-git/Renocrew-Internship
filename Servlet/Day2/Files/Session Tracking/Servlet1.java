package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("nm");
		PrintWriter out = resp.getWriter();
		
		Cookie ck = new Cookie("nm", name);
		resp.addCookie(ck);
		
		resp.setContentType("text/html");
		out.println("Welcome to Servlet name = "+ name);
		
		out.println("<br><a href='servlet2'>Servlet2</a>");
	}
	
}
