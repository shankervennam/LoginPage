package com.example.cr.loginpage.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionPagerAdapter extends FragmentPagerAdapter
{
    private final List<Fragment> fragments = new ArrayList<>();
    private final List<String> fragmentName = new ArrayList<>();

    public void addFragment(Fragment fragment, String title)
    {
        fragments.add(fragment);
        fragmentName.add(title);
    }

    public SectionPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return fragmentName.get(position);
    }

    @Override
    public Fragment getItem(int position)
    {
        return fragments.get(position);
    }

    @Override
    public int getCount()
    {
        return fragments.size();
    }
}
