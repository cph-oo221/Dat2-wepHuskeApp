package com.example.dat2wephuskeapp.Controller;

import com.example.dat2wephuskeapp.Entitet.Person;
import com.example.dat2wephuskeapp.Model.Facade;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

@WebServlet(name = "AddPersonServlet", value = "/AddPersonServlet")
public class AddPersonServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        Facade.addPerson(new Person(name, password));

        HttpSession session = request.getSession();

        session.setAttribute("bruger", Facade.getPerson(name));

        request.getRequestDispatcher("WEB-INF/userPage.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    }
}
