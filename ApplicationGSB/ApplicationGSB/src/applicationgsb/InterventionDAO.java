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

public class InterventionDAO extends GeneriqueDAO <Intervention> {
    
    public Connection getConnection() {
        ConnectBDD();
        return con;
    }

   
    public ArrayList<Intervention> selectAll() {
        ResultSet res = null;
        ArrayList<Intervention> mesIntervention = new ArrayList();
        try {
            String req = "SELECT idIntervention, dateIntervention, machineIntervention, composantSelectIntervention, RCCIntervention, infoIntervention FROM intervention";
            Statement stmt;
            stmt = con.createStatement();
            res = stmt.executeQuery(req);

            while (res.next()) {
               // String dateIntervention,String machineIntervention,String composantSelectIntervention,int idPanneIntervention,String RCCIntervention,String infoIntervention,String idintervenant
               
                mesIntervention.add(new Intervention(res.getInt("idIntervention"), res.getString("dateIntervention"), res.getString("machineIntervention") , res.getString("composantSelectIntervention") , res.getString("RCCIntervention"), res.getString("infoIntervention")));
            }
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnéeee");
            e.printStackTrace();
        }
        return mesIntervention; 
    }
  
    
    
    @Override
    
    public Intervention insert(Intervention obj) {
        String date = obj.getDateIntervention();
        String machine = obj.getMachineIntervention();
        String composant = obj.getComposantSelectIntervention();
        int idPanne = obj.getIdPanneIntervention();
        String referenceChange = obj.getRCCIntervention();
        if(referenceChange == null){
            referenceChange = "-";
        }
        String infoInter = obj.getInfoIntervention();
        if (infoInter == null){
            infoInter = "-";
        }
        String idIntervenant = obj.getIdintervenant();
       // ArrayList <Intervention> mesPanne= new ArrayList();
       // PreparedStatement preparedStmt = null;
        try {                                                                                                          // , `IdOrdinateurPanne`                                                                
            String Savequery = "INSERT INTO `Intervention`(`dateIntervention`, `machineIntervention`, `composantSelectIntervention`, `idPanneIntervention`, `RCCIntervention`,`infoIntervention`,`idIntervenant` )" + "VALUES (?,?,?,?,?,?,?)";                        
            
            PreparedStatement preparedStmtSave = con.prepareStatement(Savequery);
//            
            preparedStmtSave.setString(1, date);
            preparedStmtSave.setString(2, machine);
            preparedStmtSave.setString(3, composant);
            preparedStmtSave.setInt(4, idPanne);
            preparedStmtSave.setString(5, referenceChange);
            preparedStmtSave.setString(6, infoInter);
            preparedStmtSave.setString(7, idIntervenant);
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
    public Intervention update(Intervention obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Intervention obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Intervention select(Intervention obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    




