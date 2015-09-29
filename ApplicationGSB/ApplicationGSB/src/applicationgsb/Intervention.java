
package applicationgsb;
public class Intervention {
    
    int idIntervention;
    String dateIntervention;
    String machineIntervention;
    String composantSelectIntervention;
    int idPanneIntervention;
    String RCCIntervention;
    String infoIntervention;
    String idintervenant;
    
   public Intervention(int idIntervention,String dateIntervention,String machineIntervention,String composantSelectIntervention,int idPanneIntervention,String RCCIntervention,String infoIntervention,String idintervenant){
       this.idIntervention = idIntervention;
       this.dateIntervention = dateIntervention;
       this.machineIntervention = machineIntervention;
       this.composantSelectIntervention = composantSelectIntervention;
       this.idPanneIntervention = idPanneIntervention;
       this.RCCIntervention = RCCIntervention;
       this.infoIntervention = infoIntervention;
       this.idintervenant = idintervenant;
    }
   
   Intervention(int idIntervention, String dateIntervention) {
       this.idIntervention = idIntervention;
       this.dateIntervention = dateIntervention;
   }
   
  
   Intervention(int idIntervention, String dateIntervention, String machineIntervention, String composantSelectIntervention, String RCCIntervention, String infoIntervention) {
       this.idIntervention = idIntervention;
       this.dateIntervention = dateIntervention;
       this.machineIntervention = machineIntervention;
       this.composantSelectIntervention = composantSelectIntervention;
       this.RCCIntervention = RCCIntervention;
       this.infoIntervention = infoIntervention;
   }
   
   Intervention(String dateIntervention,String machineIntervention,String composantSelectIntervention,int idPanneIntervention,String RCCIntervention,String infoIntervention,String idintervenant){
       this.dateIntervention = dateIntervention;
       this.machineIntervention = machineIntervention;
       this.composantSelectIntervention = composantSelectIntervention;
       this.idPanneIntervention = idPanneIntervention;
       this.RCCIntervention = RCCIntervention;
       this.infoIntervention = infoIntervention;
       this.idintervenant = idintervenant;
    }

   
   
    Intervention() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    /**
     * @return the idIntervention
     */
    public int getIdIntervention() {
        return idIntervention;
    }

    /**
     * @param idIntervention the idIntervention to set
     */
    public void setIdIntervention(int idIntervention) {
        this.idIntervention = idIntervention;
    }

    /**
     * @return the dateIntervention
     */
    public String getDateIntervention() {
        return dateIntervention;
    }

    /**
     * @param dateIntervention the dateIntervention to set
     */
    public void setDateIntervention(String dateIntervention) {
        this.dateIntervention = dateIntervention;
    }

    /**
     * @return the machineIntervention
     */
    public String getMachineIntervention() {
        return machineIntervention;
    }

    /**
     * @param machineIntervention the machineIntervention to set
     */
    public void setMachineIntervention(String machineIntervention) {
        this.machineIntervention = machineIntervention;
    }

    /**
     * @return the composantSelectIntervention
     */
    public String getComposantSelectIntervention() {
        return composantSelectIntervention;
    }

    /**
     * @param composantSelectIntervention the composantSelectIntervention to set
     */
    public void setComposantSelectIntervention(String composantSelectIntervention) {
        this.composantSelectIntervention = composantSelectIntervention;
    }

    /**
     * @return the idPanneIntervention
     */
    public int getIdPanneIntervention() {
        return idPanneIntervention;
    }

    /**
     * @param idPanneIntervention the idPanneIntervention to set
     */
    public void setIdPanneIntervention(int idPanneIntervention) {
        this.idPanneIntervention = idPanneIntervention;
    }

    /**
     * @return the RCCIntervention
     */
    public String getRCCIntervention() {
        return RCCIntervention;
    }

    /**
     * @param RCCIntervention the RCCIntervention to set
     */
    public void setRCCIntervention(String RCCIntervention) {
        this.RCCIntervention = RCCIntervention;
    }

    /**
     * @return the infoIntervention
     */
    public String getInfoIntervention() {
        return infoIntervention;
    }

    /**
     * @param infoIntervention the infoIntervention to set
     */
    public void setInfoIntervention(String infoIntervention) {
        this.infoIntervention = infoIntervention;
    }

    /**
     * @return the idintervenant
     */
    public String getIdintervenant() {
        return idintervenant;
    }

    /**
     * @param idintervenant the idintervenant to set
     */
    public void setIdintervenant(String idintervenant) {
        this.idintervenant = idintervenant;
    }
}
