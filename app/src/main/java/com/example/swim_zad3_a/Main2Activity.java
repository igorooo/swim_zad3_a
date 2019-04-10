package com.example.swim_zad3_a;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    Fragment f11, f12;
    FragmentTransaction transakcja;
    ActionBar AB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        f11 = new Fragment11();
        f12 = new Fragment12();
        transakcja = getSupportFragmentManager().beginTransaction();
        transakcja.add(R.id.FL1, f11);
        transakcja.detach(f11);
        transakcja.add(R.id.FL1,f12);
        transakcja.detach(f12);
        transakcja.commit();

        AB = getSupportActionBar();
        AB.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);


    }
}
