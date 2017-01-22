package com.example.kiit.barcodescanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by kiit on 20-12-2016.
 */
public class MainActivity2 extends AppCompatActivity {
    EditText firstNumber;
    Button button;
    String num;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        firstNumber = (EditText) findViewById(R.id.editText);
        button=(Button)findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=firstNumber.getText().toString();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("VALUE",num);
                startActivity(intent);

            }
        });
    }
}
