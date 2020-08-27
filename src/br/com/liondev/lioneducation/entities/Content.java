package br.com.liondev.lioneducation.entities;

public class Content {
    
    private int id;
    private int subjectId;
    private String date;
    private int status;
    private int importance;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public void setStatus(String status) {
        switch (status) {
            case "PENDENTE":
                this.status = 1;
                break;
            case "ESTUDADO":
                this.status = 2;
                break;
            default:
                break;
        }
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }
    
    public void setImportance(String importance) {
        switch (importance) {
            case "PEQUENA":
                this.importance = 1;
                break;
            case "MEDIA":
                this.importance = 2;
                break;
            case "MUITA":
                this.importance = 3;
                break;
            default:
                break;
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}