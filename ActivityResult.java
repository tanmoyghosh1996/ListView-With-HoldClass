package com.example.tanmoy.listviewholdclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tv = (TextView)findViewById(R.id.tv);
        String result=getIntent().getExtras().getString("name");
        tv.setText(result);
    }
}
