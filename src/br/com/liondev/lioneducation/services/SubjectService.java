package br.com.liondev.lioneducation.services;

import br.com.liondev.lioneducation.dao.DaoFactory;
import br.com.liondev.lioneducation.dao.SubjectDao;
import br.com.liondev.lioneducation.entities.Subject;
import java.util.List;

public class SubjectService {

    private final SubjectDao subjectDao = DaoFactory.createSubjectDao();

    public List<Subject> findAll() {
        return subjectDao.findAll();
    }
    
    public boolean findBySubject(String subjectName, String teacherName) {
        return subjectDao.existsSubject(subjectName, teacherName);
    }

    public void save(Subject object) {
        subjectDao.insert(object);
    }

    public void remove(Subject object) {
        subjectDao.deleteById(object.getId());
    }
}