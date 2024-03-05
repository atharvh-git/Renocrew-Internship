package com.pro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet9 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(req.getParameter("fn"));
		int num2 = Integer.parseInt(req.getParameter("sn"));
		
		int sum = (int) req.getAttribute("s");
		int mul = num1 * num2;
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h2>Sum = " + sum + ", Multiplication = " + mul + "</h2>");
		
	}
	
}
