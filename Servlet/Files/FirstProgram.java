package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;

public class FirstProgram implements Servlet {
	ServletConfig con;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method called!");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method called!");
		con = config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method called!");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Welcome to Servlet!!");
		out.println("Today  " + new Date().toString());
		System.out.println(getServletConfig());
		System.out.println(getServletInfo());
	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return con;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "My First Program!";
	}
}
