package com.example.dat2wephuskeapp.Controller;

import com.example.dat2wephuskeapp.Entitet.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "AddItemServlet", value = "/AddItemServlet")
public class AddItemServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String item = request.getParameter("item");

        Person person = (Person) request.getSession().getAttribute("bruger");

        person.getStringArrayList().add(item);

        request.getRequestDispatcher("WEB-INF/userPage.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    }
}
