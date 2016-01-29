package com.example.prolan.timeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private TextView textView , textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
      //  EditText dataFromAct = (EditText) findViewById(R.id.textView);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.time);
        textView2 = (TextView) findViewById(R.id.time2);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());


        String strCurrentDate = "Wed, 18 Apr 2012 07:55:29 +0000";
        SimpleDateFormat format = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss Z");
        Date newDate = null;
        try {
            newDate = format.parse(strCurrentDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        format = new SimpleDateFormat("MMM dd,yyyy hh:mm a");
        String date = format.format(newDate);
        textView.setText("Native format:"+currentDateTimeString);
        textView2.setText("Custom format:"+date);
        Log.d("PRAD_log","current:"+currentDateTimeString+"_Custom:"+date);
    }
}
