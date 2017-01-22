package com.example.kiit.barcodescanner;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by kiit on 20-12-2016.
 */
public class MainActivity3 extends AppCompatActivity {
    TextView textView;
    String num;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain3);
        textView=(TextView)findViewById(R.id.textView1);
        num=getIntent().getExtras().getString("VALUE");
        textView.setText("Contents:// "+num);


    }
}
