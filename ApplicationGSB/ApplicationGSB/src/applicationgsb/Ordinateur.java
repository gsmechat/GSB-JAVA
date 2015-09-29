package applicationgsb;


public class Ordinateur {
    private int idOrdinateur;
    private String refOrdinateur;
    private String CarteMere;
    private String Processeur;
    private String MemoireVive;
    private String DisqueDur;
    private String CarteReseau;
    private String Lecteur;
    private String CarteGraphique;
    private String CarteSon;
    private String Alimentation;
    private String numSerieOrdinateur;
    private String dateAchatOrdinateur;
    private String fournisseurOrdinateur;
    private String garantieOrdinateur;
    private String extensionGarantieOrdinateur;
    private String variable;
    private String ref;
    private String modification;
    //String machine;
    private String info;
    // String machine;
    
    public Ordinateur(int idOrdinateur, String refOrdinateur,  String CarteMere, String Processeur, String MemoireVive, String DisqueDur, String CarteReseau, String Lecteur, String CarteGraphique, String CarteSon, String Alimentation, String numSerieOrdinateur, String dateAchatOrdinateur, String fournisseurOrdinateur, String garantieOrdinateur, String extensionGarantieOrdinateur){
        this.idOrdinateur= idOrdinateur;
        this.refOrdinateur= refOrdinateur;
        this.CarteMere= CarteMere;
        this.Processeur= Processeur;
        this.MemoireVive= MemoireVive;
        this.DisqueDur= DisqueDur;
        this.CarteReseau= CarteReseau;
        this.Lecteur= Lecteur;
        this.CarteGraphique= CarteGraphique;
        this.CarteSon= CarteSon;
        this.Alimentation= Alimentation;
        this.numSerieOrdinateur = numSerieOrdinateur;
        this.dateAchatOrdinateur = dateAchatOrdinateur;
        this.fournisseurOrdinateur = fournisseurOrdinateur;
        this.garantieOrdinateur = garantieOrdinateur;
        this.extensionGarantieOrdinateur = extensionGarantieOrdinateur;
    }
    public Ordinateur(String variable, String modification, String machine){
        this.variable = variable;
        this.modification = modification;
        this.refOrdinateur = machine;
    }
  
    public Ordinateur(){
        
    }

    /**
     * @return the idOrdinateur
     */
    public int getIdOrdinateur() {
        return idOrdinateur;
    }

    /**
     * @param idOrdinateur the idOrdinateur to set
     */
    public void setIdOrdinateur(int idOrdinateur) {
        this.idOrdinateur = idOrdinateur;
    }

    /**
     * @return the refOrdinateur
     */
    public String getRefOrdinateur() {
        return refOrdinateur;
    }

    /**
     * @param refOrdinateur the refOrdinateur to set
     */
    public void setRefOrdinateur(String refOrdinateur) {
        this.refOrdinateur = refOrdinateur;
    }

    /**
     * @return the CarteMere
     */
    public String getCarteMere() {
        return CarteMere;
    }

    /**
     * @param CarteMere the CarteMere to set
     */
    public void setCarteMere(String CarteMere) {
        this.CarteMere = CarteMere;
    }

    /**
     * @return the Processeur
     */
    public String getProcesseur() {
        return Processeur;
    }

    /**
     * @param Processeur the Processeur to set
     */
    public void setProcesseur(String Processeur) {
        this.Processeur = Processeur;
    }

    /**
     * @return the MemoireVive
     */
    public String getMemoireVive() {
        return MemoireVive;
    }

    /**
     * @param MemoireVive the MemoireVive to set
     */
    public void setMemoireVive(String MemoireVive) {
        this.MemoireVive = MemoireVive;
    }

    /**
     * @return the DisqueDur
     */
    public String getDisqueDur() {
        return DisqueDur;
    }

    /**
     * @param DisqueDur the DisqueDur to set
     */
    public void setDisqueDur(String DisqueDur) {
        this.DisqueDur = DisqueDur;
    }

    /**
     * @return the CarteReseau
     */
    public String getCarteReseau() {
        return CarteReseau;
    }

    /**
     * @param CarteReseau the CarteReseau to set
     */
    public void setCarteReseau(String CarteReseau) {
        this.CarteReseau = CarteReseau;
    }

    /**
     * @return the Lecteur
     */
    public String getLecteur() {
        return Lecteur;
    }

    /**
     * @param Lecteur the Lecteur to set
     */
    public void setLecteur(String Lecteur) {
        this.Lecteur = Lecteur;
    }

    /**
     * @return the CarteGraphique
     */
    public String getCarteGraphique() {
        return CarteGraphique;
    }

    /**
     * @param CarteGraphique the CarteGraphique to set
     */
    public void setCarteGraphique(String CarteGraphique) {
        this.CarteGraphique = CarteGraphique;
    }

    /**
     * @return the CarteSon
     */
    public String getCarteSon() {
        return CarteSon;
    }

    /**
     * @param CarteSon the CarteSon to set
     */
    public void setCarteSon(String CarteSon) {
        this.CarteSon = CarteSon;
    }

    /**
     * @return the Alimentation
     */
    public String getAlimentation() {
        return Alimentation;
    }

    /**
     * @param Alimentation the Alimentation to set
     */
    public void setAlimentation(String Alimentation) {
        this.Alimentation = Alimentation;
    }

    /**
     * @return the numSerieOrdinateur
     */
    public String getNumSerieOrdinateur() {
        return numSerieOrdinateur;
    }

    /**
     * @param numSerieOrdinateur the numSerieOrdinateur to set
     */
    public void setNumSerieOrdinateur(String numSerieOrdinateur) {
        this.numSerieOrdinateur = numSerieOrdinateur;
    }

    /**
     * @return the dateAchatOrdinateur
     */
    public String getDateAchatOrdinateur() {
        return dateAchatOrdinateur;
    }

    /**
     * @param dateAchatOrdinateur the dateAchatOrdinateur to set
     */
    public void setDateAchatOrdinateur(String dateAchatOrdinateur) {
        this.dateAchatOrdinateur = dateAchatOrdinateur;
    }

    /**
     * @return the fournisseurOrdinateur
     */
    public String getFournisseurOrdinateur() {
        return fournisseurOrdinateur;
    }

    /**
     * @param fournisseurOrdinateur the fournisseurOrdinateur to set
     */
    public void setFournisseurOrdinateur(String fournisseurOrdinateur) {
        this.fournisseurOrdinateur = fournisseurOrdinateur;
    }

    /**
     * @return the garantieOrdinateur
     */
    public String getGarantieOrdinateur() {
        return garantieOrdinateur;
    }

    /**
     * @param garantieOrdinateur the garantieOrdinateur to set
     */
    public void setGarantieOrdinateur(String garantieOrdinateur) {
        this.garantieOrdinateur = garantieOrdinateur;
    }

    /**
     * @return the extensionGarantieOrdinateur
     */
    public String getExtensionGarantieOrdinateur() {
        return extensionGarantieOrdinateur;
    }

    /**
     * @param extensionGarantieOrdinateur the extensionGarantieOrdinateur to set
     */
    public void setExtensionGarantieOrdinateur(String extensionGarantieOrdinateur) {
        this.extensionGarantieOrdinateur = extensionGarantieOrdinateur;
    }

    /**
     * @return the variable
     */
    public String getVariable() {
        return variable;
    }

    /**
     * @param variable the variable to set
     */
    public void setVariable(String variable) {
        this.variable = variable;
    }

    /**
     * @return the ref
     */
    public String getRef() {
        return ref;
    }

    /**
     * @param ref the ref to set
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * @return the modification
     */
    public String getModification() {
        return modification;
    }

    /**
     * @param modification the modification to set
     */
    public void setModification(String modification) {
        this.modification = modification;
    }

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }

   

    
}
