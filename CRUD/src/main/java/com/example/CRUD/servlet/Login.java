package com.example.CRUD.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet
public class Login extends HttpServlet {

    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String myemail = (String) request.getParameter("name1");
        String mypass = (String) request.getParameter("pass1");

        if(myemail.equals("juan@gmail.com") && mypass.equals("juan123")){
            System.out.println("sucess");
        } else {
            System.out.println("failed");
        }
    }

}
