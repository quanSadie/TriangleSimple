
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculator
 */
@WebServlet("/CheckTriangle")
public class CheckTriangle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CheckTriangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		int n3 = Integer.parseInt(request.getParameter("num3"));
		int chuvi = 0;
		double dientich = 0;
		if (n1 <= 0 || n2 <= 0 || n3 <= 0) {
			request.setAttribute("t", "Khong la tam giac");
		} else if (n1 + n2 <= n3 || n2 + n3 <= n1 || n1 + n3 <= n2) {
			request.setAttribute("t", "Khong la tam giac");
		} else {
			chuvi = n1 + n2 + n3;
			double p = (n1 + n2 + n3) / 2;

			dientich = Math.sqrt(p * (p - n1) * (p - n2) * (p - n3));
			request.setAttribute("s1", n1);
			request.setAttribute("s2", n2);
			request.setAttribute("s3", n3);
			request.setAttribute("t", "La tam giac");
			request.setAttribute("cv", chuvi);
			request.setAttribute("dt", dientich);
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

}
