/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationgsb;

/**
 *
 * @author admin
 */
public class HistoryPanne {
    private int idPanne;
    private String datePanne;
    private String typeMaterielPanne;
    private String urgencePanne;
    private String peripheriquePanne;
    private String DescriptifPane;
    private String idOrdinateurPanne;
    private String identifiantConnect;
            
    public HistoryPanne (int idPanne, String datePanne, String typeMaterielPanne ,String urgencePanne, String materiel, String idOrdinateurPanne, String DescriptifPane, String identifiantConnect){
        
        this.idPanne= idPanne;
        this.datePanne= datePanne;
        this.typeMaterielPanne= typeMaterielPanne;
        this.urgencePanne= urgencePanne;
        this.peripheriquePanne= materiel;
        this.idOrdinateurPanne= idOrdinateurPanne;
        this.DescriptifPane = DescriptifPane;
        this.identifiantConnect = identifiantConnect;
    }  
    
    HistoryPanne(String datePanne, String typeMaterielPanne, String urgencePanne ,String materiel, String DescriptifPane, String idOrdinateurPanne, String identifiantConnect){
        this.datePanne= datePanne;
        this.typeMaterielPanne= typeMaterielPanne;
        this.urgencePanne= urgencePanne;
        this.peripheriquePanne = materiel;
        this.DescriptifPane = DescriptifPane;
        this.idOrdinateurPanne = idOrdinateurPanne;
        this.identifiantConnect = identifiantConnect;
    }
    
    HistoryPanne (String datePanne){
        this.datePanne= datePanne;
    }  

    /**
     * @return the idPanne
     */
    public int getIdPanne() {
        return idPanne;
    }

    /**
     * @param idPanne the idPanne to set
     */
    public void setIdPanne(int idPanne) {
        this.idPanne = idPanne;
    }

    /**
     * @return the datePanne
     */
    public String getDatePanne() {
        return datePanne;
    }

    /**
     * @param datePanne the datePanne to set
     */
    public void setDatePanne(String datePanne) {
        this.datePanne = datePanne;
    }

    /**
     * @return the typeMaterielPanne
     */
    public String getTypeMaterielPanne() {
        return typeMaterielPanne;
    }

    /**
     * @param typeMaterielPanne the typeMaterielPanne to set
     */
    public void setTypeMaterielPanne(String typeMaterielPanne) {
        this.typeMaterielPanne = typeMaterielPanne;
    }

    /**
     * @return the urgencePanne
     */
    public String getUrgencePanne() {
        return urgencePanne;
    }

    /**
     * @param urgencePanne the urgencePanne to set
     */
    public void setUrgencePanne(String urgencePanne) {
        this.urgencePanne = urgencePanne;
    }

    /**
     * @return the peripheriquePanne
     */
    public String getPeripheriquePanne() {
        return peripheriquePanne;
    }

    /**
     * @param peripheriquePanne the peripheriquePanne to set
     */
    public void setPeripheriquePanne(String peripheriquePanne) {
        this.peripheriquePanne = peripheriquePanne;
    }

    /**
     * @return the DescriptifPane
     */
    public String getDescriptifPane() {
        return DescriptifPane;
    }

    /**
     * @param DescriptifPane the DescriptifPane to set
     */
    public void setDescriptifPane(String DescriptifPane) {
        this.DescriptifPane = DescriptifPane;
    }

    /**
     * @return the idOrdinateurPanne
     */
    public String getIdOrdinateurPanne() {
        return idOrdinateurPanne;
    }

    /**
     * @param idOrdinateurPanne the idOrdinateurPanne to set
     */
    public void setIdOrdinateurPanne(String idOrdinateurPanne) {
        this.idOrdinateurPanne = idOrdinateurPanne;
    }

    /**
     * @return the identifiantConnect
     */
    public String getIdentifiantConnect() {
        return identifiantConnect;
    }

    /**
     * @param identifiantConnect the identifiantConnect to set
     */
    public void setIdentifiantConnect(String identifiantConnect) {
        this.identifiantConnect = identifiantConnect;
    }

}