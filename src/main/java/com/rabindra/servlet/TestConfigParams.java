package com.rabindra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *author:rabindra
 */
@WebServlet("/TestConfigParams")
public class TestConfigParams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestConfigParams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//set the content type, here used html/text for testing as param instead of text/html
		response.setContentType("text/html");
		
		//get the item writer
		PrintWriter writer =response.getWriter();
		
		//get the config paramss 
		
		ServletContext context = getServletContext();
		
		String cartMaxVol = context.getInitParameter("max.shopping.cart.size");
		
		String teamName = context.getInitParameter("project.team.name");

		//display the html content
		writer.println("<html><body>");
		writer.println("<br><br>");
		writer.println("Max Cart Vol:"+cartMaxVol);
		writer.println("<br><br>");
		writer.println("Team Name:"+teamName);
		writer.println("</html></body>");

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
