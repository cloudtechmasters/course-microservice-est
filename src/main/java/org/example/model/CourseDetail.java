package org.example.model;

public class CourseDetail {
    private String courseName;

    public CourseDetail() {
    }

    public CourseDetail(String courseName, int courseDuration) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }

    @Override
    public String toString() {
        return "CourseDetail{" +
                "courseName='" + courseName + '\'' +
                ", courseDuration=" + courseDuration +
                '}';
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    private int courseDuration;
}
