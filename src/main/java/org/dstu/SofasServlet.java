package org.dstu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SofasServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String[] sofas = req.getParameterValues("model");
        if (!sofas[0].equals("Астория")) {
            req.getRequestDispatcher("notfound.jsp").forward(req, resp);
        }
    }
}
