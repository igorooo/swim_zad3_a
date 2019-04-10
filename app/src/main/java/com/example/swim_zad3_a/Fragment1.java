package com.example.swim_zad3_a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;






public class Fragment1 extends Fragment {

    AppCompatActivity A1;
    OnWyborOpcjiListener sluchaczF1;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try{
            A1 = (AppCompatActivity) context;
            sluchaczF1 = (OnWyborOpcjiListener) context;
        }
        catch (ClassCastException e){
            throw new ClassCastException(A1.toString() + "musi implementowac OnWyborOpcjiListener");
        }
    }

    public Fragment1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }


}
