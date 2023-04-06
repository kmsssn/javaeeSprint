package kz.bitlab.sprintTask.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.sprintTask.db.DBManager;
import kz.bitlab.sprintTask.db.Tasks;

import java.io.IOException;

@WebServlet("/addtask")
public class AddTaskServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException{
        request.getRequestDispatcher("/").forward(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String task_name=request.getParameter("task_name");
        String task_descript=request.getParameter("task_descript");
        String task_dline=request.getParameter("task_dline");
        String task_descripton=request.getParameter("task_descripton");

        Tasks task=new Tasks();
        task.setName(task_name);
        task.setDescript(task_descript);
        task.setDeadlineDate(task_dline);
        task.setDescripton(task_descripton);
        DBManager.addTask(task);

        response.sendRedirect("/");

    }
}
