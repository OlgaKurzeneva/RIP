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

        out.println("<form action=\"\" method=\"POST\">");
        out.println("<input type=\"submit\" style=\"\n" + "margin-top: 30px;margin-bottom: 15px;" + "\" value=\"Список внесенных сущностей\" />");
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

        for (int i = 0; i < cars.size(); i++) {
            out.println("\n<br />");
            if(i%2 == 0){
                out.println("Model: " + cars.get(i) + "\n<br />");
            } else if(i%2 != 0){
                out.println("Color: " + cars.get(i) + "\n<br />");
                out.println("\n<br />");
            }
        }
    }
}