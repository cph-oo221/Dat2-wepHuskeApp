package com.example.dat2wephuskeapp.Controller;

import com.example.dat2wephuskeapp.Entitet.Person;
import com.example.dat2wephuskeapp.Model.Facade;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Map<String, Person> personMap = Facade.getAllperson();
        request.setAttribute("personer", personMap);

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String errorMSG = "Din kode eller brugernavn er forkert";

        if(!personMap.containsKey(name))
        {
            request.setAttribute("errorMSG", errorMSG);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        if(!personMap.get(name).getKode().equals(password))
        {
            request.setAttribute("errorMSG", errorMSG);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

        HttpSession session = request.getSession();
        session.setAttribute("bruger", personMap.get(name));

        request.getRequestDispatcher("WEB-INF/userPage.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher("registerNewUser.jsp").forward(request, response);
    }
}
