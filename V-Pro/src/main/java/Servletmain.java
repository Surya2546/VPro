

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.*;

/**
 * Servlet implementation class Servletmain
 */
@WebServlet("/Servletmain")
public class Servletmain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletmain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String height= request.getParameter("height");
		String weight= request.getParameter("weight");
		response.setContentType("text/html");
		int bmi= (int) (Integer.parseInt(weight) / ((Integer.parseInt(height) * Integer.parseInt(height)) / 10000.0));
		if(bmi<18.5) {
			String res= "Underweight";
			PrintWriter out= response.getWriter();
			out.println("<h1>BMI is: " + (res != null ? res : "") + "</h1>");
		}
		else if(bmi>=18.5 && bmi<24.9) {
			String res= "Normal weight";
			PrintWriter out= response.getWriter();
			out.println("<h1>BMI is: " + (res != null ? res : "") + "</h1>");
		}
		else if(bmi>=25 && bmi<29.9) {
			String res= "Overweight";
			PrintWriter out= response.getWriter();
			out.println("<h1>BMI is: " + (res != null ? res : "") + "</h1>");
		}
		else {
			String res= "Obesity";
			PrintWriter out= response.getWriter();
			out.println("<h1>BMI is: " + (res != null ? res : "") + "</h1>");
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
