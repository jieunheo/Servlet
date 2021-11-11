package ezen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyCal
 */
@WebServlet("/mul.do")
public class MyMul extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyMul() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter html = response.getWriter();
		html.print("<html><head><title>구구단을 외자</title><style>body {text-align: center;}</style></head>");
		html.print("<body>");
		String x = request.getParameter("x");
		
		if (x == "") {
			html.print("<h2>Oops!!</h2><h3>No Data</h3>");
		} else
		{
			try {
				int ix = Integer.parseInt(x);
				if (ix > 9) {
					html.print("<h2>구구단인데 9까지만 적어야지!!!</h2>");
				} else {
					html.print("<h3>" + x + "단</h3>");
					for (int i=1; i<=9; i++)
					{
						int z = ix * i;
						html.print("<p>" + ix + " * " + i + " = " + z + "</p>");
					}	
				}
			} catch (NumberFormatException e) {
				html.print("<h2>Oops!!</h2><h3>Not a Number</h3>");
			}
		}
		html.println("<a href='http://localhost:8080/MyWeb/mul.html'>다시 검색</a>");
		html.println("</body></html>");
		html.close();
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
