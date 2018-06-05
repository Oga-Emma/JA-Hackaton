package org.ja_nigeria.janigeria.features.surveys;

import android.os.Build;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.SurveyQuestionsFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SurveyActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = SurveyActivity.class.getSimpleName();

    ViewPager viewPager;
    TextView currentFragmentName;
    Button nextButton, prevButton;

    SeekBar seekBar;
    int seekbarMax = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle("Survey");

        nextButton = findViewById(R.id.next_button);
        prevButton = findViewById(R.id.prev_button);

        nextButton.setOnClickListener(this);
        prevButton.setOnClickListener(this);

        findViewById(R.id.prev_button).setOnClickListener(this);
        prevButton.setVisibility(View.INVISIBLE);

        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new sectionAdapter(getSupportFragmentManager()));
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.next_button){

            int currentItem = viewPager.getCurrentItem();
            if(currentItem < viewPager.getAdapter().getCount()) {
                viewPager.setCurrentItem(++currentItem);
                if(prevButton.getVisibility() != View.VISIBLE) prevButton.setVisibility(View.VISIBLE);
            }
//            else
//                Toast.makeText(ClerkingActivity.this, "This is the last page", Toast.LENGTH_SHORT).show();

        }else{
            int currentItem = viewPager.getCurrentItem();
            if(currentItem > 0) {
                viewPager.setCurrentItem(--currentItem);
                if(nextButton.getVisibility() != View.VISIBLE) nextButton.setVisibility(View.VISIBLE);
            }
            else
                prevButton.setVisibility(View.INVISIBLE);
//                Toast.makeText(ClerkingActivity.this, "This is the first page", Toast.LENGTH_SHORT).show();

        }
    }


    public class sectionAdapter extends FragmentStatePagerAdapter {


        public sectionAdapter(FragmentManager fm) {
            super(fm);

        }

        @Override
        public Fragment getItem(int position) {
          /*  if(position > 1)
                currentFragmentName.setText(fragmentNamesList.get(position - 1));
            else{
            }*/
            return SurveyQuestionsFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            return 10;
        }
    }
}
