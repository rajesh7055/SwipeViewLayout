package com.example.buttomnavigation;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class JobSeekerDashBoard extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_seeker_dash_board);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        loadfragment(new Fragment_AllJobs());

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment=null;
        switch (menuItem.getItemId())
        {
            case R.id.navigation_home:
            {
                fragment=new Fragment_AllJobs();
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
            }
            case R.id.navigation_dashboard:
            {
               fragment=new Fragment_AllJobs();
                Toast.makeText(this, "DashBoard", Toast.LENGTH_SHORT).show();
            }
            case R.id.navigation_notifications:
            {
                 fragment=new Fragment_AllJobs();
                Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
            }
            case R.id.navigation_status:
            {
                fragment=new Fragment_AllJobs();
                Toast.makeText(this, "Status", Toast.LENGTH_SHORT).show();
            }
        }
        return loadfragment(fragment);
    }
    private boolean loadfragment(Fragment fragment)
    {
       if(fragment!=null)
       {
           getSupportFragmentManager().beginTransaction()
                   .replace(R.id.frame_layout,fragment).commit();
       }
       return true;
    }
}
