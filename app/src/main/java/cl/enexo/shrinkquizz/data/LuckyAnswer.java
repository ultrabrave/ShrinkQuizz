package cl.enexo.shrinkquizz.data;

import java.util.Date;

/**
 * Created by Kevin on 21-10-2016.
 */
public class LuckyAnswer {
    private boolean day,lucky;

    public LuckyAnswer(boolean lucky) {
        this.lucky = lucky;
        day = new LuckyDay().day();
    }

    public boolean isDay() {
        return day;
    }

    public boolean isLucky() {
        return lucky;
    }

    public class LuckyDay
    {
        private Date date = new Date();
        public boolean day()
        {
            int year = date.getYear();
            int month = date.getMonth();
            int day = date.getDay();
            int result = year + month + day;
            if (result%2==0)
            {
                return  true;
            }
            else
            {
                return false;
            }
        }
    }
}
