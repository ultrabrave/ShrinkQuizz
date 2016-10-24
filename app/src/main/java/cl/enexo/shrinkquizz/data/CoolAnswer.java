package cl.enexo.shrinkquizz.data;

/**
 * Created by Kevin on 19-10-2016.
 */
public class CoolAnswer {
    private String user;
    private Boolean party;
    private int drinks;

    public CoolAnswer(String user, Boolean party, int drinks) {
        this.user = user;
        this.party = party;
        this.drinks = drinks;
    }

    public String getUser() {
        return user;
    }

    public Boolean getParty() {
        return party;
    }

    public int getDrinks() {
        return drinks;
    }
}
