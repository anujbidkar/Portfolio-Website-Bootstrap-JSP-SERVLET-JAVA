package com.wisdomsprouts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DoAddtion")
public class DoAddtion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DoAddtion() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("hello from GET ");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(request.getParameter("numberone"));
		int j = Integer.parseInt(request.getParameter("numbertwo"));
		
		int c = i+j;
		System.out.print("addition is :"+c);
		
		PrintWriter out = response.getWriter();
	
		out.print("addition is "+c);
//		
		
	}

}
