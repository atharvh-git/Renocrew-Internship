package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("username");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String course = req.getParameter("course");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h2>Name: " + name + "</h2>");
		out.println("<h2>Email: " + email + "</h2>");
		out.println("<h2>Password: " + password + "</h2>");
		out.println("<h2>Course: " + course + "</h2>");
		
	}
}
