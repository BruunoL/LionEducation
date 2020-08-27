package br.com.liondev.lioneducation.dao;

import br.com.liondev.lioneducation.entities.Subject;
import java.util.List;

public interface SubjectDao {

    void insert(Subject obj);

    void deleteById(Integer id);
    
    List<Subject> findAll();
    
    boolean existsSubject(String subject, String teacherName);
    
}