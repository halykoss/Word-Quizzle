package Request;
/**
 *  Formato di una richiesta di lista utenti
 *
 * @author Federico Pennino
 */
public class ListFriends implements Request {
    // Il nome dell'utente che vuole la lista dei suoi amici
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
