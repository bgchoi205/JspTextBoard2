package com.cbg.exam.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/usr/article/doWrite")
public class UsrArticleDoWriteServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//������ �Ķ���͸� UTF-8�� �ؼ�.
		request.setCharacterEncoding("UTF-8");
		
		// ������ HTML ������ ���� �� UTF-8�� ����.
		response.setCharacterEncoding("UTF-8");
		
		// HTML�� UTF-8 �����̶�� ���� �������� �˸�.
		response.setContentType("text/html; charset=UTF-8");
		
		String title = request.getParameter("title");
		String body = request.getParameter("body");
		
		response.getWriter().append(title + "<br>");
		response.getWriter().append(body + "<br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		doGet(request, response);
	}

}