package br.com.liondev.lioneducation.services;

import br.com.liondev.lioneducation.dao.ContentDao;
import br.com.liondev.lioneducation.dao.DaoFactory;
import br.com.liondev.lioneducation.entities.Content;
import java.util.List;

public class ContentService {

    private final ContentDao contentDAO = DaoFactory.createContentDao();

    public List<Content> findAll() {
        return contentDAO.findAll();
    }

    public void save(Content object) {
        contentDAO.insert(object);
    }
    
    public void update(Integer id) {
        contentDAO.update(id);
    }

    public void remove(Content object) {
        contentDAO.deleteById(object.getId());
    }

    public String findSubjectById(Integer id) {
        return contentDAO.findSubjectById(id);
    }
    
    public List<Content> findAllByStatus(Integer statusId) {
        return contentDAO.findAllByStatus(statusId);
    }
    
    public boolean existsContent(String content) {
        return contentDAO.existsContent(content);
    }
}
