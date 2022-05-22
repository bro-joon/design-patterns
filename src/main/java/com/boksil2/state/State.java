package com.boksil2.state;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}
