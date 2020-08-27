package br.com.liondev.lioneducation.util;

import br.com.liondev.lioneducation.entities.Content;
import br.com.liondev.lioneducation.entities.Subject;
import br.com.liondev.lioneducation.frames.MainFrame;
import br.com.liondev.lioneducation.services.ContentService;
import br.com.liondev.lioneducation.services.SubjectService;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Util {

    public static void readTableSubjects(DefaultTableModel modelTableSubjects, List<Subject> listSubjects, boolean attList) {
        if (attList) {
            listSubjects = new SubjectService().findAll();
            MainFrame.jLabel10.setText("" + listSubjects.size());
            MainFrame.listSubjectsStatic = new SubjectService().findAll();
        }

        modelTableSubjects.setNumRows(0);
        for (int i = 0; i < listSubjects.size(); i++) {
            modelTableSubjects.addRow(new Object[]{
                listSubjects.get(i).getId(),
                listSubjects.get(i).getName(),
                listSubjects.get(i).getTeacherName(),
                listSubjects.get(i).getDifficulty()
            });
        }
    }

    public static void readTableContents(DefaultTableModel modelTableContents,DefaultTableModel modelTableContentStatus1,DefaultTableModel modelTableContentStatus2, List<Content> listContents, boolean attList) {
        if (attList) {
            listContents = new ContentService().findAll();
            
            int pending = 0;
            int studied = 0;
            
            for(Content content : listContents) {
                if (content.getStatus() == 1) {
                    pending++;
                } else {
                    studied++;
                }
            }
            
            MainFrame.jLabel18.setText("" + listContents.size());
            MainFrame.jLabel23.setText("" + pending);
            MainFrame.jLabel24.setText("" + studied);
            MainFrame.jLabel26.setText("" + pending);
            MainFrame.jLabel29.setText("" + studied);
        }

        modelTableContents.setNumRows(0);
        for (int i = 0; i < listContents.size(); i++) {
            modelTableContents.addRow(new Object[]{
                listContents.get(i).getId(),
                new ContentService().findSubjectById(listContents.get(i).getSubjectId()),
                listContents.get(i).getDate(),
                StatusType.getIdByName(listContents.get(i).getStatus()),
                ImportanceType.getIdByName(listContents.get(i).getImportance()),
                listContents.get(i).getContent()
            });
        }
        
        modelTableContentStatus1.setNumRows(0);
        modelTableContentStatus2.setNumRows(0);
        for (int i = 0; i < listContents.size(); i++) {
            if (listContents.get(i).getStatus() == 1) {
                    modelTableContentStatus1.addRow(new Object[]{
                    listContents.get(i).getId(),
                    new ContentService().findSubjectById(listContents.get(i).getSubjectId()),
                    listContents.get(i).getDate(),                    
                    ImportanceType.getIdByName(listContents.get(i).getImportance()),
                    StatusType.getIdByName(listContents.get(i).getStatus()),
                    listContents.get(i).getContent()
                });
            } else {
                modelTableContentStatus2.addRow(new Object[]{
                new ContentService().findSubjectById(listContents.get(i).getSubjectId()),
                listContents.get(i).getDate(),
                StatusType.getIdByName(listContents.get(i).getStatus()),
                ImportanceType.getIdByName(listContents.get(i).getImportance()),
                listContents.get(i).getContent()
            });
            }
        }
    }
}