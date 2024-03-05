package com.pro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet1")
public class Servlet8 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(req.getParameter("fn"));
		int num2 = Integer.parseInt(req.getParameter("sn"));
		
		int sum = num1 + num2;
		
		req.setAttribute("s", sum);
		
		RequestDispatcher rd = req.getRequestDispatcher("/servlet2");
		rd.forward(req, resp);
	}
	
}
