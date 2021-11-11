package ezen;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyCal
 */
@WebServlet("/cal.do")
public class MyCal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyCal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String html = "";
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String op = request.getParameter("op");
		
		if (x == "" || y == "" || op == "") {
			html = "No Data!";
		} else
		{
			try {
				int ix = Integer.parseInt(x);
				int iy = Integer.parseInt(y);
				int iz = 0;
				switch (op) {
					case "+":
						iz = ix + iy;
						break;
					case "-":
						iz = ix - iy;
						break;
					case "*":
						iz = ix * iy;
						break;
					case "/":
						iz = ix / iy;
						break;
				}
				html += iz + "";
			} catch (NumberFormatException e) {
				html = "Not a Number";
			} catch (ArithmeticException  e) {
				html = "y is 0";
			}
		}
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
