package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int addresult = 0;
    int compareresult;
    int giftscore = 0;

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.addresult_1:
                if (checked)
                    addresult = 1;
                break;
            case R.id.addresult_2:
                if (checked)
                    addresult = 2;
                break;
            case R.id.addresult_3:
                if (checked)
                    addresult = 3;
                break;
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        compareresult = 1;

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.compare_1:
                if (checked)
                    compareresult *= 1;
                else
                    compareresult *= 0;
                break;
            case R.id.compare_2:
                if (checked)
                    compareresult *= 1;
                else
                    compareresult *= 0;
                break;
            case R.id.compare_3:
                if (checked)
                    compareresult *= 0;
                else
                    compareresult *= 1;
                break;
        }
    }

    public void onCheckboxClicked2(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        if (checked)
            giftscore = 25;

    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {

        int score = 0;

        EditText answer1 = (EditText) findViewById(R.id.answer_1);
        Editable answer1Editable = answer1.getText();
        String a1 = answer1Editable.toString();

        if (a1.equals("x")) {
            score += 25;
        }

        if (addresult == 2) {
            score += 25;
        }

        if (compareresult == 1) {
            score += 25;
        }

        score += giftscore;

        Toast.makeText(this, "Score: " + score, Toast.LENGTH_SHORT).show();
    }
}