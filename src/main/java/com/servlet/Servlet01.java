package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 어노테이션이란 메타데이터라고 볼 수 있다.
// 프로그램 실행 관점에서보면 프로그램이 처리할 메인 데이터가 아니라 
// 실행과정에서 데이터를 어떻게 처리할것인지 알려주는 서브 데이터이다.
// 자바 코드에 @를 이용해 주석처럼 달아 특수한 의미를 부여해준다.
// 어노테이션을 사용하면 코드가 깔끔해지고 재사용이 가능하다.

// URL 맵핑은 어노테이션을 사용하거나
// web.xml에 작성하는 방식이 있다.
/*@WebServlet("/hello")*/
public class Servlet01 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	// 직렬화 키
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// request : 클라이언트로부터의 요청처리 객체
		// 예) 로그인시 : 클라이언트의 아이디와 비밀번호 정보는 request 객체에 담겨져 온다.
		// response : 클라이언트로의 응답처리 객체
		// 예) 로그인시 : 회원인지 아닌지 정보를 클라이언트한테 보낸다.
		
		response.setCharacterEncoding("UTF-8");
		// 해당 문서를 utf-8 로 인코딩을 하여 웹브라우저에게 전송한다.
		
		response.setContentType("text/html; charset=UTF-8");
		// 웹브라우저에게 html문서를 utf-8로 해석하라는 뜻
		
		PrintWriter out = response.getWriter();
		// 웹브라우저에게 출력하기 위한 출력스트림 객체 얻기
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>서블릿</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h2>Hello World</h2>");
		out.print("<h2>서블릿 시작합니다.</h2>");
		out.print("</body>");
		out.print("</html>");
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}






