package com.revature.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	/* 
	 * This method is invoked for every GET request sent to a path not beginning with "static"
	 * Paths that we accommodate for include:
	 *    a. those which begin with "/api/" which indicate we're requesting resources/data
	 *    b. those which request web pages and need to be forwarded to the corresponding static html file
	 */
	
	public void processGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String uri = request.getRequestURI().substring(request.getContextPath().length());
		switch(uri) {
			case "/index":
				request.getRequestDispatcher("/static/Views/index.html").forward(request, response);			
				break;
			case "/":
				request.getRequestDispatcher("/static/Views/index.html").forward(request, response);			
				break;
			case "/game.html":
				request.getRequestDispatcher("/static/Views/game.html").forward(request, response);			
				break;
			case "/css/main.css":
				request.getRequestDispatcher("/static/Views/css/main.css").forward(request, response);			
				break;
			case "/css/game.css":
				request.getRequestDispatcher("/static/Views/css/game.css").forward(request, response);			
				break;
			case "/Scripts/dot.js":
				request.getRequestDispatcher("/static/Scripts/dot.js").forward(request, response);			
				break;
			case "/Scripts/mazeConstructor.js":
				request.getRequestDispatcher("/static/Scripts/mazeConstructor.js").forward(request, response);			
				break;
			case "/Scripts/mazeReader.js":
				request.getRequestDispatcher("/static/Scripts/mazeReader.js").forward(request, response);			
				break;
			default:
				response.sendError(404, "Record Not Supported");
			} 
	}
	
	
	/* 
	 * This method is invoked for every POST request; the only POST requet currently supported 
	 * 	is for "/login"
	 */
	public void processPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
//		String uri = request.getRequestURI().substring(request.getContextPath().length());
//		switch(uri) {
//		case "/login":
//			break;
//		}
	}
}

