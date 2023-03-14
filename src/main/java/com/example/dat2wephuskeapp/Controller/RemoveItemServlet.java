package com.example.dat2wephuskeapp.Controller;

import com.example.dat2wephuskeapp.Entitet.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RemoveItemServlet", value = "/RemoveItemServlet")
public class RemoveItemServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String itemRemove = request.getParameter("itemRemove");

        Person person = (Person) request.getSession().getAttribute("bruger");

        person.getStringArrayList().remove(itemRemove);

        System.out.println("itemRemove = " + itemRemove);
        System.out.println(person.getStringArrayList());

        request.getRequestDispatcher("WEB-INF/userPage.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    }
}
