package com.example.user.joe120904;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //按click1 讓linearlayout變成 FragmentA
    public void click1(View v)
    {
        android.app.FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.linearLayout1, new FragmentA(), "f_a");
        ft.commit();
    }
    //按click2 讓linearlayout變成 FragmentB
    public void click2(View v)
    {
        android.app.FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.linearLayout1, new FragmentB(), "f_b");
        ft.commit();
    }
}
