package com.company.hiro.sandbox;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.company.hiro.sandbox.customclass.StaticClass;
import com.company.hiro.sandbox.fragment.GridViewFragment;

import livroandroid.lib.activity.BaseActivity;
import livroandroid.lib.utils.NavDrawerUtil;

public class MainActivity extends BaseActivity {

    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StaticClass.replaceFragment(this, new GridViewFragment());
        setupNavDrawer();
    }
    void setupNavDrawer() {
        // Drawer Layout
        final ActionBar actionBar = getSupportActionBar();
        // Ícone do menu do nav drawer
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        actionBar.setDisplayHomeAsUpEnabled(true);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null && drawerLayout != null) {
            // Atualiza a imagem e textos do header
            NavDrawerUtil.setHeaderValues(navigationView, R.id.containerNavDrawerListViewHeader, R.drawable.nav_drawer_header, R.drawable.ic_logo_user, R.string.nav_drawer_username, R.string.nav_drawer_email);
            // Trata o evento de clique no menu.
            navigationView.setNavigationItemSelectedListener(
                    new NavigationView.OnNavigationItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(MenuItem menuItem) {
                            // Seleciona a linha
                            menuItem.setChecked(true);
                            // Fecha o menu
                            drawerLayout.closeDrawers();
                            // Trata o evento do menu
                            onNavDrawerItemSelected(menuItem);
                            return true;
                        }
                    });
        }
    }
    // Trata o evento do menu lateral
    private void onNavDrawerItemSelected(MenuItem menuItem) {
        Toast.makeText(this, "Teste", Toast.LENGTH_LONG).show();
        switch (menuItem.getItemId()) {
            case R.id.nav_item_carros_todos:
                StaticClass.toast(this, "Todos", true);
                break;
            case R.id.nav_item_carros_classicos:
                StaticClass.toast(this, "classicos", true);
                break;
            case R.id.nav_item_carros_esportivos:
                StaticClass.toast(this, "esportivos", true);
                break;
            case R.id.nav_item_carros_luxo:
                StaticClass.toast(this, "luxo", true);
                break;
            case R.id.nav_item_site_livro:
                StaticClass.toast(this, "livro", true);
                break;
            case R.id.nav_item_settings:
                StaticClass.toast(this, "setings", true);
                break;
        }
    }


    private boolean openedDrawer = false;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // Trata o clique no botão que abre o menu.
            openCloseDrawer();
        }
        return super.onOptionsItemSelected(item);
    }

    protected void openCloseDrawer() {
        if (drawerLayout != null) {
            if(openedDrawer){
                openedDrawer = false;
                drawerLayout.closeDrawer(GravityCompat.START);
            }else{
                openedDrawer = true;
                drawerLayout.openDrawer(GravityCompat.START);
            }
        }
    }
}
