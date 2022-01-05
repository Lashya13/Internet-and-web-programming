import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
@WebServlet("/servelet2")
public class servelet2 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
//		res.setContentType("text/html");
		Cookie c[] = req.getCookies();
		PrintWriter out = res.getWriter();
		out.println("Cookie value");
		out.println("Name: "+c[0].getValue());
		out.println("Password: "+c[1].getValue());
		out.close();
 	}

}
