package kz.bitlab.sprintTask.servlets;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.sprintTask.db.DBManager;
import kz.bitlab.sprintTask.db.Tasks;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.ArrayList;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
                        throws ServerException, IOException{

    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException{
        ArrayList<Tasks> tasks = DBManager.getAllTasks();
        request.setAttribute("zadaniya", tasks);
        request.getRequestDispatcher("/home.jsp").forward(request, response);
    }
}
