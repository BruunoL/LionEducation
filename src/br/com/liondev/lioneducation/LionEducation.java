package br.com.liondev.lioneducation;

import br.com.liondev.lioneducation.database.ConnectionFactory;
import br.com.liondev.lioneducation.entities.Content;
import br.com.liondev.lioneducation.entities.Subject;
import br.com.liondev.lioneducation.frames.MainFrame;
import br.com.liondev.lioneducation.services.ContentService;
import br.com.liondev.lioneducation.services.SubjectService;

public class LionEducation {

    public static void main(String[] args) {       
        if (!ConnectionFactory.initialize()) {
            System.out.println("Erro ao estabelecer a conexão com o banco de dados!");
        }
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
//        Content obj = new Content();
//        
//        obj.setStatus(2);
//        obj.setSubjectId(5);
//        obj.setImportance(3);
//        obj.setContent("EUA");
        
//        new ContentService().save(obj);
        
        new MainFrame().setVisible(true);
    }
}