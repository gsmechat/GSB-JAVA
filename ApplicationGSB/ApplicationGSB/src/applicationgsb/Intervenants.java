package applicationgsb;

public class Intervenants {
    private int id;
    private String mdp;
    private String login;
    
    public Intervenants(int id, String mdp, String login){
        this.id=id;
        this.login=login;
        this.mdp=mdp;
    }
    
    public Intervenants (String login){
        this.login= login;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param mdp the mdp to set
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }
    
}
