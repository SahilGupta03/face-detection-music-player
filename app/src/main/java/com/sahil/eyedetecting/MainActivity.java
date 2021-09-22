package com.sahil.eyedetecting;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {

    private LookAtMe lookAtMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        lookAtMe = findViewById(R.id.lookme);

        lookAtMe.init(this);
        lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.clip));
        // lookAtMe.setVideoPath("https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1280_10MG.mp4"); to use video from a url

        lookAtMe.start();
        lookAtMe.setLookMe();
    }
}