package org.rip.olga;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Car extends HttpServlet {
    private ArrayList cars = new ArrayList();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html; charset=windows-1251");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE HTML>");
        out.println("<form action=\"\" method=\"GET\">");
        out.println("<p>Введите модель машины: <input type=\"text\" name=\"model\"></p>");
        out.println("<p>Введите цвет машины: <input type=\"text\" name=\"color\"></p>");
        out.println("<input type=\"submit\" value=\"Добавить\" />");
        out.println("</form>");

        response.getWriter().println("<form action=\"\" method=\"POST\">");
        out.println("<input type=\"submit\" value=\"Список внесенных сущностей\" />");
        out.println("</form>");

        request.setAttribute("cars", cars);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException
    {
        doGet(request, response);
        PrintWriter out = response.getWriter();

        String model = (String) request.getParameter("model");
        String color = (String) request.getParameter("color");
        
        cars.add(model);
        cars.add(color);

        String car = "";
        for (int i = 0; i < cars.size(); i++) {
            car = car + cars.get(i) + " ";
        }
        out.println(car);

        out.println("<!DOCTYPE HTML>");
        out.println("<form action=\"\" method=\"POST\">");
        out.println("<html><body><p>Модель:" + model + "</p></body></html>");
        out.println("<html><body><p>Цвет:" + color + "</p></body></html>");
        out.println("</form>");
    }
}