package kz.bitlab.sprintTask.db;
public class Tasks {
    Long id;
    String name;
    String descripton;
    String deadlineDate;
    String descript;
    public Tasks(){}

    public Tasks(Long id, String name, String deadlineDate, String descripton) {
        this.id = id;
        this.name = name;
        this.deadlineDate = deadlineDate;
        this.descripton = descripton;
    }

    public Tasks(Long id, String name, String descripton, String deadlineDate, String descript) {
        this.id = id;
        this.name = name;
        this.descripton = descripton;
        this.deadlineDate = deadlineDate;
        this.descript = descript;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }
}

