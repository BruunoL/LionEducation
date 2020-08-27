package br.com.liondev.lioneducation.dao;

import br.com.liondev.lioneducation.dao.jdbc.ContentDaoJDBC;
import br.com.liondev.lioneducation.dao.jdbc.SubjectDaoJDBC;
import br.com.liondev.lioneducation.database.ConnectionFactory;

public class DaoFactory {
    
    public static SubjectDao createSubjectDao() {
        return new SubjectDaoJDBC(ConnectionFactory.getConnection());
    }
	
    public static ContentDao createContentDao() {
        return new ContentDaoJDBC(ConnectionFactory.getConnection());
    }
}