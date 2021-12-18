import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet1")

public class servlet1 extends HttpServlet {

private static final long serialVersionUID = 1L;



protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

// TODO Auto-generated method stub

response.getWriter().append("Served at: ").append(request.getContextPath());

try {

response.setContentType("text/html");

PrintWriter pwriter = response.getWriter();

String username=request.getParameter("username");

String password=request.getParameter("password");

pwriter.print("<p>Name: "+username+"</p>");

pwriter.print("<p>Password: "+password+"</p>");

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