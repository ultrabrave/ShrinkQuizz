package cl.enexo.shrinkquizz.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cl.enexo.shrinkquizz.views.CoolFragment;
import cl.enexo.shrinkquizz.views.LuckyFragment;
import cl.enexo.shrinkquizz.views.MatchFragment;
import cl.enexo.shrinkquizz.R;

/**
 * Created by Kevin on 19-10-2016.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    private Context context;

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return CoolFragment.newInstance();
            case 1:
                return LuckyFragment.newInstance();
            case 2:
                return MatchFragment.newInstance();
            default:
                return CoolFragment.newInstance();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return context.getString(R.string.coolstring);
            case 1:
                return context.getString(R.string.luckystring);
            case 2:
                return context.getString(R.string.matchstring);
            default:
                return context.getString(R.string.app_name);
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
