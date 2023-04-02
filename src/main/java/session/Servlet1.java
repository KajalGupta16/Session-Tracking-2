package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");

		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("myUsername", name);

		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body><h1>Welcome to page     " + name + " </h1></body></html>");
		printWriter.write("<h1> <a href='servlet2'>Go to servlet2 </a>  </h1>");

	}
}
