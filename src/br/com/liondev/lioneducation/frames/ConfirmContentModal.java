package br.com.liondev.lioneducation.frames;

import br.com.liondev.lioneducation.entities.Content;
import br.com.liondev.lioneducation.services.ContentService;
import br.com.liondev.lioneducation.util.Util;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConfirmContentModal {

    private javax.swing.JComboBox<String> jComboBoxImportance;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    public static javax.swing.JComboBox<String> jComboBoxSubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    
    
    public HashMap<String, Integer> map = new HashMap<>();

    public void initComponents(JFrame frame, DefaultTableModel modelTableContents,DefaultTableModel modelTableContentStatus1,DefaultTableModel modelTableContentStatus2, List<Content> listContents) {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxSubject = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxImportance = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jComboBoxSubject.addItem("Nenhuma");
        MainFrame.listSubjectsStatic.forEach((subject) -> {
            if (!subject.getName().equals("Nenhum")) {
                jComboBoxSubject.addItem(subject.getName() + ": " + subject.getTeacherName());
                map.put(subject.getName(), subject.getId());
            }
        });

        jComboBoxStatus.addItem("Nenhuma");
        jComboBoxStatus.addItem("PENDENTE");
        jComboBoxStatus.addItem("ESTUDADO");

        jComboBoxImportance.addItem("Nenhuma");
        jComboBoxImportance.addItem("PEQUENA");
        jComboBoxImportance.addItem("MEDIA");
        jComboBoxImportance.addItem("MUITA");

        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 40, 45));

        jPanel2.setBackground(new java.awt.Color(27, 30, 32));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/close.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt, frame);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, -1));

        jLabel2.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Adicione um conteudo");

        jLabel3.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 103, 103));
        jLabel3.setText("Materia:");

        jComboBoxSubject.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(244, 103, 103));
        jLabel4.setText("Importancia do conteudo:");

        jComboBoxImportance.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(244, 103, 103));
        jLabel5.setText("Status do conteudo:");

        jPanel3.setBackground(new java.awt.Color(155, 242, 117));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt, frame,modelTableContents, modelTableContentStatus1, modelTableContentStatus2, listContents);
            }
        });

        jLabel7.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ADICIONAR");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jComboBoxStatus.setFont(new java.awt.Font("abeatbyKai", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(244, 103, 103));
        jLabel6.setText("Conteudo:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jLabel5)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(10, 10, 10)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jComboBoxSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel4)
                                                                .addComponent(jLabel6)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(10, 10, 10)
                                                                        .addComponent(jComboBoxImportance, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxImportance, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        frame.pack();
    }// </editor-fold>                        

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt, JFrame frame) {
        frame.dispose();
    }

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt, JFrame frame, DefaultTableModel modelTableContents,DefaultTableModel modelTableContentStatus1,DefaultTableModel modelTableContentStatus2, List<Content> listContents) {
        if (jComboBoxSubject.getSelectedItem().equals("Nenhuma") || jComboBoxImportance.getSelectedItem().equals("Nenhuma")
                || jComboBoxStatus.getSelectedItem().equals("Nenhuma")) {
            JOptionPane.showMessageDialog(null, "Selecione uma opção válida.", "Erro ao registrar", JOptionPane.ERROR_MESSAGE);
        } else if (jTextArea1.getText().length() <=5 ) {
            JOptionPane.showMessageDialog(null, "Conteúdo insuficiente.", "Erro ao registrar", JOptionPane.ERROR_MESSAGE);
        } else {
            if (new ContentService().existsContent(jTextArea1.getText())) {
                JOptionPane.showMessageDialog(null, "Esse conteúdo já existe.", "Erro ao registrar", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Conteúdo registrado com sucesso!", "Registro feito com sucesso!", JOptionPane.INFORMATION_MESSAGE);
                
                String subject = jComboBoxSubject.getSelectedItem().toString();
                
                String[] splitted =  subject.split(":");
                
                String subjectName = splitted[0];
                
                Content content = new Content();
                content.setSubjectId(map.get(subjectName));
                content.setStatus(jComboBoxStatus.getSelectedItem().toString());
                content.setImportance(jComboBoxImportance.getSelectedItem().toString());
                content.setContent(jTextArea1.getText());
                
                new ContentService().save(content);
                
                Util.readTableContents(modelTableContents, modelTableContentStatus1, modelTableContentStatus2, listContents, true);

                frame.dispose();
            }
        }
    }
}
