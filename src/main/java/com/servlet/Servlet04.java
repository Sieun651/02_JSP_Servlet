package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/student")
public class Servlet04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// request 객체를 사용하여 넘어온 파라미터 값을 받아 해당 변수에 저장하기
		request.setCharacterEncoding("UTF-8");
		
		// studentID, name, age, tel, major, circle[checkbox]
		
		String studentID = request.getParameter("studentID");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String tel = request.getParameter("tel");
		String major = request.getParameter("major");
		
		String[] circle = request.getParameterValues("circle");
		
		// response 객체를 사용하여 학생정보를 웹브라우저에 출력하기
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>학생정보</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h2>학생정보 보기</h2>");
		out.print("학번 : " + studentID + "<br>");
		out.print("이름 : " + name + "<br>");
		out.print("나이 : " + age + "<br>");
		out.print("전화번호 : " + tel + "<br>");
		out.print("전공 : " + major + "<br>");
		out.print("동아리 : " + Arrays.toString(circle) + "<br>");
		out.print("</body>");
		out.print("</html>");
		
		out.close();
		
		
		
	}

}
