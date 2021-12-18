import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet("/addNumber")

public class addNumber extends HttpServlet {

private static final long serialVersionUID = 1L;



protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

{

PrintWriter pw = response.getWriter();

int number1 = Integer.parseInt(request.getParameter("num1"));

int number2 = Integer.parseInt(request.getParameter("num2"));

int sum = number1 + number2;

pw.println("sum of the given two numbers is : "+sum);

}

}