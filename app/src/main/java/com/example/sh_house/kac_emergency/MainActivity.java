package com.example.sh_house.kac_emergency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView)findViewById(R.id.main);

        iv.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub

                Intent intent = new Intent(MainActivity.this,GVCalendarActivity.class);  //Connect.java가 있어야한다. (액티비티)
                startActivity(intent);


            }
        });
    }
}
