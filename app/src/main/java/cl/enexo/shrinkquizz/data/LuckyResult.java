package cl.enexo.shrinkquizz.data;

/**
 * Created by Kevin on 21-10-2016.
 */
public class LuckyResult extends LuckyAnswer {

    public LuckyResult(boolean lucky) {
        super(lucky);
    }

    private String lucky() {
        if (isLucky()) {
            return "En hora buena!";
        } else
            return "Animo!!!";
    }

    private String day() {
        if (isDay()) {
            return "es tu día de suerte";
        }
        else
        {
            return "Otro será tu día";
        }
    }

    public String result()
    {
        String res = "";
        res = lucky() +  "," + day();
        return res;
    }

}