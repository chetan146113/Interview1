package com.example.chetan.interview;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout li=(LinearLayout)findViewById(R.id.fronttitle);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.fronttitle);

        TextView tfront=(TextView)findViewById(R.id.textfront);
        tfront.setText("Android Interview");

        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.button1:
                startActivity(new Intent(MainActivity.this,simplequestion.class));
                break;
            case R.id.button2:
                       Intent i1=new Intent(MainActivity.this,toughquestion.class);
                        startActivity(i1);
                break;
            case R.id.button3:
                try {
                    Uri uri1 = Uri.parse("market://details?id=" + getPackageName());
                    Intent rate = new Intent(Intent.ACTION_VIEW, uri1);
                    startActivity(rate);
                }
                catch (ActivityNotFoundException e)
                {
                    Uri uri1 = Uri.parse("http://play.google.com/store/app/details?id=" + getPackageName());
                    Intent rate = new Intent(Intent.ACTION_VIEW, uri1);
                    startActivity(rate);
                }
                    break;
            case R.id.button4:
                try {
                    Uri uri1 = Uri.parse("market://search?q=gameloft");
                    Intent rate = new Intent(Intent.ACTION_VIEW, uri1);
                    startActivity(rate);
                }
                catch (ActivityNotFoundException e)
                {
                    Uri uri1 = Uri.parse("http://play.google.com/store/app/search?q=gameloft");
                    Intent rate = new Intent(Intent.ACTION_VIEW, uri1);
                    startActivity(rate);
                }

                break;
        }
    }
}
