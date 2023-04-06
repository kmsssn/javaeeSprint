<%@ page import="kz.bitlab.sprintTask.db.Tasks" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sprint Task 2-4</title>
    <%@include file="vendor/head.jsp"%>
</head>
<body>
    <%@include file="vendor/shapka.jsp"%>
    <button class="btn btn-primary" name="knopka" data-bs-toggle="modal" data-bs-target="#exampleModal"
            style="margin-left: 20px; margin-top: 20px; background-color: #0a002b; border: none">
        +Добавить задание
    </button>
    <div class="container">
        <div class="row mt-5">
            <div class="col-sm-12">
                <table class="table">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Наименование</th>
                        <th>Крайний срок</th>
                        <th>Выполнено</th>
                        <th>Детали</th>
                    </tr>
                    </thead>
                    <tbody>
                        <%
                                ArrayList<Tasks> tasks=(ArrayList<Tasks>) request.getAttribute("zadaniya");
                                if (tasks!=null){
                                    for(Tasks t:tasks){
                            %>
                    <tr>
                        <td>
                            <%=t.getId()%>
                        </td>
                        <td>
                            <%=t.getName()%>
                        </td>
                        <td>
                            <%=t.getDeadlineDate()%>
                        </td>
                        <td>
                            <%=t.getDescript()%>
                        </td>
                        <td>
                            <a href="/details?id=<%=t.getId()%>" class="btn btn-info btn-sm">Детали</a>
                        </td>
                    </tr>

                        <%
                                    }
                                }
                            %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <form action="/addtask" method="post">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Новое задание</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="mb-3">
                            <label class="form-label">Наименование: </label>
                            <input type="text" class="form-control" name="task_name" placeholder="Наименование...">
                        </div>
                        <div class="mb-3">
                            <label class="form label">Описание: </label>
                            <textarea class="form-control" name="task_descripton" rows="10">
                            </textarea>
                        </div>
                        <div class="mb-6">
                            <label class="form-label">Крайник срок: </label>
                            <input type="text" name="task_dline" placeholder="mm.dd.yyyy">
                        </div>
                        <div class="mb-3">
                            <label class="form label">Выполнено: </label>
                            <select class="form-select" name="task_descript">
                                <option>Да</option>
                                <option selected>Нет</option>
                            </select>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Закрыть</button>
                        <button type="submit" class="btn btn-success">Добавить задание</button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</body>
</html>
