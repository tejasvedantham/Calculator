package com.example.tejas.calculator;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView mainView = null;
    private ArrayList<Integer> array = new ArrayList<Integer>();
    private Button one, two, three, four, five, six, seven, eight, nine, zero;
    private Button add, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        createButtons();

        mainView = (TextView) findViewById(R.id.mainView);
        mainView.setText("");

    }

    public void addText(View v, int n) {

        String num1 = Integer.toString(n);
        mainView.append(num1);
    }

    public void addNum(View v) {
        if (v.getId() == R.id.one) {
            mainView.clearComposingText();
            mainView.append(one.getText());
        }
        else if (v.getId() == R.id.two) {
            mainView.clearComposingText();
            mainView.append(two.getText());
        }
        else if (v.getId() == R.id.three) {
            mainView.clearComposingText();
            mainView.append(three.getText());
        }
        else if (v.getId() == R.id.four) {
            mainView.clearComposingText();
            mainView.append(four.getText());
        }
        else if (v.getId() == R.id.five) {
            mainView.clearComposingText();
            mainView.append(five.getText());
        }
        else if (v.getId() == R.id.six) {
            mainView.clearComposingText();
            mainView.append(six.getText());
        }
        else if (v.getId() == R.id.seven) {
            mainView.clearComposingText();
            mainView.append(seven.getText());
        }
        else if (v.getId() == R.id.eight) {
            mainView.clearComposingText();
            mainView.append(eight.getText());
        }
        else if (v.getId() == R.id.nine) {
            mainView.clearComposingText();
            mainView.append(nine.getText());
        }
        else if (v.getId() == R.id.zero) {
            mainView.clearComposingText();
            mainView.append(zero.getText());
        }
        else if (v.getId() == R.id.add) {
            if (!(mainView.getText().equals(""))) {
                mainView.clearComposingText();
                mainView.append(add.getText());
            }
        }
        else if (v.getId() == R.id.subtract) {
            if (!(mainView.getText().equals(""))) {

                mainView.clearComposingText();
                mainView.append(subtract.getText());
            }
        }
        else if (v.getId() == R.id.multiply) {
            if (!(mainView.getText().equals(""))) {

                mainView.clearComposingText();
                mainView.append(multiply.getText());
            }
        }
        else if (v.getId() == R.id.divide) {
            if (!(mainView.getText().equals(""))) {

                mainView.clearComposingText();
                mainView.append(divide.getText());
            }
        }

    }

    public void createButtons() {
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        zero = (Button)findViewById(R.id.zero);

        add = (Button)findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);

    }
}
