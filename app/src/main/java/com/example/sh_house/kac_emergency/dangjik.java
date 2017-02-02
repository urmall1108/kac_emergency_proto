package com.example.sh_house.kac_emergency;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.text.SimpleDateFormat;
import java.util.Date;


public class dangjik extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangjik);

        String date_str = getIntent().getStringExtra("key");
        String mon_str = getIntent().getStringExtra("key_mon");

        String date_in = mon_str + " ." + date_str;

        TextView date = (TextView) findViewById(R.id.date);
        TextView juya = (TextView) findViewById(R.id.juya);
        Button g_call = (Button) findViewById(R.id.gunmuja_call);
        Button g_mun = (Button) findViewById(R.id.gunmuja_munja);


        date.setText(date_in);

        long now = System.currentTimeMillis();


        SimpleDateFormat sdfNow = new SimpleDateFormat("HH");
        String time = sdfNow.format(new Date(System.currentTimeMillis()));

        int r_time = Integer.parseInt(time);

        if(r_time > 9 && r_time < 18)
           juya.setText("주간");
        else
           juya.setText("야간");

        g_call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-6404-1642"));

                startActivity(intent);
                                      }
                                  }
        );


        g_mun.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View v) {
                                         Intent intent = new Intent("android.intent.action.MAIN");
                                         intent.addCategory("android.intent.category.DEFAULT");
                                         intent.setType("vnd.android-dir/mms-sms");
                                     }
                                 }
        );


        String[] str = {
                    "지원총괄팀",
                    "항행전자팀",
                    "항행통신팀",
                    "시스템정보팀",
                    "양주표지소",
                    "강원표지소",
                    "안양표지소",
                    "예천표지소",
                    "대구표지소",
                    "포항표지소",
                    "부산표지소",
                    "제주표지소",
                    "부안표지소",
                    "송탄표지소"
        } ;

        String[] str_gun = {
                "권대일",
                "김동휘",
                "김학훈",
                "이상헌",
                "지광수",
                "최한결",
                "이규범",
                "한지원",
                "김현식",
                "송승아",
                "박민지",
                "임바다",
                "김수헌",
                "이수호"
        } ;



        RelativeLayout topLL;
        topLL = (RelativeLayout)findViewById(R.id.dynamicArea);

        LinearLayout btLL;
        btLL = (LinearLayout)findViewById(R.id.buttonArea);

        TextView[] tv = new TextView[14];
        Button[] bt = new Button[14];

        for (int i = 120; i < 680; i += 40) {
            int index = (i - 120) / 40;
            tv[index] = new TextView(dangjik.this);


            tv[index].setId(index+1);
           // tv[index].setHeight(dpToPx(getBaseContext(),40));
           // tv[index].setWidth(dpToPx(getBaseContext(),120));
            RelativeLayout.LayoutParams textparam = new RelativeLayout.LayoutParams
                    (ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT);

            // addRule : RelativeLayout의 align 속성을 설정해 준다.
            // middleButtonParams.addRule(verb, anchor)
            // verb : 적용될 속성
            // anchor : 기준이될 View
            if(index!=0)
             textparam.addRule(RelativeLayout.BELOW,index);
            else
             textparam.addRule(RelativeLayout.ALIGN_PARENT_TOP);


            tv[index].setLayoutParams(textparam);
            //tv[index].setHeight(40);
            //tv[index].setWidth(dpToPx(dangjik.this,10));
            tv[index].setTextSize(dpToPx(dangjik.this,5));

            if(index == 3)
                tv[index].setText(str[index]+"          " +str_gun[index]);
            else
                tv[index].setText(str[index]+"              " +str_gun[index]);
            topLL.addView(tv[index]);




            bt[index] = new Button(dangjik.this);

            bt[index].setId(index+1);
            // tv[index].setHeight(dpToPx(getBaseContext(),40));
            // tv[index].setWidth(dpToPx(getBaseContext(),120));
            LinearLayout.LayoutParams btparam = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

            // addRule : RelativeLayout의 align 속성을 설정해 준다.
            // middleButtonParams.addRule(verb, anchor)
            // verb : 적용될 속성
            // anchor : 기준이될 View


            bt[index].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-6404-1642"));
                            startActivity(intent);
                            }
                    }
            );

            bt[index].setHeight(20);

            btLL.addView(bt[index]);

        }


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("dangjik Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    public int dpToPx(Context context, int dp) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int px = Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return px;
    }
}
