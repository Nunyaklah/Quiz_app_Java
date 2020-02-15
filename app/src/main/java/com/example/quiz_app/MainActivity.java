package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    // Variables holding results

    String correctAnswerChosen = " right";
    String wrongAnswerChosen = " wrong";


    int scores = 0;





    // Check answer for question one
    public void checkAnswersOne(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.questionOneA:
            case R.id.questionOneC:
                if (checked)
                        resultOne(wrongAnswerChosen);
                    break;
            case R.id.questionOneB:
                if (checked)
                    resultOne(correctAnswerChosen);
                    scores = scores +1;
                    break;

        }
    }

    // Check answer for question two
    public void checkAnswersTwo(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.questionTwoB:
            case R.id.questionTwoC:
                if (checked)
                    resultTwo(wrongAnswerChosen);
                break;
            case R.id.questionTwoA:
                if (checked)
                    resultTwo(correctAnswerChosen);
                    scores = scores +1;
                break;

        }
    }

    // Check answer for question three
    public void checkAnswersThree(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.questionThreeA:
            case R.id.questionThreeB:
                if (checked)
                    resultThree(wrongAnswerChosen);
                break;
            case R.id.questionThreeC:
                if (checked)
                    resultThree(correctAnswerChosen);
                    scores = scores +1;
                break;

        }
    }

    // Check answer for question four
    public void checkAnswersFour(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.questionFourB:
            case R.id.questionFiveC:
                if (checked)
                    resultFour(wrongAnswerChosen);
                break;
            case R.id.questionFourA:
                if (checked)
                    resultFour(correctAnswerChosen);
                    scores = scores +1;

                break;

        }
    }

    // Check answer for question five
    public void checkAnswersFive(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.questionFiveA:
            case R.id.questionFiveC:
                if (checked)
                    resultFive(wrongAnswerChosen);
                break;
            case R.id.questionFiveB:
                if (checked)
                    resultFive(correctAnswerChosen);
                    scores = scores +1;
                break;

        }
    }

    // Check answer for question six
    public void checkAnswersSix(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.questionSixB:
            case R.id.questionSixC:
                if (checked)
                    resultSix(wrongAnswerChosen);
                break;
            case R.id.questionSixA:
                if (checked)
                    resultSix(correctAnswerChosen);
                    scores = scores +1;
                break;

        }
    }



    /**
     * Displays the results for question 1.
     */
    public void resultOne(String result) {
        TextView scoreView = findViewById(R.id.resultOne);
        scoreView.setText("Your answer to question 1 is " + result);
    }

    /**
     * Displays the results for question 2.
     */
    public void resultTwo(String result) {
        TextView scoreView = findViewById(R.id.resultTwo);
        scoreView.setText("Your answer to question 2 is " + result);
    }

    /**
     * Displays the results for question 3.
     */
    public void resultThree(String result) {
        TextView scoreView = findViewById(R.id.resultThree);
        scoreView.setText("Your answer to question three is " + result);
    }

    /**
     * Displays the results for question 4.
     */
    public void resultFour(String result) {
        TextView scoreView = findViewById(R.id.resultFour);
        scoreView.setText("Your answer to question 4 is " + result);
    }

    /**
     * Displays the results for question 5.
     */
    public void resultFive(String result) {
        TextView scoreView = findViewById(R.id.resultFive);
        scoreView.setText("Your answer to question 5 is "+result);
    }

    /**
     * Displays the results for question 6.
     */
    public void resultSix(String result) {
        TextView scoreView = findViewById(R.id.resultSix);
        scoreView.setText("Your answer to question 6 is "+result);
    }


    //Display toast on submit

    public void Submit(View view) {

        Context context = getApplicationContext();
        CharSequence text = "Your score is "+ scores + " out of 6";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}