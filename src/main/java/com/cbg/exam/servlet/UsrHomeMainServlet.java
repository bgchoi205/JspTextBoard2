package com.cbg.exam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HomeMainServlet")
public class UsrHomeMainServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		
		//������ �Ķ���͸� UTF-8�� �ؼ�.
		request.setCharacterEncoding("UTF-8");
		
		// ������ HTML ������ ���� �� UTF-8�� ����.
		response.setCharacterEncoding("UTF-8");
		
		// HTML�� UTF-8 �����̶�� ���� �������� �˸�.
		response.setContentType("text/html; charset=UTF-8");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}