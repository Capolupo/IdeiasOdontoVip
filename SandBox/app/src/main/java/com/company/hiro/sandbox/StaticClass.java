package com.company.hiro.sandbox;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

public class StaticClass {

    // Adiciona o fragment no centro da tela
    public static void replaceFragment(FragmentActivity fragmentActivity, Fragment frag) {
        fragmentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.container,frag, "TAG").commit();
    }

    public static void toast(Context context, String frase, int tempo){
        Toast.makeText(context,frase, tempo).show();
    }

}
