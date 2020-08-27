package br.com.liondev.lioneducation.dao;

import br.com.liondev.lioneducation.entities.Content;
import java.util.List;

public interface ContentDao {
    
    void insert(Content obj);

    void update(Integer id);

    void deleteById(Integer id);
    
    List<Content> findAll();
    
    List<Content> findAllByStatus(Integer status);

    public String findSubjectById(Integer id);
    
    public boolean existsContent(String content);
}