import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


@WebServlet("/servelet2")

public class servelet2 extends HttpServlet {

private static final long serialVersionUID = 1L;



protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

// TODO Auto-generated method stub

response.getWriter().append("Served at: ").append(request.getContextPath());

try {

response.setContentType("text/html");

PrintWriter pwriter = response.getWriter();

//Reading cookies

Cookie c[]=request.getCookies();

//Displaying user name value from cookie

pwriter.print("Name: "+c[0].getValue());

//Displaying password value from cookie

pwriter.print("Password: "+c[1].getValue());

pwriter.close();

}catch(Exception exp) {

System.out.println(exp);

}

}

/**

* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

*/

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

// TODO Auto-generated method stub

doGet(request, response);

}

}