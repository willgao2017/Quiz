package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int addresult = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int test001 = 1;
    }

    public void submitAnswer(View view) {

        int score = 0;

        EditText answer1 = (EditText) findViewById(R.id.answer_1);
        Editable answer1Editable = answer1.getText();
        String a1 = answer1Editable.toString();

        if (a1.equals("x")) {
            score += 10;
        }

        if (addresult==2){
            score += 10;
        }

        Toast.makeText(this, "Score: " + score, Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.addresult_1:
                if (checked)
                    // Pirates are the best
                    addresult = 1;
                break;
            case R.id.addresult_2:
                if (checked)
                    // Ninjas rule
                    addresult = 2;
                break;
            case R.id.addresult_3:
                if (checked)
                    //
                    addresult = 3;
                break;
        }
    }
}