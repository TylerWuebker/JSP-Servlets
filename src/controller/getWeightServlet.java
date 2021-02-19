package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EarthToMars;

/**
 * Servlet implementation class getWeightServlet
 */
@WebServlet("/getWeightServlet")
public class getWeightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getWeightServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userWeight = request.getParameter("EarthWeight");
		EarthToMars marsW = new EarthToMars(Double.parseDouble(userWeight));
		
		
		request.setAttribute("userWeightLog", userWeight);
		request.setAttribute("userMarsWeightLog", marsW.getMarsWeight());
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(marsW.toString());
		writer.close();
	}

}
