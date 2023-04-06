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

@WebServlet("/obnova")
public class ObnovaServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException{

    }
        public void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            Long id = Long.parseLong(request.getParameter("id"));
            String name = request.getParameter("task_name");
            String descripton = request.getParameter("task_descripton");
            String deadline = request.getParameter("task_dline");
            String descript=request.getParameter("task_descript");

            Tasks task = DBManager.getTask(id);
            if (task != null) {
                task.setName(name);
                task.setDescripton(descripton);
                task.setDeadlineDate(deadline);
                task.setDescript(descript);
                DBManager.updTask(task);
                response.sendRedirect("/");
            } else {
                response.sendRedirect("/");
            }
        }
    }
