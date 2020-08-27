package br.com.liondev.lioneducation.frames;

import br.com.liondev.lioneducation.entities.Content;
import br.com.liondev.lioneducation.entities.Subject;
import br.com.liondev.lioneducation.services.ContentService;
import br.com.liondev.lioneducation.services.SubjectService;
import br.com.liondev.lioneducation.util.Util;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    private final CardLayout cardLayout;

    private final List<Subject> listSubjects;
    public static List<Subject> listSubjectsStatic;
    private final List<Content> listContents;

    private final SubjectService subjectService;
    private final ContentService contentService;

    private final DefaultTableModel modelTableSubject;
    private final DefaultTableModel modelTableContent;
    private final DefaultTableModel modelTableContentStatus1;
    private final DefaultTableModel modelTableContentStatus2;

    private JFrame modalWindowConfirmSubject;
    private JFrame modalWindowConfirmContent;
    private JFrame modalWindowConfirmPending;

    private Integer pending = 0;
    private Integer studied = 0;

    public MainFrame() {
        subjectService = new SubjectService();
        contentService = new ContentService();

        listSubjects = subjectService.findAll();
        listSubjectsStatic = subjectService.findAll();
        listContents = contentService.findAll();

        listContents.forEach((content) -> {
            if (content.getStatus() == 1) {
                pending++;
            } else {
                studied++;
            }
        });

        setIconImage(new ImageIcon(getClass().getResource("/assets/img/logo.png")).getImage());

        initComponents();
        setLocationRelativeTo(null);
        this.cardLayout = (CardLayout) (jPanelCards.getLayout());

        modelTableSubject = (DefaultTableModel) jTable1.getModel();
        modelTableContent = (DefaultTableModel) jTable2.getModel();
        modelTableContentStatus1 = (DefaultTableModel) jTable3.getModel();
        modelTableContentStatus2 = (DefaultTableModel) jTable4.getModel();

        Util.readTableSubjects(modelTableSubject, listSubjects, false);
        Util.readTableContents(modelTableContent, modelTableContentStatus1, modelTableContentStatus2, listContents, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        frameAccount = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelCards = new javax.swing.JPanel();
        cardMaterias = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cardConteudos = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cardPendentes = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        cardEstudados = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        frameAccount.setBackground(new java.awt.Color(35, 40, 45));
        frameAccount.setVisible(true);
        frameAccount.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(960, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(27, 30, 32));

        jLabel9.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lion for Education 1.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(718, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 40));

        jPanel1.setBackground(new java.awt.Color(49, 56, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 180));

        jLabel3.setFont(new java.awt.Font("abeatbyKai", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("COPYRIGHT 2020 ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 200, 40));

        jLabel4.setFont(new java.awt.Font("abeatbyKai", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LION DESENVOLVIMENTOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 200, 40));

        jPanel5.setBackground(new java.awt.Color(244, 103, 103));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MATERIAS");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 40));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 8, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 40));

        jPanel8.setBackground(new java.awt.Color(244, 103, 103));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONTEUDOS");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 40));

        jPanel9.setOpaque(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 8, 40));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 283, 200, 40));

        jPanel10.setBackground(new java.awt.Color(244, 103, 103));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PENDENTES");
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 40));

        jPanel11.setOpaque(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 8, 40));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 326, 200, 40));

        jPanel12.setBackground(new java.awt.Color(244, 103, 103));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ESTUDADOS");
        jPanel12.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 40));

        jPanel13.setOpaque(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 8, 40));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 369, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 550));

        jPanel3.setBackground(new java.awt.Color(244, 103, 103));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("abeatbyKai", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 40, 40));

        jPanelCards.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCards.setLayout(new java.awt.CardLayout());

        cardMaterias.setBackground(new java.awt.Color(35, 40, 45));
        cardMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("abeatbyKai", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(235, 235, 236));
        jLabel11.setText("Painel de Materias");
        cardMaterias.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 657, 80));
        cardMaterias.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 270, 10));

        jLabel10.setBackground(new java.awt.Color(235, 235, 236));
        jLabel10.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(235, 235, 236));
        jLabel10.setText("" + listSubjects.size());
        cardMaterias.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 170, -1));

        jLabel15.setBackground(new java.awt.Color(235, 235, 236));
        jLabel15.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(244, 103, 103));
        jLabel15.setText("Total de Materias: ");
        cardMaterias.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, -1));

        jTable1.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MATÉRIA", "PROFESSOR", "DIFICULDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(35, 40, 45));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        cardMaterias.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 740, 300));

        jPanel4.setBackground(new java.awt.Color(155, 242, 117));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Adicione uma materia");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        cardMaterias.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 180, 40));

        jPanel14.setBackground(new java.awt.Color(244, 103, 103));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Remover uma materia");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        cardMaterias.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 180, 40));

        jPanelCards.add(cardMaterias, "cardMaterias");

        cardConteudos.setBackground(new java.awt.Color(35, 40, 45));
        cardConteudos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("abeatbyKai", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(235, 235, 236));
        jLabel12.setText("Painel de Conteudos");
        cardConteudos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 657, 80));
        cardConteudos.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 270, 10));

        jTable2.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MATÉRIA", "DATA", "STATUS", "IMPORTÂNCIA", "CONTEÚDO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(35, 40, 45));
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        cardConteudos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 740, 300));

        jLabel18.setBackground(new java.awt.Color(235, 235, 236));
        jLabel18.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(235, 235, 236));
        jLabel18.setText("" + listContents.size());
        cardConteudos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 120, -1));

        jLabel19.setBackground(new java.awt.Color(235, 235, 236));
        jLabel19.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(244, 103, 103));
        jLabel19.setText("Total de Conteudos: ");
        cardConteudos.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 200, -1));

        jPanel15.setBackground(new java.awt.Color(155, 242, 117));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Adicione um conteudo");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        cardConteudos.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 180, 40));

        jPanel16.setBackground(new java.awt.Color(244, 103, 103));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Remover um conteudo");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        cardConteudos.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 180, 40));

        jLabel22.setBackground(new java.awt.Color(235, 235, 236));
        jLabel22.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(244, 103, 103));
        jLabel22.setText("Conteudos pendentes: ");
        cardConteudos.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 220, -1));

        jLabel23.setBackground(new java.awt.Color(235, 235, 236));
        jLabel23.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(235, 235, 236));
        jLabel23.setText("" + pending);
        cardConteudos.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 100, -1));

        jLabel24.setBackground(new java.awt.Color(235, 235, 236));
        jLabel24.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(235, 235, 236));
        jLabel24.setText("" + studied);
        cardConteudos.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 100, -1));

        jLabel25.setBackground(new java.awt.Color(235, 235, 236));
        jLabel25.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(244, 103, 103));
        jLabel25.setText("Conteudos estudados: ");
        cardConteudos.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 210, -1));

        jPanelCards.add(cardConteudos, "cardConteudos");

        cardPendentes.setBackground(new java.awt.Color(35, 40, 45));
        cardPendentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("abeatbyKai", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(235, 235, 236));
        jLabel13.setText("Painel de Pendencias");
        cardPendentes.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 657, 80));
        cardPendentes.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 270, 10));

        jLabel26.setBackground(new java.awt.Color(235, 235, 236));
        jLabel26.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(235, 235, 236));
        jLabel26.setText("" + pending);
        cardPendentes.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 100, -1));

        jLabel27.setBackground(new java.awt.Color(235, 235, 236));
        jLabel27.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(244, 103, 103));
        jLabel27.setText("Conteudos pendentes: ");
        cardPendentes.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 220, -1));

        jPanel17.setBackground(new java.awt.Color(155, 242, 117));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Remover pendencia");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        cardPendentes.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 180, 40));

        jTable3.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MATÉRIA", "DATA", "IMPORTÂNCIA", "STATUS", "CONTEÚDO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setGridColor(new java.awt.Color(35, 40, 45));
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable3.setShowHorizontalLines(false);
        jTable3.setShowVerticalLines(false);
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
        }

        cardPendentes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 740, 300));

        jPanelCards.add(cardPendentes, "cardPendentes");

        cardEstudados.setBackground(new java.awt.Color(35, 40, 45));
        cardEstudados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("abeatbyKai", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(235, 235, 236));
        jLabel14.setText("Painel de Estudados");
        cardEstudados.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 657, 80));
        cardEstudados.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 270, 10));

        jLabel29.setBackground(new java.awt.Color(235, 235, 236));
        jLabel29.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(235, 235, 236));
        jLabel29.setText("" + studied);
        cardEstudados.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 120, -1));

        jLabel30.setBackground(new java.awt.Color(235, 235, 236));
        jLabel30.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(244, 103, 103));
        jLabel30.setText("Conteudos estudados: ");
        cardEstudados.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 230, -1));

        jTable4.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATÉRIA", "DATA", "STATUS", "IMPORTÂNCIA", "CONTEÚDO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setGridColor(new java.awt.Color(0, 204, 0));
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
        }

        cardEstudados.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 740, 300));

        jPanelCards.add(cardEstudados, "cardEstudados");

        getContentPane().add(jPanelCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 760, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        jPanel6.setOpaque(true);
        jPanel9.setOpaque(false);
        jPanel11.setOpaque(false);
        jPanel13.setOpaque(false);

        repaint();

        cardLayout.show(jPanelCards, "cardMaterias");

    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        jPanel6.setOpaque(false);
        jPanel9.setOpaque(true);
        jPanel11.setOpaque(false);
        jPanel13.setOpaque(false);

        repaint();

        cardLayout.show(jPanelCards, "cardConteudos");

    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        jPanel6.setOpaque(false);
        jPanel9.setOpaque(false);
        jPanel11.setOpaque(true);
        jPanel13.setOpaque(false);
        repaint();

        cardLayout.show(jPanelCards, "cardPendentes");
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        jPanel6.setOpaque(false);
        jPanel9.setOpaque(false);
        jPanel11.setOpaque(false);
        jPanel13.setOpaque(true);
        repaint();

        cardLayout.show(jPanelCards, "cardEstudados");
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        modalWindowConfirmSubject = new JFrame();

        ConfirmSubjectModal confirmModal = new ConfirmSubjectModal();

        confirmModal.initComponents(modalWindowConfirmSubject, modelTableSubject, listSubjects);

        modalWindowConfirmSubject.setLocationRelativeTo(null);
        modalWindowConfirmSubject.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
        modalWindowConfirmContent = new JFrame();

        ConfirmContentModal confirmModal = new ConfirmContentModal();

        confirmModal.initComponents(modalWindowConfirmContent, modelTableContent, modelTableContentStatus1, modelTableContentStatus2, listContents);
        
        modalWindowConfirmContent.setLocationRelativeTo(null);
        modalWindowConfirmContent.setVisible(true);
    }//GEN-LAST:event_jPanel15MouseClicked

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
        modalWindowConfirmPending = new JFrame();

        UpdatePendingModal updateModal = new UpdatePendingModal();

        if (jTable3.getSelectedRow() >= 0) {
            Object value = jTable3.getValueAt(jTable3.getSelectedRow(), 5);
            Object id = jTable3.getValueAt(jTable3.getSelectedRow(), 0);

            updateModal.initComponents(modalWindowConfirmPending, value.toString(), Integer.parseInt(id.toString()), modelTableContent, modelTableContentStatus1, modelTableContentStatus2, listContents);

            modalWindowConfirmPending.setLocationRelativeTo(null);
            modalWindowConfirmPending.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi selecionada.", "Erro ao selecionar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
        JOptionPane.showMessageDialog(null, "Painel sendo desenvolvido.", "Manutenção!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        JOptionPane.showMessageDialog(null, "Painel sendo desenvolvido.", "Manutenção!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jPanel14MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardConteudos;
    private javax.swing.JPanel cardEstudados;
    private javax.swing.JPanel cardMaterias;
    private javax.swing.JPanel cardPendentes;
    private javax.swing.JInternalFrame frameAccount;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    public static javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    public static javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelCards;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
