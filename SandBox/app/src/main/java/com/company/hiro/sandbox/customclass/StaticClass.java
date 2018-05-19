package com.company.hiro.sandbox.customclass;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.company.hiro.sandbox.R;

public class StaticClass {

    // Adiciona o fragment no centro da tela
    public static void replaceFragment(FragmentActivity fragmentActivity, Fragment frag) {
        fragmentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.container,frag, "TAG").commit();
    }

    public static void toast(Context context, String frase, boolean tempoLong){
<<<<<<< HEAD:SandBox/app/src/main/java/com/company/hiro/sandbox/StaticClass.java
        //Toast.makeText(context,frase, tempoLong).show();
=======
        Toast.makeText(context,frase, tempoLong?Toast.LENGTH_LONG:Toast.LENGTH_SHORT).show();
>>>>>>> 62a2f0a78491396bd0a518abbd3177070f6777a2:SandBox/app/src/main/java/com/company/hiro/sandbox/customclass/StaticClass.java
    }

}
