package com.grow_with_google.udacity.zodiacmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score=0;
    RadioGroup rg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    //These onClick events determine the score for radio buttons using a switch

    // question #1
    public void radioq1(View view){

        switch (view.getId()) {
            case R.id.button1:
                if (true) {
                    score += 0;
                }
                break;

            case R.id.button2:
                if(true)
                    score +=8;
                break;

            case R.id.button3:
                if(true)
                    score +=0;
                break;
        }

    }
    // question #3
    public void radioq3(View view) {

        switch (view.getId()) {
            case R.id.three_button1:
                if (true) {
                    score += 0;
                }
                break;

            case R.id.three_button2:
                if (true)
                    score += 0;
                break;

            case R.id.three_button3:
                if (true)
                    score += 8;
                break;
        }


    }
    // question #8
    public void radioq8(View view){

        switch (view.getId()) {
            case R.id.eight_button1:
                if (true) {
                    score += 8;
                }
                break;

            case R.id.eight_button2:
                if(true)
                    score +=0;
                break;

            case R.id.eight_button3:
                if(true)
                    score +=0;
                break;
        }

    }
    // question #12
    public void radioq12(View view) {

        switch (view.getId()) {
            case R.id.twelve_button1:
                if (true) {
                    score += 0;
                }
                break;

            case R.id.twelve_button2:
                if (true)
                    score += 8;
                break;

        }


    }

    //This event checks the checkboxes
    public void elemental(View view) {


        switch (view.getId()) {
            case R.id.watersign1:
                if (true) {
                    score += 4;
                }
                break;

            case R.id.watersign2:
                if (true)
                    score += 3;
                break;

            case R.id.watersign3:
                if (true)
                    score += 3;
                break;

            case R.id.notwatersign:
                if(true)
                    score -= 10;//entire question is wrong if user picks the wrong sign or  all four water signs
                      break;

            case R.id.firesign1:
                if (true)
                    score += 4;
                break;
            case R.id.firesign2:
                if (true)
                    score += 3;
                break;
            case R.id.firesign3:
                if (true)
                    score += 3;
                break;

            case R.id.notfiresign:
                if(true)
                    score -= 10;//entire question is wrong if user picks the wrong sign or  all four water signs
                break;

            case R.id.earthsign1:
                if (true)
                    score +=4;
                break;
            case R.id.earthsign2:
                if (true)
                    score += 3;
                break;
            case R.id.earthsign3:
                if (true)
                    score += 3;
                break;

            case R.id.notearthsign:
                if(true)
                    score -= 10;//entire question is wrong if user picks the wrong sign or  all four water signs
                break;


        }
    }

    public void grade(View view){


    //these if statements check user input


    EditText zodiacNumber = findViewById(R.id.zodiac_number);

   if(zodiacNumber.getEditableText().toString().contains("12"));{ score+=8;}

    EditText waterBearer = findViewById(R.id.water_bearer);

    if(waterBearer.getEditableText().toString().contains("AQUARIUS")){ score+=10;}

    EditText theTwins = findViewById(R.id.the_twins);

    if(theTwins.getEditableText().toString().contains("GEMINI")){ score+=10;}

    EditText theScale = findViewById(R.id.the_scale);

    if(theScale.getEditableText().toString().contains("LIBRA")){ score+=10;}

//ouputs users score

        Toast.makeText
                (this, "You scored "+score+"%", Toast.LENGTH_SHORT).show();

      //this restarts the quiz-found info here...https://stackoverflow.com/questions/15564614/how-to-restart-an-android-application-programmatically

        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);


    }


}
