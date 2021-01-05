package com.revature.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {

	public static void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String endpoint = req.getRequestURI(); 
		switch(endpoint) {
		case "/TestJennkinProject/api/landing":
			RequestDispatcher redis = req.getRequestDispatcher("/index.html"); 
			redis.forward(req, resp);
			break; 
		}
		
	}
	
	
	
}
