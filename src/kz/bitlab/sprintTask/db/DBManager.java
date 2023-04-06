package kz.bitlab.sprintTask.db;

import java.util.ArrayList;

public class DBManager {
    public static final ArrayList<Tasks> tasks=new ArrayList<>();
    private static Long id=5L;
    static{
        tasks.add(new Tasks(1L, "Создать веб-приложение на Java EE", "-", "23.10.2021", "Да"));
        tasks.add(new Tasks(2L, "Убраться дома и закупить продукты", "-", "25.10.2021", "Да"));
        tasks.add(new Tasks(3L, "Выполнить все домашние задания", "-", "28.10.2021", "Нет"));
        tasks.add(new Tasks(4L, "Записаться на качку", "-","12.12.2021", "Нет"));
    }
    public static ArrayList<Tasks> getAllTasks(){
        return tasks;
    }
    public static void addTask(Tasks task){
        task.setId(id);
        tasks.add(task);
        id++;
    }
    public static Tasks getTask(Long id) {
        return tasks
                .stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public static void deleteTask(Long id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                break;
            }
        }
    }
    public static void updTask(Tasks zadaniya) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == zadaniya.getId()) {
                tasks.set(i, zadaniya);
                break;
            }
        }
    }
}
