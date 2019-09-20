package com.sematec.sematecandroidbasicmordadfridays;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TestVideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_video_view);

        VideoView vv = findViewById(R.id.vv);

        vv.setVideoURI(Uri.parse("https://as1.cdn.asset.aparat.com/aparat-video/f59653d625c68b2677d2f0aafc87e8bc16871034-144p__24910.mp4"));

        vv.setMediaController(new MediaController(TestVideoViewActivity.this));
        vv.start();
    }
}
