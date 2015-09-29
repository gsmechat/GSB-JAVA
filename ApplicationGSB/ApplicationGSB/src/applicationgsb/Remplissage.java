package applicationgsb;

import static applicationgsb.ConnectBDD.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class Remplissage {

    public static void remplir_Table_Intervenant() {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Panne");
        model.addColumn("Date Panne");
        model.addColumn("Type Materiel");
        model.addColumn("Urgence Panne");
        model.addColumn("Peripherique Panne");
        model.addColumn("Ordinateur");

        String requete = "SELECT * FROM panne";
        try {
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(requete);
            while (res.next()) {
                model.addRow(new Object[]{res.getString("idPanne"), res.getString("datePanne"), res.getString("typeMaterielPanne"), res.getString("UrgencePanne"), res.getString("peripheriquePanne"), res.getString("idOrdinateurPanne")});
            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erreur");
        }
        IntervenantPage.jTable2.setModel(model);
    }

    public static void remplir_Table_DescriptifOrdinateurPage(String nomDOP) {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Panne");
        model.addColumn("Date Panne");
        model.addColumn("Type Materiel");
        model.addColumn("Urgence Panne");
        model.addColumn("Peripherique Panne");

        String requete = "SELECT * FROM panne where idOrdinateurPanne= '" + nomDOP + "'";
        try {
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(requete);
            while (res.next()) {
                model.addRow(new Object[]{res.getString("idPanne"), res.getString("datePanne"), res.getString("typeMaterielPanne"), res.getString("UrgencePanne"), res.getString("peripheriquePanne")});
            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erreur");
        }
        DescriptifOrdinateurPage.jTable1.setModel(model);
    }


    public static void remplir_Box_Intervenant() {
        try {
            String req = "SELECT login FROM intervenants";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                String login = res.getString("login");
                IntervenantPage.jComboBox1.addItem(login);
            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnéeee");
            e.printStackTrace();
        }

    }

    public static void remplir_Combo_Machine() {
        try {
            String req = "SELECT refOrdinateur FROM ordinateur";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                String refOrdinateur = res.getString("refOrdinateur");
                PersonnelPage.jComboBox1.addItem(refOrdinateur);
            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée");
            e.printStackTrace();
        }

    }

    public static void remplir_Combo_Machine_DOP() {
        try {
            String req = "SELECT refOrdinateur FROM ordinateur";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                String refOrdinateur = res.getString("refOrdinateur");
                DescriptifOrdinateurPage.jComboBox1.addItem(refOrdinateur);
            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée");
            e.printStackTrace();
        }

    }

    public static void remplir_Descriptif_Ordinateur(String nomO) {
        try {
            String req = "SELECT * FROM `ordinateur` WHERE refOrdinateur = " + "'" + nomO + "'";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                String refOrdinateur = res.getString("refOrdinateur");
                DescriptifOrdinateurPage.jLabel21.setText(refOrdinateur);

            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée");
            e.printStackTrace();
        }

    }

    public static void remplir_Descriptif_CarteMere(String nomCM) {
        
         String tableau[]= {"CarteMere","Processeur","MemoireVive","DisqueDur","CarteReseau","Lecteur","CarteGraohique","CarteSon","Alimentaion"}; 
        
        try {
            int i;
            for( i =0; i<9; i++){
            String req = "SELECT"+ tableau[i] +" FROM `ordinateur` WHERE refOrdinateur = " + "'" + nomCM + "'";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                
                String resultat = res.getString(tableau[i]);
                if (i == 0)
                    DescriptifOrdinateurPage.jLabel12.setText(resultat);
                else if (i == 1)
                    DescriptifOrdinateurPage.jLabel13.setText(resultat);
                else if (i == 2)
                    DescriptifOrdinateurPage.jLabel14.setText(resultat);
                else if (i == 3)
                    DescriptifOrdinateurPage.jLabel15.setText(resultat);
                else if (i == 4)
                    DescriptifOrdinateurPage.jLabel16.setText(resultat);
                else if (i == 5)
                    DescriptifOrdinateurPage.jLabel17.setText(resultat);
                else if (i == 6)
                    DescriptifOrdinateurPage.jLabel18.setText(resultat);
                else if (i == 7)
                    DescriptifOrdinateurPage.jLabel19.setText(resultat);
                else if (i == 8)
                    DescriptifOrdinateurPage.jLabel20.setText(resultat);
                    
            }
            res.close();
            stmt.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée");
            e.printStackTrace();
        }

    }

    public static void remplir_Descriptif_Processeur(String nomP) {
        try {
            String req = "SELECT Processeur FROM `ordinateur` WHERE refOrdinateur = " + "'" + nomP + "'";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                String Processeur = res.getString("Processeur");
                DescriptifOrdinateurPage.jLabel13.setText(Processeur);

            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée");
            e.printStackTrace();
        }

    }

    public static void remplir_Descriptif_MemoireVive(String nomMV) {
        try {
            String req = "SELECT MemoireVive FROM `ordinateur` WHERE refOrdinateur = " + "'" + nomMV + "'";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                String MemoireVive = res.getString("MemoireVive");
                DescriptifOrdinateurPage.jLabel14.setText(MemoireVive);
            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée");
            e.printStackTrace();
        }

    }

    public static void remplir_Descriptif_DisqueDur(String nomDD) {
        try {
            String req = "SELECT DisqueDur FROM `ordinateur` WHERE refOrdinateur = " + "'" + nomDD + "'";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                String DisqueDur = res.getString("DisqueDur");
                DescriptifOrdinateurPage.jLabel15.setText(DisqueDur);

            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée");
            e.printStackTrace();
        }

    }

    public static void remplir_Descriptif_CarteReseau(String nomCR) {
        try {
            String req = "SELECT CarteReseau FROM `ordinateur` WHERE refOrdinateur = " + "'" + nomCR + "'";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                String CarteReseau = res.getString("CarteReseau");
                DescriptifOrdinateurPage.jLabel16.setText(CarteReseau);

            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée");
            e.printStackTrace();
        }

    }

    public static void remplir_Descriptif_Lecteur(String nomL) {
        try {
            String req = "SELECT Lecteur FROM `ordinateur` WHERE refOrdinateur = " + "'" + nomL + "'";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                String DisqueDur = res.getString("Lecteur");
                DescriptifOrdinateurPage.jLabel17.setText(DisqueDur);

            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée");
            e.printStackTrace();
        }

    }

    public static void remplir_Descriptif_CarteGraphique(String nomCG) {
        try {
            String req = "SELECT CarteGraphique FROM `ordinateur` WHERE refOrdinateur = " + "'" + nomCG + "'";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                String CarteGraphique = res.getString("CarteGraphique");
                DescriptifOrdinateurPage.jLabel18.setText(CarteGraphique);

            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée");
            e.printStackTrace();
        }

    }

    public static void remplir_Descriptif_CarteSon(String nomCS) {
        try {
            String req = "SELECT CarteSon FROM `ordinateur` WHERE refOrdinateur = " + "'" + nomCS + "'";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                String CarteSon = res.getString("CarteSon");
                DescriptifOrdinateurPage.jLabel19.setText(CarteSon);

            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée");
            e.printStackTrace();
        }

    }

    public static void remplir_Descriptif_Alimentation(String nomA) {
        try {
            String req = "SELECT Alimentation FROM `ordinateur` WHERE refOrdinateur = " + "'" + nomA + "'";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                String Alimentation = res.getString("Alimentation");
                DescriptifOrdinateurPage.jLabel20.setText(Alimentation);

            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée");
            e.printStackTrace();
        }

    }

    public static void remplir_Combo_MachineIntervenant() {
        try {
            String req = "SELECT refOrdinateur FROM ordinateur";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                String refOrdinateur = res.getString("refOrdinateur");
                IntervenantPage.jComboBox2.addItem(refOrdinateur);
            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée");
            e.printStackTrace();
        }

    }

    public static void upDate_BDD(String index, String var, String ordinateur) {
        try {
            String req = "UPDATE `gsb`.`ordinateur` SET `" + index + "` = '" + var + "' WHERE `ordinateur`.`refOrdinateur` = '" + ordinateur + "';";

            PreparedStatement pst = null;
            pst = con.prepareStatement(req);
            pst.executeUpdate();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée111");
            e.printStackTrace();
        }

    }
    
    public static void remplir_Combo_idPanne_Intervenant(String ordinateur) {
        try {
            String req = "SELECT idPanne FROM panne where idOrdinateurPanne = '"+ordinateur+"'";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(req);
            while (res.next()) {
                String idpanne = res.getString("idpanne");
                IntervenantPage.jComboBox4.addItem(idpanne);
            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnée");
            e.printStackTrace();
        }
    }
    
}
