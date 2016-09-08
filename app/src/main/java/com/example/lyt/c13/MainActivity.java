package com.example.lyt.c13;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  if(this.getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            Log.i("info", "landscape"); // 横屏
        }  else if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT)
        {
            Log.i("info", "portrait"); // 竖屏
        }*/
    }
}
