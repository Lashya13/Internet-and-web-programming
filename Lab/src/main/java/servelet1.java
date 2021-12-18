import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


@WebServlet("/servelet1")

public class servelet1 extends HttpServlet {

private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

// TODO Auto-generated method stub

response.getWriter().append("Served at: ").append(request.getContextPath());

try {

response.setContentType("text/html");

PrintWriter pwriter = response.getWriter();

String name=request.getParameter("uname");

String password=request.getParameter("upass");

pwriter.print(" hello "+name+"!!!! ");

pwriter.print(" your password is: "+password);

//Creating two cookies

Cookie c1=new Cookie("Username",name);
Cookie c2=new Cookie("UserPassword",password);

//Adding the cookies to response header

response.addCookie(c1);
response.addCookie(c2);

pwriter.print(" <a href='servelet2'>view details</a>");

pwriter.close();

}catch(Exception exp) {

System.out.println(exp);

}

}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

// TODO Auto-generated method stub

doGet(request, response);

}

}