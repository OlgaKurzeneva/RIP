package org.rip.olga;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Car extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html; charset=windows-1251");
        PrintWriter out = response.getWriter();

        String model = (String) request.getParameter("model");
        String color = (String) request.getParameter("color");
        out.println("<!DOCTYPE HTML>");
        out.println("<form action=\"\" method=\"GET\">");
        out.println("<p>Введите модель машины: <input type=\"text\" name=\"model\"></p>");
        out.println("<p>Введите цвет машины: <input type=\"text\" name=\"color\"></p>");
        out.println("<input type=\"submit\" value=\"Добавить\" />");
        out.println("</form>");

        response.getWriter().println("<form action=\"\" method=\"POST\">");
        out.println("<input type=\"submit\" value=\"Список внесенных сущностей\" />");
        out.println("</form>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException
    {
        doGet(request, response);

        String model = (String) request.getParameter("model");
        String color = (String) request.getParameter("color");

        response.getWriter().println("<!DOCTYPE HTML>");
        response.getWriter().println("<form action=\"\" method=\"POST\">");
        response.getWriter().println("<html><body><p>Модель:" + model + "</p></body></html>");
        response.getWriter().println("<html><body><p>Цвет:" + color + "</p></body></html>");
        response.getWriter().println("</form>");
    }
}