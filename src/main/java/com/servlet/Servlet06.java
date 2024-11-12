package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dan")
public class Servlet06 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 넘어온 단을 받아 해당 구구단을 웹브라우저에 출력하기
		// 예) 2 > 2 * 1 = 2 .... 
		
		String strDan = request.getParameter("dan");
		
		int dan = 0;
		
		if(strDan != null) {
			dan = Integer.parseInt(strDan);
		}
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>구구단</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h2>구구단 보기</h2>");
		
		if(dan < 2 || dan > 9) {
			out.print("<h2>숫자 2부터 9사이만 입력해주세요</h2>");
		}else {
			
			for(int i = 1; i < 10; i++) {
				
				out.print("<h3>" + dan + " X " + i + " = " + (dan*i) + "</h3>");
				
			}
			
			
		}
		
		out.print("</body>");
		out.print("</html>");
		
		out.close();
		
		
	}

}
