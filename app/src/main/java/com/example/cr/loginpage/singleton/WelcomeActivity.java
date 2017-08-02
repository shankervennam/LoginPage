package com.example.cr.loginpage.singleton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.cr.loginpage.R;
import com.example.cr.loginpage.fragment.Fragment1;
import com.example.cr.loginpage.fragment.Fragment2;
import com.example.cr.loginpage.fragment.Fragment3;
import com.example.cr.loginpage.fragment.SectionPagerAdapter;

public class WelcomeActivity extends AppCompatActivity
{
    private ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView textView = (TextView) findViewById(R.id.text_welcome);

        textView.setText("Welcome:"+ MySingleton.getInstance().getUser_name());

        viewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager)
    {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(), "DEPOSIT");
        adapter.addFragment(new Fragment2(), "PROFILE");
        adapter.addFragment(new Fragment3(), "PAYMENT");
        viewPager.setAdapter(adapter);
    }
}
