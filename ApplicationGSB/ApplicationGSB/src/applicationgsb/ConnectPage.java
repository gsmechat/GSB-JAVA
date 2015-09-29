
package applicationgsb;

import static applicationgsb.ConnectBDD.ConnectBDD;
import static applicationgsb.ConnectBDD.con;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class ConnectPage extends javax.swing.JFrame implements KeyListener {

    public static String getIdentifiant(){ // RETOURNE IDENTIFIANT PASSER EN ARGUMENT
        return identifiant;
    }
    
    PreparedStatement pstP = null;
    PreparedStatement pstI = null;
    public static String identifiant;
 
    public ConnectPage() {
        initComponents();
        ConnectBDD();
        jToggleButton1.addKeyListener(this);
        this.setIconImage(new ImageIcon(getClass().getResource("gsb-icon.png")).getImage());
    }
    
    
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        MotDePasse = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Identifiant = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GSB Tool's");

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton1.setText("Suivant");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton2.setSelected(true);
        jToggleButton2.setText("Annuler");
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/applicationgsb/gsb-logo.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Connexion"));
        jPanel2.setForeground(new java.awt.Color(0, 204, 204));

        MotDePasse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MotDePasseMouseClicked(evt);
            }
        });
        MotDePasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotDePasseActionPerformed(evt);
            }
        });
        MotDePasse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MotDePasseKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Mot de passe");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Identifiant");

        Identifiant.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        Identifiant.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                IdentifiantMouseMoved(evt);
            }
        });
        Identifiant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IdentifiantFocusLost(evt);
            }
        });
        Identifiant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IdentifiantMouseClicked(evt);
            }
        });
        Identifiant.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                IdentifiantCaretPositionChanged(evt);
            }
        });
        Identifiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentifiantActionPerformed(evt);
            }
        });
        Identifiant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IdentifiantKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IdentifiantKeyReleased(evt);
            }
        });

        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Je clique car je suis humain");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jButton1.setText("Connexion via internet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(224, 224, 224)))
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 192, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton1)
                            .addComponent(jToggleButton2))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        int security;
        
        if(jCheckBox1.isSelected()){
            security = 1;
        }else {
            security = 0;
        }
        identifiant = Identifiant.getText().toString();
       
        Statement state = null;
        try {
            state = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ResultSet resultPersonnel = null;
        ResultSet resultIntervenant = null;

        String sqlP = "select * from Personnel  where login=? and mdp=?";
        String sqlI = "select * from Intervenants  where login=? and mdp=?";
        try {
            //pstP = pour les personnel
            pstP = con.prepareCall(sqlP);
            pstP.setString(1, Identifiant.getText());
            pstP.setString(2, MotDePasse.getText());
            resultPersonnel = pstP.executeQuery();
            
            //psti = pour les intervenants
            pstI = con.prepareCall(sqlI);
            pstI.setString(1, Identifiant.getText());
            pstI.setString(2, MotDePasse.getText());
            resultIntervenant = pstI.executeQuery();
            
            if (resultPersonnel.next() && security == 1) {
                new PersonnelPage().setVisible(true);
                this.setVisible(false);
            } 
            else if(resultIntervenant.next() && security == 1){
                new IntervenantPage().setVisible(true);
                this.setVisible(false);
                
            }else {
                JOptionPane.showMessageDialog(null, "Mauvais mot de passe ou identifiant, veuillez réessayer. (Etes-vous humain ? ;-) ).");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jToggleButton1ActionPerformed

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object jtSiteWeb = null;
		if (jButton1.getAction()==jtSiteWeb){
			if(Desktop.isDesktopSupported()){
				if(Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)){
					URI uri;
					try {
						uri = new URI("http://localhost:8888/gsbfinal/");
						Desktop.getDesktop().browse(uri);
					} catch (IOException arg0) {
						arg0.printStackTrace();
					} catch (URISyntaxException ex) {
                                        Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
                                    }
				}
			}
                            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MotDePasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotDePasseActionPerformed

    }//GEN-LAST:event_MotDePasseActionPerformed

    private void IdentifiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentifiantActionPerformed

    }//GEN-LAST:event_IdentifiantActionPerformed

    private void IdentifiantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdentifiantKeyPressed
    
    }//GEN-LAST:event_IdentifiantKeyPressed

    private void MotDePasseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MotDePasseKeyPressed
        
    }//GEN-LAST:event_MotDePasseKeyPressed

    private void IdentifiantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdentifiantKeyReleased
       
    }//GEN-LAST:event_IdentifiantKeyReleased

    private void IdentifiantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdentifiantFocusLost
        
    }//GEN-LAST:event_IdentifiantFocusLost

    private void IdentifiantMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdentifiantMouseMoved

    }//GEN-LAST:event_IdentifiantMouseMoved

    private void IdentifiantCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_IdentifiantCaretPositionChanged

    }//GEN-LAST:event_IdentifiantCaretPositionChanged

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        jToggleButton1.requestFocus(true);
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void MotDePasseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MotDePasseMouseClicked
        jCheckBox1.setSelected(false);
    }//GEN-LAST:event_MotDePasseMouseClicked

    private void IdentifiantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdentifiantMouseClicked
        jCheckBox1.setSelected(false);
    }//GEN-LAST:event_IdentifiantMouseClicked
    
     
     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ConnectPage().setVisible(true);
            }
        });
    }
    
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Identifiant;
    private javax.swing.JPasswordField MotDePasse;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void keyPressed(KeyEvent e){
       if (e.getKeyCode() == KeyEvent.VK_ENTER){
           identifiant = Identifiant.getText().toString();
       
        Statement state = null;
        try {
            state = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ResultSet resultPersonnel = null;
        ResultSet resultIntervenant = null;

        String sqlP = "select * from Personnel  where login=? and mdp=?";
        String sqlI = "select * from Intervenants  where login=? and mdp=?";
        try {
            //pstP = pour les personnel
            pstP = con.prepareCall(sqlP);
            pstP.setString(1, Identifiant.getText());
            pstP.setString(2, MotDePasse.getText());
            resultPersonnel = pstP.executeQuery();
            
            //psti = pour les intervenants
            pstI = con.prepareCall(sqlI);
            pstI.setString(1, Identifiant.getText());
            pstI.setString(2, MotDePasse.getText());
            resultIntervenant = pstI.executeQuery();
            
            if (resultPersonnel.next()) {
                new PersonnelPage().setVisible(true);
                this.setVisible(false);
            } 
            else if(resultIntervenant.next()){
                new IntervenantPage().setVisible(true);
                this.setVisible(false);
                
            }else {
                JOptionPane.showMessageDialog(null, "Mauvais mot de passe ou identifiant, veuillez réessayer. (Si le probleme perciste contacter nous).");
            }
        } catch (Exception f) {
            JOptionPane.showMessageDialog(null, f);
        }
       }
    }
   }    
