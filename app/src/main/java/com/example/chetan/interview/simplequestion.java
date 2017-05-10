package com.example.chetan.interview;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.chetan.interview.R.layout.questions;

/**
 * Created by chetan on 1/8/2017.
 */

public class simplequestion extends ActionBarActivity implements View.OnClickListener{

    Button bleft,banswer,bright;
    TextView t1,t2,t3,t4;
    int index;
    String questions[],answers[];
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);

        LinearLayout li=(LinearLayout)findViewById(R.id.questiontitlebar);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.questiontitlebar);

          TextView tquestion=(TextView)findViewById(R.id.textquestion);
           tquestion.setText("Simple Question");

       index=0;
        bleft=(Button)findViewById(R.id.buttonleft);
        banswer=(Button)findViewById(R.id.buttonanswer);
        bright=(Button)findViewById(R.id.buttonright);


        t1=(TextView)findViewById(R.id.textView1);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        t4=(TextView)findViewById(R.id.textView4);

        bleft.setOnClickListener(this);
        bright.setOnClickListener(this);
        banswer.setOnClickListener(this);


        questions=getResources().getStringArray(R.array.easy_questions);
        answers=getResources().getStringArray(R.array.easy_answers);
        t1.setText(String.valueOf(index+1));
        t2.setText("/"+String.valueOf(questions.length));
        t3.setText(questions[index]);
        t4.setText("Press A for Answer");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {

            case R.id.buttonleft:
                t4.setText("Press A for Answer");
                 index=index-1;
                   if(index==-1)
                    {
                      index=questions.length-1;
                    }
                t3.setText(questions[index]);
                t1.setText(String.valueOf(index+1));

                break;

            case R.id.buttonanswer:

                t4.setText(answers[index]);
                break;

            case R.id.buttonright:
                t4.setText("Press A for Answer");
                index=index+1;
                if(index==questions.length)
                {

                    index=0;
                }

                t1.setText(String.valueOf(index+1));
                t3.setText(questions[index]);
        }

    }
}
