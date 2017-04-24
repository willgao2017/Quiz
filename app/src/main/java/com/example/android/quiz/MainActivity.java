package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

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
            score = 100;
                        return;
        }

        Toast.makeText(this, "Score: " + score, Toast.LENGTH_SHORT).show();

    }
}