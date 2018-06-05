package org.ja_nigeria.janigeria;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class AuthActivity extends AppCompatActivity implements View.OnClickListener {
    private Button googleSignIn;
    private Button facebookSignIn;
    private Button twitterSignIn;
    private TextView signInTextView;
    private Button signInWithJa;
    private ImageView logo;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setVisibility(View.GONE);
        setSupportActionBar(toolbar);

        googleSignIn = findViewById(R.id.sign_in_with_google_button);
        facebookSignIn = findViewById(R.id.sign_in_with_facebook_button);
        twitterSignIn = findViewById(R.id.sign_in_with_twitter_button);
        logo = findViewById(R.id.logo_view);
        signInTextView = findViewById(R.id.signInTextView);
        signInWithJa = findViewById(R.id.sign_in_with_ja_button);
        googleSignIn.setOnClickListener(this);
        facebookSignIn.setOnClickListener(this);
        twitterSignIn.setOnClickListener(this);
        signInTextView.setOnClickListener(this);
        signInWithJa.setOnClickListener(this);

        animation = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        animation.setDuration(3000);

        logo.setAnimation(animation);

        animation.start();

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.signInTextView) {

            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.sign_in_with_ja_button) {

            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        }
    }

    public void loadProgressDialog() {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Signing in..."); // Setting Message
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner
        progressDialog.show(); // Display Progress Dialog
        progressDialog.setCancelable(false);
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(8000);

                } catch (Exception e) {
                    e.printStackTrace();
                }
                progressDialog.dismiss();
            }
        }).start();

        // progressDialog.dismiss();
    }
}
