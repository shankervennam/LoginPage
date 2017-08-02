package com.example.cr.loginpage.singleton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.cr.loginpage.R;

public class WelcomeActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView textView = (TextView) findViewById(R.id.text_welcome);

        textView.setText(MySingleton.getInstance().getUser_name());
    }
}
