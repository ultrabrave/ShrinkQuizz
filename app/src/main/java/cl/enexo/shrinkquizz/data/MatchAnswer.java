package cl.enexo.shrinkquizz.data;

import android.content.Context;

/**
 * Created by Kevin on 24-10-2016.
 */
public class MatchAnswer {
    private String name,lovername;
    private String quarter;
    private Context context;

    public MatchAnswer(String name, String lovername, String quarter, Context context) {
        this.name = name;
        this.lovername = lovername;
        this.quarter = quarter;
        this.context = context;
    }


    public String getName() {
        return name;
    }

    public String getLovername() {
        return lovername;
    }

    public String getQuarter() {
        return quarter;
    }

    public Context getContext() {
        return context;
    }
}
