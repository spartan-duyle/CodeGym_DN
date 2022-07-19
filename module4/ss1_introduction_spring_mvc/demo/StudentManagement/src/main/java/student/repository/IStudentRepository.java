package student.repository;

import student.model.Student;

import java.util.List;

public interface IStudentRepository {
    public List<Student> findAll();
}
