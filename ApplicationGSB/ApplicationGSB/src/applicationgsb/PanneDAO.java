package applicationgsb;

import static applicationgsb.ConnectBDD.ConnectBDD;
import static applicationgsb.ConnectBDD.con;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class PanneDAO extends GeneriqueDAO <Panne> {
    
    public Connection getConnection() {
        ConnectBDD();
        return con;
    }


    @Override
    public Panne select(Panne obj) {
//        
//        DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("Id Panne");
//        model.addColumn("Date Panne");
//        model.addColumn("Type Materiel");
//        model.addColumn("Urgence Panne");
//        model.addColumn("Peripherique Panne");
//        model.addColumn("Ordinateur");
//
//        String requete = "SELECT * FROM panne";
//        try {
//            Statement stmt;
//            stmt = con.createStatement();
//            ResultSet res = stmt.executeQuery(requete);
//            while (res.next()) {
//                model.addRow(new Object[]{res.getString("idPanne"), res.getString("datePanne"), res.getString("typeMaterielPanne"), res.getString("UrgencePanne"), res.getString("peripheriquePanne"), res.getString("idOrdinateurPanne")});
//            }
//            res.close();
//            stmt.close();
//        } catch (SQLException e) {
//            System.out.println("Erreur");
//        }
//        
//        IntervenantPage.jTable2.setModel(model);
//        
        
        
        
        try {
            String a = obj.getPanne();
            String req = "SELECT idPanne FROM panne where idOrdinateurPanne = '"+a+"'";
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
        return null; 
    }
    
  
    public ArrayList <Panne> selectAll() {
        ResultSet res=null;
        ArrayList <Panne> mesPanne= new ArrayList();
  
        try {                   
            String req = "SELECT * FROM panne";
        
            Statement stmt;
            stmt = con.createStatement();
            res = stmt.executeQuery(req);
            
          while (res.next()) {
              mesPanne.add(new Panne(res.getInt("idPanne"), res.getString("datePanne"), res.getString("TypeMaterielPanne"), res.getString("UrgencePanne"), res.getString("peripheriquePanne"), res.getString("idOrdinateurPanne"), res.getString("DescriptifPane")));
//                String login = res.getString("login");
//                IntervenantPage.jComboBox1.addItem(login);
            }  
            res.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnéeee");
            e.printStackTrace();
        }
        
        
        return mesPanne;
    }


    
    public PreparedStatement insertAll() {
        ResultSet res=null;
        ArrayList <Panne> mesPanne= new ArrayList();
        PreparedStatement preparedStmt = null;
        try {                   
            String req = "INSERT INTO `panne`(`datePanne`, `typeMaterielPanne`, `urgencePanne`, `peripheriquePanne`, `DescriptifPane` , `IdOrdinateurPanne` )" + "VALUES (?,?,?,?,?,?)";
            
            preparedStmt= con.prepareStatement(req);
            
//            Statement stmt;
//            stmt = con.createStatement();
//            res = stmt.executeQuery(req);
            
//          while (res.next()) {
//              mesPanne.add(new Panne(res.getString("datePanne"), res.getString("typeMaterielPanne"), res.getString("urgencePanne"), res.getString("peripheriquePanne"), res.getString("DescriptifPanne"), res.getString("IdOrdinateurPanne"), res.getInt("idPersonnel")));
////                String login = res.getString("login");
////                IntervenantPage.jComboBox1.addItem(login);
//            }  
//            res.close();
//            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnéeee");
            e.printStackTrace();
        }
       
        
        return preparedStmt;
    
    }

 
   
    
    
    
//    public ArrayList <Panne> insertAll() {
//        ResultSet res=null;
//        ArrayList <Panne> mesPanne= new ArrayList();
//        
//        try {                   
//            String req = "INSERT INTO `panne`(`datePanne`, `typeMaterielPanne`, `urgencePanne`, `peripheriquePanne`, `DescriptifPane` , `IdOrdinateurPanne` , `idpersonnel`)" + "VALUES (?,?,?,?,?,?,?)";
//        
//            Statement stmt;
//            stmt = con.createStatement();
//            res = stmt.executeQuery(req);
//            
//          while (res.next()) {
//              mesPanne.add(new Panne(res.getString("datePanne"), res.getString("typeMaterielPanne"), res.getString("urgencePanne"), res.getString("peripheriquePanne"), res.getString("DescriptifPanne"), res.getString("IdOrdinateurPanne"), res.getInt("idPersonnel")));
////                String login = res.getString("login");
////                IntervenantPage.jComboBox1.addItem(login);
//            }  
//            res.close();
//            
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnéeee");
//            e.printStackTrace();
//        }
//        
//        
//        return mesPanne;
//    }

    

    @Override
    public void delete(Panne obj) {
        
        int idPanne = obj.getIdPanne();
        String requete ="DELETE FROM panne where idPanne= '" + idPanne + "';";
        try {
            Statement stmt;
            stmt = con.createStatement();
            stmt.execute(requete);
           
           // res.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erreur");
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Panne update(Panne obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Panne insert(Panne obj) {
        
        String formatDate = obj.getDatePanne();
        String typeMateriel = obj.getTypeMaterielPanne();
        String urgencePanne = obj.getUrgencePanne();
        String materiel = obj.getPeripheriquePanne();
        
        String descriptif = obj.getDescriptifPanne();
        String machine = obj.getIdOrdinateurPanne();
        String identifiantConnect = obj.getIdentifiantConnect();
                
        ArrayList <Panne> mesPanne= new ArrayList();
        PreparedStatement preparedStmt = null;
        try {                                                                                                          // , `IdOrdinateurPanne`                                                                
            String Savequery = "INSERT INTO `panne`(`datePanne`, `typeMaterielPanne`, `urgencePanne`, `peripheriquePanne`, `DescriptifPane`,`IdOrdinateurPanne`,`identifiantConnect` )" + "VALUES (?,?,?,?,?,?,?)";                        
            
            PreparedStatement preparedStmtSave = con.prepareStatement(Savequery);
//            
            preparedStmtSave.setString(1, formatDate);
            preparedStmtSave.setString(2, typeMateriel);
            preparedStmtSave.setString(3, urgencePanne);
            preparedStmtSave.setString(4, materiel);
            preparedStmtSave.setString(5, descriptif);
            preparedStmtSave.setString(6, machine);
            preparedStmtSave.setString(7, identifiantConnect);
            preparedStmtSave.execute();
//            
//            //String req = "SELECT refOrdinateur FROM ordinateur";
//            Statement stmt;
//            stmt = con.createStatement();
//            ResultSet res = stmt.executeQuery(req);
            
           //preparedStmt= con.prepareStatement(req);
            
          //  ResultSet res = preparedStmt.executeQuery(req);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnéeeeeeeeeeeeeee");
            e.printStackTrace();
        }
       
        
        return null;
        
        
        
    }
}

   
    
    
    


    
