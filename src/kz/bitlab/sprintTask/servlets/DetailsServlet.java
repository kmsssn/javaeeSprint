package kz.bitlab.sprintTask.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.sprintTask.db.DBManager;
import kz.bitlab.sprintTask.db.Tasks;

import java.io.IOException;

@WebServlet("/details")
public class DetailsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException{
            Long id = -1L;
            try {
                id = Long.parseLong(request.getParameter("id"));
            }catch (Exception e){
            }
            Tasks zadaniya = DBManager.getTask(id);
            request.setAttribute("zadaniya", zadaniya);
            request.getRequestDispatcher("/details.jsp").forward(request, response);
        }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{

    }
}
