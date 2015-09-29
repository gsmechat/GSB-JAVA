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
public class HistoryPanneDAO extends GeneriqueDAO <HistoryPanne> {
    
    public Connection getConnection() {
        ConnectBDD();
        return con;
    }
    
    public ArrayList <HistoryPanne> selectAll() {
        ResultSet res=null;
        ArrayList <HistoryPanne> mesPanne= new ArrayList();
  
        try {                   
            String req = "SELECT * FROM Historypanne";
        
            Statement stmt;
            stmt = con.createStatement();
            res = stmt.executeQuery(req);
            
          while (res.next()) {
              mesPanne.add(new HistoryPanne(res.getInt("idPanne"), res.getString("datePanne"), res.getString("TypeMaterielPanne"), res.getString("UrgencePanne"), res.getString("peripheriquePanne"),res.getString("idOrdinateurPanne"),res.getString("DescriptifPane"),res.getString("identifiantConnect")));
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

    @Override
    public HistoryPanne select(HistoryPanne obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HistoryPanne insert(HistoryPanne obj) {
        //String datePanne = obj.datePanne;
        //obj.getDatePanne();
        String formatDate = obj.getDatePanne();
        String typeMateriel = obj.getTypeMaterielPanne();
        String urgencePanne = obj.getUrgencePanne();
        String materiel = obj.getPeripheriquePanne();
        
        String descriptif = obj.getDescriptifPane();
        String machine = obj.getIdOrdinateurPanne();
        String identifiantConnect = obj.getIdentifiantConnect();
                
        ArrayList <Panne> mesPanne= new ArrayList();
        PreparedStatement preparedStmt = null;
        try {                                                                                                          // , `IdOrdinateurPanne`                                                                
            String Savequery = "INSERT INTO `Historypanne`(`datePanne`, `typeMaterielPanne`, `urgencePanne`, `peripheriquePanne`, `DescriptifPane`,`IdOrdinateurPanne`,`identifiantConnect` )" + "VALUES (?,?,?,?,?,?,?)";                        
            
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

    @Override
    public HistoryPanne update(HistoryPanne obj) {
       
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(HistoryPanne obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
