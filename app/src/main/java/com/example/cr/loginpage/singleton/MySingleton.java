package com.example.cr.loginpage.singleton;


import java.io.Serializable;

public class MySingleton
{
    private static MySingleton instance;

    private String user_name;

    private MySingleton(){}

    public static MySingleton getInstance()
    {
        if(instance == null)
        {
            instance =  new MySingleton();
        }

        return instance;
    }

    public String getUser_name()
    {
        return user_name;
    }

    public void setUser_name(String user_name)
    {
        this.user_name = user_name;
    }
}
