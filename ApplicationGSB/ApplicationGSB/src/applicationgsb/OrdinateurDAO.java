package applicationgsb;

import static applicationgsb.ConnectBDD.ConnectBDD;
import static applicationgsb.ConnectBDD.con;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class OrdinateurDAO extends GeneriqueDAO<Ordinateur> {

    public Connection getConnection() {
        ConnectBDD();
        return con;
    }

    public ArrayList<Ordinateur> selectAll() {
        ResultSet res = null;
        ArrayList<Ordinateur> mesOrdinateur = new ArrayList();
        try {
            String req = "SELECT * FROM ordinateur ORDER BY refOrdinateur DESC ";
            Statement stmt;
            stmt = con.createStatement();
            res = stmt.executeQuery(req);

            while (res.next()) {
                mesOrdinateur.add(new Ordinateur(res.getInt("idOrdinateur"), res.getString("refOrdinateur"), res.getString("CarteMere"), res.getString("Processeur"), res.getString("MemoireVive"), res.getString("DisqueDur"), res.getString("CarteReseau"), res.getString("Lecteur"), res.getString("CarteGraphique"), res.getString("CarteSon"), res.getString("Alimentation"), res.getString("numSerieOrdinateur"), res.getString("dateAchatOrdinateur"), res.getString("fournisseurOrdinateur"), res.getString("garantieOrdinateur"), res.getString("extentionGarantieOrdinateur")));
            }
            res.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur connexion avec la base de donnéeee");
            e.printStackTrace();
        }
        return mesOrdinateur;
    }

    @Override
    public Ordinateur insert(Ordinateur obj) {
        String query = "INSERT INTO `panne`(`datePanne`, `typeMaterielPanne`, `urgencePanne`, `peripheriquePanne`, `DescriptifPane` , `IdOrdinateurPanne` , `idPersonnel`)" + "VALUES (?,?,?,?,?,?,?)";

        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ordinateur update(Ordinateur obj) {

        String variable = obj.getVariable();
        String modification = obj.getModification();
        String machine = obj.getRefOrdinateur();

        if (!"-".equals(modification)) {
            try {
                String req = "UPDATE `gsb`.`ordinateur` SET `" + variable + "` = '" + modification + "' WHERE `ordinateur`.`refOrdinateur` = '" + machine + "';";

                PreparedStatement pst = null;
                pst = con.prepareStatement(req);
                pst.executeUpdate();
                pst.close();
                JOptionPane.showMessageDialog(null, "Modification bien effectué");
            } catch (SQLException ex) {
                Logger.getLogger(OrdinateurDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Veuillez rentrer une référence composant changer. Merci ");

        }
        return null;
    }

    @Override
    public void delete(Ordinateur obj) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ordinateur select(Ordinateur obj) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
