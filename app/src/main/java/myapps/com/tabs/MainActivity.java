package myapps.com.tabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.StringDef;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

Button simpleTabs_Btn,scrollableTabs_Btn,OnlyIconTextTabs_Btn,IconTextTabs_Btn,CustomIconTextTabs_Btn;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        simpleTabs_Btn = (Button) findViewById(R.id.simpleTabs_Btn);
        scrollableTabs_Btn =  (Button) findViewById(R.id.scrollableTabs_Btn);
        IconTextTabs_Btn = (Button) findViewById(R.id.IconTextTabs_Btn);
        OnlyIconTextTabs_Btn = (Button) findViewById(R.id.OnlyIconTextTabs_Btn);
        CustomIconTextTabs_Btn = (Button) findViewById(R.id.CustomIconTextTabs_Btn);


        simpleTabs_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Simple_Tabs.class));
            }
        });


        scrollableTabs_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Scrollable_Tabs.class));
            }
        });

        IconTextTabs_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Icon_Text_Tabs.class));
            }
        });

        OnlyIconTextTabs_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Only_Icons.class));
            }
        });

        CustomIconTextTabs_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Custom_Tabs.class));
            }
        });

    }
}