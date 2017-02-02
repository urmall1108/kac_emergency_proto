package com.example.sh_house.kac_emergency;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

  

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();




            }
        });
        */

        Button ilgun = (Button)findViewById(R.id.ilgun_gunmuza);

        Button gyodae = (Button)findViewById(R.id.gyodae_gunmu);

        Button munza = (Button)findViewById(R.id.munza);

        Button yusun = (Button)findViewById(R.id.yusun);







    }

}
