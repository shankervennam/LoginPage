package com.example.cr.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.cr.loginpage.singleton.MySingleton;
import com.example.cr.loginpage.singleton.WelcomeActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.text_button).setOnClickListener(new View.OnClickListener()
        {
            EditText editText = (EditText) findViewById(R.id.text_username);

            @Override
            public void onClick(View v)
            {
                MySingleton.getInstance().setUser_name(editText.getText().toString());

                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
