package cl.enexo.shrinkquizz.views;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import cl.enexo.shrinkquizz.R;
import cl.enexo.shrinkquizz.adapters.PagerAdapter;

/**
 * Created by Kevin on 21-10-2016.
 */
public class MainActivity extends AppCompatActivity{
    private PagerAdapter pageadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        pageadapter = new PagerAdapter(getSupportFragmentManager(),this);
        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(pageadapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
