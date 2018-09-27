package com.example.gaurav.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String str = "";
    Character op = 'q';
    int i;
    float num, numtemp;
    TextView showresult;
    Button zero, one, two, three, four, five, six, seven, eight, nine, div, multiply, equalls, clear, plus, minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showresult = (TextView) findViewById(R.id.result_id);
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        clear = (Button) findViewById(R.id.clear);
        multiply = (Button) findViewById(R.id.multiply);
        div = (Button) findViewById(R.id.div);
        equalls = (Button) findViewById(R.id.equals);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(1);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(2);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(3);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(4);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(5);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(6);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(7);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(8);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(9);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(0);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perform();
                op = '+';
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perform();
                op = '-';
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perform();
                op = '*';
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perform();
                op = '/';
            }
        });
        equalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
    }
    public void reset(){
        str = "";
        num = 0;
        numtemp = 0;
        op = 'q';
        showresult.setText("");
    }
    public void insert(int i){
        str = str + Integer.toString(i);
        num = Integer.valueOf(str).intValue();
        showresult.setText(str);
    }
    public void perform(){
        str = "";
        numtemp = num;
    }
    public void calculate(){
        if(op == '+'){
            num = numtemp + num;
        }
        else if (op == '-'){
            num = numtemp - num;
        }
        else if (op == '*'){
            num = numtemp * num;
        }
        else if (op == '/'){
            num = numtemp / num;
        }

        showresult.setText("" + num);
    }
}
