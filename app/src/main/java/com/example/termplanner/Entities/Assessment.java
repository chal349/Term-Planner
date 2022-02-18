package com.example.termplanner.Entities;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "assessments_table")

public class Assessment {

    @PrimaryKey(autoGenerate = true)
    private int assessmentId;

    private int courseId;
    private String title;
    private String type;
    private String startDate;
    private String endDate ;

    public Assessment(int courseId, String title, String type, String startDate, String endDate) {
        this.courseId = courseId;
        this.title = title;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(int id) {
        this.assessmentId = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
