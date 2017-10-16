package com.samarthgupta.sfa_app.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.samarthgupta.sfa_app.Activities.New.ClientDetailsActivity;
import com.samarthgupta.sfa_app.Activities.New.TasksActivity;
import com.samarthgupta.sfa_app.R;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    RecyclerView rvTasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.e("Data", getSharedPreferences("Login", Context.MODE_PRIVATE).getString("Data", null));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ClientDetailsActivity.class));
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


//        Retrofit.Builder builder = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).
//                baseUrl("http://ec2-13-126-93-101.ap-south-1.compute.amazonaws.com/");
//        Retrofit retrofit = builder.build();
//        DataInterface client = retrofit.create(DataInterface.class);
//
//        Call<String> call = client.getLol(new Lol("Sam", 12));
//        call.enqueue(new Callback<String>() {
//            @Override
//            public void onResponse(Call<String> call, Response<String> response) {
//                Log.d("Json", "R " + response.body());
//            }
//
//            @Override
//            public void onFailure(Call<String> call, Throwable t) {
//                Log.d("Json", "E " + t.toString());
//            }
//        });


//        call.enqueue(new Callback<Lol>() {
//            @Override
//            public void onResponse(Call<Lol> call, retrofit2.Response<Lol> response) {
//                Log.d("Json", "R " + response.body());
//            }
//
//            @Override
//            public void onFailure(Call<Lol> call, Throwable t) {
//                Log.d("Json", "E " + t.toString());
//            }
//        });


    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_logout) {

            getSharedPreferences("Login", Context.MODE_PRIVATE).edit().remove("Data").apply();
            startActivity(new Intent(HomeActivity.this, SignInActivity.class));
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_create_wt) {
            startActivity(new Intent(HomeActivity.this, ClientDetailsActivity.class));
        } else if (id == R.id.nav_tasks) {
            startActivity(new Intent(HomeActivity.this, TasksActivity.class));
        } else if (id == R.id.nav_update_progress) {

        } else if (id == R.id.nav_report_issue) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
