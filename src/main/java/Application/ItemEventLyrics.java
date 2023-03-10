package Application;

import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author "Jahnreil J. Amarillento"
 */
public class ItemEventLyrics extends javax.swing.JFrame {

    /**
     * Creates new form ItemEventLyrics
     */
    public ItemEventLyrics() {
        initComponents();
        setIconImage();
    }           
    
    protected String song;
    protected boolean bold,italic, boldItalic;
    protected void select(String choice) {
        if (song == "Select a song") { FileRead(0); }
        if (song == "Mahika by Adie") { FileRead(1); }
        if (song == "Lemonade by Jeremy Passion") { FileRead(2); }
        if (song == "Especially for you by MYMP") { FileRead(3); }
        if (song == "Gitara by Parokya ni Edgar") { FileRead(4); }
        if (song == "Elesi by Rivermaya") { FileRead(5); }
        if (song == "Huling Sayaw by Kamikazee") { FileRead(6); }
        if (song == "You are the reason by Calum Scott") { FileRead(7); }
        if (song == "Just the way you are by Bruno Mars") { FileRead(8); } 
    }
    protected void txtToPlain() {
        lyricsTextArea.setFont(lyricsTextArea.getFont().deriveFont(Font.PLAIN));
        select(song);    
    }
    protected void txtToBold() {
        lyricsTextArea.setFont(lyricsTextArea.getFont().deriveFont(Font.BOLD));
        select(song);  
    }
    protected void txtToItalic() {
        lyricsTextArea.setFont(lyricsTextArea.getFont().deriveFont(Font.ITALIC));
        select(song); 
    }
    protected void txtToBoldItalic() {
        lyricsTextArea.setFont(lyricsTextArea.getFont().deriveFont(Font.BOLD + Font.ITALIC));
                    select(song);
    }
    protected void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/java/Resources/ICON.png"));
    }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        songSelectComboB = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lyricsTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        fontStylePanel = new javax.swing.JPanel();
        normalCheckB = new javax.swing.JCheckBox();
        boldCheckB = new javax.swing.JCheckBox();
        italicCheckB = new javax.swing.JCheckBox();
        boldItalicCheckB = new javax.swing.JCheckBox();
        fontSizePanel = new javax.swing.JPanel();
        smallRB = new javax.swing.JRadioButton();
        largeRB = new javax.swing.JRadioButton();
        mediumRB = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lyrics Generator");
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(476, 760));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(44, 51, 51));

        songSelectComboB.setBackground(new java.awt.Color(57, 91, 100));
        songSelectComboB.setForeground(new java.awt.Color(57, 91, 100));
        songSelectComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a song", "Mahika by Adie", "Lemonade by Jeremy Passion", "Especially for you by MYMP", "Gitara by Parokya ni Edgar", "Elesi by Rivermaya", "Huling Sayaw by Kamikazee", "You are the reason by Calum Scott", "Just the way you are by Bruno Mars" }));
        songSelectComboB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                songSelectComboBItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(songSelectComboB, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(499, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(songSelectComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(44, 51, 51));

        lyricsTextArea.setBackground(new java.awt.Color(165, 201, 202));
        lyricsTextArea.setColumns(20);
        lyricsTextArea.setForeground(new java.awt.Color(44, 51, 51));
        lyricsTextArea.setRows(5);
        jScrollPane1.setViewportView(lyricsTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(44, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 250));

        fontStylePanel.setBackground(new java.awt.Color(57, 91, 100));
        fontStylePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Font Style", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(231, 246, 242))); // NOI18N
        fontStylePanel.setForeground(new java.awt.Color(231, 246, 242));
        fontStylePanel.setPreferredSize(new java.awt.Dimension(137, 153));

        normalCheckB.setForeground(new java.awt.Color(231, 246, 242));
        normalCheckB.setText("Normal");
        normalCheckB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                normalCheckBItemStateChanged(evt);
            }
        });

        boldCheckB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boldCheckB.setForeground(new java.awt.Color(231, 246, 242));
        boldCheckB.setText("Bold");
        boldCheckB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                normalCheckBItemStateChanged(evt);
            }
        });

        italicCheckB.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        italicCheckB.setForeground(new java.awt.Color(231, 246, 242));
        italicCheckB.setText("Italic");
        italicCheckB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                normalCheckBItemStateChanged(evt);
            }
        });

        boldItalicCheckB.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        boldItalicCheckB.setForeground(new java.awt.Color(231, 246, 242));
        boldItalicCheckB.setText("Bold Italic");
        boldItalicCheckB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                normalCheckBItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout fontStylePanelLayout = new javax.swing.GroupLayout(fontStylePanel);
        fontStylePanel.setLayout(fontStylePanelLayout);
        fontStylePanelLayout.setHorizontalGroup(
            fontStylePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fontStylePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(fontStylePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(normalCheckB)
                    .addGroup(fontStylePanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(fontStylePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(italicCheckB)
                            .addComponent(boldCheckB)
                            .addComponent(boldItalicCheckB))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        fontStylePanelLayout.setVerticalGroup(
            fontStylePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fontStylePanelLayout.createSequentialGroup()
                .addComponent(normalCheckB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boldCheckB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(italicCheckB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boldItalicCheckB)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        fontSizePanel.setBackground(new java.awt.Color(57, 91, 100));
        fontSizePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Font Size", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(231, 246, 242))); // NOI18N
        fontSizePanel.setForeground(new java.awt.Color(231, 246, 242));
        fontSizePanel.setPreferredSize(new java.awt.Dimension(137, 153));

        buttonGroup.add(smallRB);
        smallRB.setForeground(new java.awt.Color(231, 246, 242));
        smallRB.setText("Small");
        smallRB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                smallRBItemStateChanged(evt);
            }
        });

        buttonGroup.add(largeRB);
        largeRB.setForeground(new java.awt.Color(231, 246, 242));
        largeRB.setText("Large");
        largeRB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                smallRBItemStateChanged(evt);
            }
        });

        buttonGroup.add(mediumRB);
        mediumRB.setForeground(new java.awt.Color(231, 246, 242));
        mediumRB.setText("Medium");
        mediumRB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                smallRBItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout fontSizePanelLayout = new javax.swing.GroupLayout(fontSizePanel);
        fontSizePanel.setLayout(fontSizePanelLayout);
        fontSizePanelLayout.setHorizontalGroup(
            fontSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fontSizePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(fontSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mediumRB)
                    .addGroup(fontSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(largeRB)
                        .addComponent(smallRB, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        fontSizePanelLayout.setVerticalGroup(
            fontSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fontSizePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(smallRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mediumRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(largeRB)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Downloads 300\\Photos\\JCashLogoFull.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(fontSizePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fontStylePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fontStylePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(fontSizePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void normalCheckBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_normalCheckBItemStateChanged
        if (evt.getSource() == normalCheckB) {
            if (evt.getStateChange() == 1) {
                txtToPlain();    
            }
        }
        if (evt.getSource() == boldCheckB) {
            if (evt.getStateChange() == 1) {
                bold = true;
                if (boldItalic == true) {
                    txtToBoldItalic();
                } else if (italic == true) {
                    txtToItalic();
                } else {
                    txtToBold();
                }
            } else {
                bold = false;
                if (boldItalic == true) {
                    txtToBoldItalic();
                } else if (italic == true) {
                    txtToItalic(); 
                } else {
                    txtToPlain();
                }
            }
        }
        if (evt.getSource() == italicCheckB) {
            if (evt.getStateChange() == 1) {
                italic = true;
                if (boldItalic == true) {
                    txtToBoldItalic();
                } else if (bold == true) {
                    txtToBoldItalic(); 
                } else {
                    txtToItalic();
                }
            } else {
                italic = false;
                if (boldItalic == true) {
                    txtToBoldItalic();
                } else if (bold == true) {
                    txtToBold();
                } else {
                    txtToPlain();
                }
            }
        }
        if (evt.getSource() == boldItalicCheckB) {
            if (evt.getStateChange() == 1) {  
                boldItalic = true;
                txtToBoldItalic();  
            } else {
                boldItalic = false;
                if (bold == true) {
                    if (italic == true) {
                        txtToBoldItalic();
                    } else {
                    txtToBold();
                    }
                } else if (italic == true) {
                    if (bold == true) {
                        txtToBoldItalic();
                    } else {
                        txtToItalic();                         
                    }
                } else {
                    txtToPlain();
                }
            }
        }
    }//GEN-LAST:event_normalCheckBItemStateChanged
    
    protected void FileRead (int choice) {
        System.out.println("FileRead ran");
        String[] FilePath = {
        "src/main/java/Resources/placeholder.txt", "src/main/java/Resources/Mahika-Lyrics.txt",
        "src/main/java/Resources/Lemonade-Lyrics.txt", "src/main/java/Resources/EspeciallyForYou-Lyrics.txt",
        "src/main/java/Resources/Gitara-Lyrics.txt", "src/main/java/Resources/Elesi-Lyrics.txt",
        "src/main/java/Resources/HulingSayaw-Lyrics.txt", "src/main/java/Resources/YouAreTheReason-Lyrics.txt",
        "src/main/java/Resources/JustTheWayYouAre-Lyrics.txt"
        };
        
        try {
            lyricsTextArea.setText(" \n");
            String lyricLine;
            File lyricFile = new File(FilePath[choice]);
            BufferedReader read = new BufferedReader(new FileReader(lyricFile));
            while ((lyricLine = read.readLine()) != null) {
                lyricsTextArea.append(lyricLine + "\n");
            }
            read.close();
            lyricsTextArea.setCaretPosition(0);
        } catch(Exception e2) { System.out.println("e2"); }              
    }
       
    private void songSelectComboBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_songSelectComboBItemStateChanged
        song = evt.getItem().toString();
        select(song);            
    }//GEN-LAST:event_songSelectComboBItemStateChanged
    
    private void smallRBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_smallRBItemStateChanged
        if (evt.getSource() == smallRB) {
            if (evt.getStateChange() == 1) {
                lyricsTextArea.setFont(lyricsTextArea.getFont().deriveFont(9.0f));
                select(song);    
            }
        }
        if (evt.getSource() == mediumRB) {
            if (evt.getStateChange() == 1) {
                lyricsTextArea.setFont(lyricsTextArea.getFont().deriveFont(15.0f));
                select(song);    
            }
        }
        if (evt.getSource() == largeRB) {
            if (evt.getStateChange() == 1) {
                lyricsTextArea.setFont(lyricsTextArea.getFont().deriveFont(20.0f));
                select(song);    
            }
        }
    }//GEN-LAST:event_smallRBItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItemEventLyrics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemEventLyrics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemEventLyrics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemEventLyrics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemEventLyrics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boldCheckB;
    private javax.swing.JCheckBox boldItalicCheckB;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JPanel fontSizePanel;
    private javax.swing.JPanel fontStylePanel;
    private javax.swing.JCheckBox italicCheckB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton largeRB;
    private javax.swing.JTextArea lyricsTextArea;
    private javax.swing.JRadioButton mediumRB;
    private javax.swing.JCheckBox normalCheckB;
    private javax.swing.JRadioButton smallRB;
    private javax.swing.JComboBox<String> songSelectComboB;
    // End of variables declaration//GEN-END:variables
}
