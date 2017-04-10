package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.android.quizapp.R;

public class MainActivity extends AppCompatActivity {

    public static final String DEFINING_THINGS = "valid";
    private RadioGroup mQuestion1, mQuestion2, mQuestion3, mQuestion4, mQuestion5, mQuestion6,
            mQuestion7, mQuestion8;
    private EditText customerOneWordForDayText;
    private EditText customerNameEditText;
    private CheckBox mQuestion9a;
    private CheckBox mQuestion9b;
    private CheckBox mQuestion9c;
    private CheckBox mQuestion9d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
    }

    private void setupView() {
        final Button submitButton = (Button) findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitButtonPressed();
            }
        });
       //RadioButtons
        mQuestion1 = (RadioGroup) findViewById(R.id.answer_to_question_1);
        mQuestion2 = (RadioGroup) findViewById(R.id.answer_to_question_2);
        mQuestion3 = (RadioGroup) findViewById(R.id.answer_to_question_3);
        mQuestion4 = (RadioGroup) findViewById(R.id.answer_to_question_4);
        mQuestion5 = (RadioGroup) findViewById(R.id.answer_to_question_5);
        mQuestion6 = (RadioGroup) findViewById(R.id.answer_to_question_6);
        mQuestion7 = (RadioGroup) findViewById(R.id.answer_to_question_7);
        mQuestion8 = (RadioGroup) findViewById(R.id.answer_to_question_8);
       //CheckBoxes
        mQuestion9a = (CheckBox) findViewById(R.id.answer_9a);
        mQuestion9b = (CheckBox) findViewById(R.id.answer_9b);
        mQuestion9c = (CheckBox) findViewById(R.id.answer_9c);
        mQuestion9d = (CheckBox) findViewById(R.id.answer_9d);
       //TextBoxes
        customerOneWordForDayText = (EditText) findViewById(R.id.answer_10);
        customerNameEditText = (EditText) findViewById(R.id.answer_11);
    }

    //-----------------------------------------------------------------//
    private void submitButtonPressed() {
        int mResult = 0;

        // Answering the with the D.

        if (mQuestion1.getCheckedRadioButtonId() == R.id.answer_1d) {
            mResult += 10;
        } else if (mQuestion1.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion2.getCheckedRadioButtonId() == R.id.answer_2d) {
            mResult += 10;
        } else if (mQuestion2.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }

        // Answering with the C.

        if (mQuestion1.getCheckedRadioButtonId() == R.id.answer_1c) {
            mResult += 7;
        } else if (mQuestion1.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion2.getCheckedRadioButtonId() == R.id.answer_2c) {
            mResult += 7;
        } else if (mQuestion2.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion3.getCheckedRadioButtonId() == R.id.answer_3c) {
            mResult += 7;
        } else if (mQuestion3.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion4.getCheckedRadioButtonId() == R.id.answer_4c) {
            mResult += 7;
        } else if (mQuestion4.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion5.getCheckedRadioButtonId() == R.id.answer_5c) {
            mResult += 7;
        } else if (mQuestion5.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion6.getCheckedRadioButtonId() == R.id.answer_6c) {
            mResult += 7;
        } else if (mQuestion6.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion7.getCheckedRadioButtonId() == R.id.answer_7c) {
            mResult += 7;
        } else if (mQuestion7.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion8.getCheckedRadioButtonId() == R.id.answer_8c) {
            mResult += 7;
        } else if (mQuestion8.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }

        //Answering with the B.

        if (mQuestion1.getCheckedRadioButtonId() == R.id.answer_1b) {
            mResult += 5;
        } else if (mQuestion1.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion2.getCheckedRadioButtonId() == R.id.answer_2b) {
            mResult += 5;
        } else if (mQuestion2.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion3.getCheckedRadioButtonId() == R.id.answer_3b) {
            mResult += 5;
        } else if (mQuestion3.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion4.getCheckedRadioButtonId() == R.id.answer_4b) {
            mResult += 5;
        } else if (mQuestion4.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion5.getCheckedRadioButtonId() == R.id.answer_5b) {
            mResult += 5;
        } else if (mQuestion5.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion6.getCheckedRadioButtonId() == R.id.answer_6b) {
            mResult += 5;
        } else if (mQuestion6.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion7.getCheckedRadioButtonId() == R.id.answer_7b) {
            mResult += 5;
        } else if (mQuestion7.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion8.getCheckedRadioButtonId() == R.id.answer_8b) {
            mResult += 5;
        } else if (mQuestion8.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }

        //Answering with the A.

        if (mQuestion1.getCheckedRadioButtonId() == R.id.answer_1a) {
            mResult += 3;
        } else if (mQuestion1.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion2.getCheckedRadioButtonId() == R.id.answer_2a) {
            mResult += 3;
        } else if (mQuestion2.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion3.getCheckedRadioButtonId() == R.id.answer_3a) {
            mResult += 3;
        } else if (mQuestion3.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion4.getCheckedRadioButtonId() == R.id.answer_4a) {
            mResult += 3;
        } else if (mQuestion4.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion5.getCheckedRadioButtonId() == R.id.answer_5a) {
            mResult += 3;
        } else if (mQuestion5.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion6.getCheckedRadioButtonId() == R.id.answer_6a) {
            mResult += 3;
        } else if (mQuestion6.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion7.getCheckedRadioButtonId() == R.id.answer_7a) {
            mResult += 3;
        } else if (mQuestion7.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }
        if (mQuestion8.getCheckedRadioButtonId() == R.id.answer_8a) {
            mResult += 3;
        } else if (mQuestion8.getCheckedRadioButtonId() == -1) {
            showError();
            return;
        }



        //-----------------------------------------------------------------//




        if (mQuestion9a.isChecked() == false && mQuestion9b.isChecked() == false &&
                mQuestion9c.isChecked() == false && mQuestion9d.isChecked() == false) {
            showError();
            return;
        }

        // For the question 9.

        if (mQuestion9a.isChecked()) {
            mResult -= 3;
        }

        if (mQuestion9b.isChecked()) {
            mResult += 3;
        }
        if (mQuestion9c.isChecked()) {
            mResult += 5;
        }

        if (mQuestion9d.isChecked()) {
            mResult += 10;
        }

        if (customerOneWordForDayText.getText().toString().isEmpty()) {
            showError();
            return;
        }

        if (customerNameEditText.getText().toString().isEmpty()) {
            showError();
            return;
        }


        displayMessage(mResult);
    }

    void displayMessage(int score) {
        String userWord = customerOneWordForDayText.getText().toString();
        String userName = customerNameEditText.getText().toString();
        String message = "Dear " + userName + ",\nYour score for your " + userWord + " day is: " + String.valueOf(score) + " of 80!";
        message += "\n" + quizResultMessage(score);

        new AlertDialog.Builder(this).setMessage(message).show();
    }

    String quizResultMessage(int score) {
        if (score <= 25) {
            return getString(R.string.result_0_25);
        } else if (score > 25 && score <= 50) {
            return getString(R.string.result_25_50);
        } else if (score > 50 && score <= 70) {
            return getString(R.string.result_50_70);
        } else {
            return getString(R.string.result_70_80);
        }
    }

    void showError() {
        // Error Message
        Toast.makeText(this, "Please select answers to all questions. Thank you!", Toast.LENGTH_SHORT).show();
    }
}
