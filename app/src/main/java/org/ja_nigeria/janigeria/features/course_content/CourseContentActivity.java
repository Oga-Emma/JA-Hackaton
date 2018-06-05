package org.ja_nigeria.janigeria.features.course_content;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.model.EnrolledCourse;

public class CourseContentActivity extends AppCompatActivity {

    private static final String ENROLLED_COURSE_KEY = "enrolled_course";
    private RecyclerView courseContentRV;

    private EnrolledCourse enrolledCourse;


    public static void startActivity(EnrolledCourse enrolledCourse, 
                                     Context context) {

        Intent intent = new Intent(context, CourseContentActivity.class);
        intent.putExtra(ENROLLED_COURSE_KEY, enrolledCourse);

        context.startActivity(intent);
    }
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_content_activity);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        if(getIntent().getExtras() != null && getIntent().getExtras().containsKey(ENROLLED_COURSE_KEY)){
            enrolledCourse = getIntent().getExtras().getParcelable(ENROLLED_COURSE_KEY);
            getSupportActionBar().setTitle(enrolledCourse.getTitle());



            courseContentRV = findViewById(R.id.course_content_recycler_view);
            courseContentRV.setLayoutManager(new LinearLayoutManager(this));
            courseContentRV.setAdapter(new CourseContentAdapter(enrolledCourse.getModules(), this));

        }else{
            Toast.makeText(this, "an error occured...", Toast.LENGTH_LONG).show();
            finish();
        }

    }

}
