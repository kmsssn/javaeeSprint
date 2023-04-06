<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.sprintTask.db.Tasks" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Редактировать</title>
    <%@include file="vendor/head.jsp"%>
</head>
<body>
<%@include file="vendor/shapka.jsp"%>
<div class="container mt-5 pb-5">
    <%
        Tasks task = (Tasks) request.getAttribute("zadaniya");
        if(task!=null){
    %>
    <div class="row">
        <div class="col-6 mx-auto">
            <div class="row mt-3">
                <div class="col-12">
                    <form action="/obnova" method="post">
                        <input type="hidden" name="id" value="<%=task.getId()%>">
                        <div class="row">
                            <div class="col-12">
                                <label>Наименование: </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <input type="text" class="form-control" name="task_name" value="<%=task.getName()%>">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-12">
                                <label>Описание: </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <textarea name="task_descripton" class="form-control" rows="10"><%=task.getDescripton()%></textarea>
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-12">
                                <label>Крайний срок: </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <input type="text" class="form-control" name="task_dline"
                                       placeholder="mm.dd.yyyy" value="<%=task.getDeadlineDate()%>">
                            </div>
                        </div>
                        <div class="mb-3">
                            <div class="col-12">
                            <label class="form label">Выполнено: </label>
                            </div>
                            <div class="row mt-2">
                                <div class="col-12">
                            <select class="form-select" name="task_descript" value="<%=task.getDescript()%>">
                                <option>Да</option>
                                <option>Нет</option>
                            </select>
                                </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-12">
                                <button type="submit "class="btn btn-primary" style="background-color: #0f5132; border: none;">Сохранить</button>
                                <button type="button" class="btn btn-danger btn-sm ms-2" data-bs-toggle="modal"
                                        data-bs-target="#deleteTask"
                                        style="padding: 5px;">
                                    Удалить
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <!-- Modal -->
            <div class="modal fade" id="deleteTask" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form action="/delete" method="post">
                            <input type="hidden" name="deleteId" value="<%=task.getId()%>">
                            <div class="modal-header">
                                <h1 class="modal-title fs-5">Подтверждение действия</h1>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <h5 class="text-center">Вы уверены?</h5>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">НЕТ</button>
                                <button class="btn btn-danger">ДА</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <%
        }
    %>
</div>
</body>
</html>