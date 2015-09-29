/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationgsb;

import static applicationgsb.ConnectBDD.ConnectBDD;
import static applicationgsb.ConnectBDD.con;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class IntervenantsDAO extends GeneriqueDAO <Intervenants> {
    
    public Connection getConnection() {
        ConnectBDD();
        return con;
    }
    

    @Override
    public Intervenants select(Intervenants obj) {
        
        return null;
    }
    
    public ArrayList <Intervenants> selectAll(){
        ResultSet res=null;
        ArrayList <Intervenants> meslogin= new ArrayList();
        try {                   
            String req = "SELECT * FROM intervenants";
            Statement stmt;
            stmt = con.createStatement();
            res = stmt.executeQuery(req);
            
          while (res.next()) {
              meslogin.add(new Intervenants(res.getInt("id"), res.getString("mdp"), res.getString("login")));
//                String login = res.getString("login");
//                IntervenantPage.jComboBox1.addItem(login);
            }  
            res.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnéeee");
            e.printStackTrace();
        }
        return meslogin;
    }

    @Override
    public Intervenants insert(Intervenants obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Intervenants update(Intervenants obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Intervenants obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
