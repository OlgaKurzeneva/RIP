package org.rip.olga;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Car extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {
        httpServletResponse.setContentType("text/html; charset=windows-1251");
        PrintWriter out = httpServletResponse.getWriter();
        out.write("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head><title>Машины</title></head>\n" +
                "<body bgcolor=\"#fdf5e6\">\n" +
                "<h1>Renault Sandero Stepway</h1>\n" +
                "<p>Цвет: красный</p>\n" +
                "<p>Цена: 700000</p>\n" +
                "</body></html>");
    }
}