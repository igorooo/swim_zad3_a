package com.example.swim_zad3_a;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Fragment1.OnWyborOpcjiListener {

    Fragment f11, f12;
    FragmentTransaction transakcja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f11 = new Fragment11();
        f12 = new Fragment12();
        transakcja = getSupportFragmentManager().beginTransaction();
        transakcja.add(R.id.FL1, f11);
        transakcja.detach(f11);
        transakcja.add(R.id.FL1,f12);
        transakcja.detach(f12);
        transakcja.commit();

    }

    @Override
    public void OnWyborOpcji(int Opcja) {
        FragmentTransaction transakcja = getSupportFragmentManager().beginTransaction();

        switch (Opcja){
            case 1:
                transakcja.detach(f12);
                transakcja.attach(f11);
                transakcja.commit();

                return;
            case 2:
                transakcja.detach(f11);
                transakcja.attach(f12);
                transakcja.commit();
                return;
        }

    }
}
