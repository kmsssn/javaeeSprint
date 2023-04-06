package kz.bitlab.sprintTask.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.sprintTask.db.DBManager;

import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        Long id=Long.parseLong(request.getParameter("deleteId"));
        DBManager.deleteTask(id);
        response.sendRedirect("/");
    }
}
