package org.rip.olga;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Car extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html; charset=windows-1251");

        String model = (String) request.getParameter("model");
        String color = (String) request.getParameter("color");
        response.getWriter().println("<!DOCTYPE HTML>");
        response.getWriter().println("<form action=\"\" method=\"GET\">");
        response.getWriter().println("<p>Введите модель машины: <input type=\"text\" name=\"model\"></p>");
        response.getWriter().println("<p>Введите цвет машины: <input type=\"text\" name=\"color\"></p>");
        response.getWriter().println("<input type=\"submit\" value=\"Отправить\" />");
        response.getWriter().println("</form>");
        response.getWriter().println("<html><body><p>" + model + "</p></body></html>");
        response.getWriter().println("<html><body><p>" + color + "</p></body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException
    {
        doGet(request, response);
    }
}