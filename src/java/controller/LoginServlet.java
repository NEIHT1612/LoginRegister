/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.AccountDAO;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author PC
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AccountDAO dao = new AccountDAO();
        String username;
        String password;
        String value = request.getParameter("value");
        switch (value) {
            case "register":
                //get doi tuong tu register.jsp
                username = request.getParameter("username");
                password = request.getParameter("password");
                String displayname = request.getParameter("nickname");
                
                //dang ki
                dao.register(username, password, displayname);
                
                //check tai khoan da ton tai chua
                Account account1 = dao.checkLogin(username, password, "Account has been existed");
                request.setAttribute("error", "Register failed");
                if (account1 == null) {
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                } else {
                    response.sendRedirect("login.jsp");
                }
                break;
            case "login":
                //get doi tuong tu login.jsp
                username = request.getParameter("username");
                password = request.getParameter("password");
                
                //dang nhap
                Account account2 = dao.checkLogin(username, password, "Login failed");
                request.setAttribute("error", "Login failed");
                if (account2 == null) {
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("discuss").forward(request, response);
                }
                break;
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
