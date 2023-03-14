package com.example.dat2wephuskeapp.Controller;

import com.example.dat2wephuskeapp.Entitet.Person;
import com.example.dat2wephuskeapp.Model.Facade;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "AddPersonServlet", value = "/AddPersonServlet")
public class AddPersonServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        Map<String, Person> personMap = Facade.getAllperson();
        request.setAttribute("personer", personMap);

        Person person = new Person(name, password);
        request.setAttribute("addPerson", Facade.addPerson(person));

        HttpSession session = request.getSession();
        session.setAttribute("bruger", personMap.get(name));

        request.getRequestDispatcher("WEB-INF/userPage.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    }
}
