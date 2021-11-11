package ezen;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyTime
 */
@WebServlet("/time.do")
public class MyTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyTime() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet�� ȣ�� �Ǿ����ϴ�.");
		// ���� ��¥ ���ϱ�
		LocalDate now = LocalDate.now();
		// ���� ����
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		// ���� ����
		String formatedNow = now.format(formatter);
		// ��� ���
		System.out.println(formatedNow);
		
		String html = "";
		html += "<html>";
		html += "<body>";
		html += "<h2>Hello, ezen</h2>";
		html += "<p>today is <Strong>" + formatedNow + "</Strong></p>";
		html += "</body>";
		html += "</html>";
		
		response.getWriter().append(html);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
