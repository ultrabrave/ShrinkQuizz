package cl.enexo.shrinkquizz.data;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import cl.enexo.shrinkquizz.R;

/**
 * Created by Kevin on 24-10-2016.
 */
public class MatchResult extends MatchAnswer{

    public MatchResult(String name, String lovername, String quarter, Context context) {
        super(name, lovername, quarter, context);
    }

    private String nameComparator()
    {
        int uName = getName().length();
        int lName = getLovername().length();
        int dif = uName - lName;
        if (dif >= 5)
        {
            return "Son compatibles";
        }
        else
        {
            return "No son compatibles";
        }
    }

    private String quarterComparator()
    {
        List<String> quarters = new ArrayList<>();
        quarters.add(getContext().getString(R.string.first_quarter));
        quarters.add(getContext().getString(R.string.second_quarter));
        quarters.add(getContext().getString(R.string.Third_quarter));
        quarters.add(getContext().getString(R.string.Fourth_quarter));

        int matcher = 0;
        for (int i = 0; i < quarters.size(); i++) {
            String quarter = quarters.get(i).toString();
            if (getQuarter().equals(quarter))
            {
                matcher = i;
            }
        }

        if (matcher%2 == 0)
        {
            return "Son la pareja perfecta";
        }
        else
        {
            return "Necesitan terapia de parejita";
        }
    }

    public String Result()
    {
        return nameComparator() + ", " +  quarterComparator();
    }
}
