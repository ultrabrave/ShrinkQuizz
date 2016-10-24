package cl.enexo.shrinkquizz.data;

/**
 * Created by Kevin on 19-10-2016.
 */
public class CoolResult extends CoolAnswer{

    public CoolResult(String user, Boolean party, int drinks) {
        super(user, party, drinks);
    }

    public String result()
    {
        return getUser() + " " + party() + "," + drinks() ;
    }

    private String party()
    {
        if (getParty())
        {
            return "Eres un salvaje";
        }
        else
        {
            return "Vaya empollon";
        }
    }

    private String drinks()
    {
        if (4 >= getDrinks())
        {
            return "Bebes con moderación";
        }
        else if (getDrinks() >= 5 && getDrinks() <= 8)
        {
            return "Eres brutal bebiendo";
        }
        else
        {
            return "Bebes como orilla de playa";
        }
    }
}
