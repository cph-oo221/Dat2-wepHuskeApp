package com.example.dat2wephuskeapp.Controller;

import com.example.dat2wephuskeapp.Entitet.Person;
import com.example.dat2wephuskeapp.Model.Facade;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "GetPersonServlet", value = "/GetPersonServlet")
public class GetPersonServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String name = request.getParameter("name");
        request.setAttribute("getPerson", Facade.getPerson(name));
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
