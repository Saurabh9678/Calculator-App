package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mTvQuestion, mTvAns;
    Button clear, allClear,percent,divide,multiply,equal,add,minus,no7,no8,no9,no4,no5,no6,no1,no2,no3,no0,dot;
    String question = "";
    String fNum = "";
    String sNum = "";
    String operator = "";
    int ans=0;
    public static boolean checkOperator(String s){
        boolean b = s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-' || s.charAt(s.length() - 1) == '*' || s.charAt(s.length() - 1) == '/';
        return b;
    };
     public static char whichOperator(String s){
        if (s.charAt(s.length() - 1) == '+'){
            return '+';
        }else if (s.charAt(s.length() - 1) == '-'){
            return '-';
        }else if(s.charAt(s.length() - 1) == '*'){
            return '*';
        }else{
            return '/';
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);//  set status text dark

        mTvQuestion = findViewById(R.id.tvQuestion);
        mTvAns = findViewById(R.id.tvAnswer);
        clear = findViewById(R.id.btnClear);
        allClear = findViewById(R.id.btnAllClear);
        percent = findViewById(R.id.btnPercent);
        divide = findViewById(R.id.btnDivide);
        multiply = findViewById(R.id.btnMultiply);
        equal = findViewById(R.id.btnEqual);
        add = findViewById(R.id.btnAdd);
        minus = findViewById(R.id.btnMinus);
        no0 = findViewById(R.id.btnNo0);
        no1 = findViewById(R.id.btnNo1);
        no2 = findViewById(R.id.btnNo2);
        no3 = findViewById(R.id.btnNo3);
        no4 = findViewById(R.id.btnNo4);
        no5 = findViewById(R.id.btnNo5);
        no6 = findViewById(R.id.btnNo6);
        no7 = findViewById(R.id.btnNo7);
        no8 = findViewById(R.id.btnNo8);
        no9 = findViewById(R.id.btnNo9);

        mTvAns.setText(Integer.toString(ans));
        mTvQuestion.setText(question);

        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question = "";
                ans = 0;
                mTvAns.setText(Integer.toString(ans));
                mTvQuestion.setText(question);
            }
        });

        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (question.length() != 0 ){
                    if (operator.length() != 0){
                        sNum = sNum + "1";

                    }else{
                        fNum= fNum + "1";
                    }
                }else{
                    fNum= "1";
                }
                question = question + "1";
                mTvQuestion.setText(question);
            }
        });

        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (question.length() != 0 ){
                    if (operator.length() != 0){
                        sNum = sNum + "2";

                    }else{
                        fNum= fNum + "2";
                    }
                }else{
                    fNum= "2";
                }
                question = question + "2";
                mTvQuestion.setText(question);
            }
        });

        no3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (question.length() != 0 ){
                    if (operator.length() != 0){
                        sNum = sNum + "3";

                    }else{
                        fNum= fNum + "3";
                    }
                }else{
                    fNum= "3";
                }
                question = question + "3";
                mTvQuestion.setText(question);
            }
        });

        no4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (question.length() != 0 ){
                    if (operator.length() != 0){
                        sNum = sNum + "4";

                    }else{
                        fNum= fNum + "4";
                    }
                }else{
                    fNum= "4";
                }
                question = question + "4";
                mTvQuestion.setText(question);
            }
        });

        no5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (question.length() != 0 ){
                    if (operator.length() != 0){
                        sNum = sNum + "5";

                    }else{
                        fNum= fNum + "5";
                    }
                }else{
                    fNum= "5";
                }
                question = question + "5";
                mTvQuestion.setText(question);
            }
        });

        no6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (question.length() != 0 ){
                    if (operator.length() != 0){
                        sNum = sNum + "6";

                    }else{
                        fNum= fNum + "6";
                    }
                }else{
                    fNum= "6";
                }
                question = question + "6";
                mTvQuestion.setText(question);
            }
        });

        no7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (question.length() != 0 ){
                    if (operator.length() != 0){
                        sNum = sNum + "7";

                    }else{
                        fNum= fNum + "7";
                    }
                }else{
                    fNum= "7";
                }
                question = question + "7";
                mTvQuestion.setText(question);
            }
        });

        no8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (question.length() != 0 ){
                    if (operator.length() != 0){
                        sNum = sNum + "8";

                    }else{
                        fNum= fNum + "8";
                    }
                }else{
                    fNum= "8";
                }
                question = question + "8";
                mTvQuestion.setText(question);
            }
        });

        no9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (question.length() != 0 ){
                    if (operator.length() != 0){
                        sNum = sNum + "9";

                    }else{
                        fNum= fNum + "9";
                    }
                }else{
                    fNum= "9";
                }
                question = question + "9";
                mTvQuestion.setText(question);
            }
        });

        no0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (question.length() != 0 ){
                    if (operator.length() != 0){
                        sNum = sNum + "0";

                    }else{
                        fNum= fNum + "0";
                    }
                }else{
                    fNum= "0";
                }
                question = question + "0";
                mTvQuestion.setText(question);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question = question + "+";
                operator = "+";
                mTvQuestion.setText(question);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question = question + "-";
                operator = "-";
                mTvQuestion.setText(question);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question = question + "/";
                operator = "/";
                mTvQuestion.setText(question);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question += '*';
                operator = "*";
                mTvQuestion.setText(question);
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question += "%";
                operator = "%";
                mTvQuestion.setText(question);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fNum.length() != 0 && sNum.length() != 0 && operator.length() != 0) {
                    char op = whichOperator(operator);
                    if (op == '+') {
                        ans = Integer.parseInt(fNum) + Integer.parseInt(sNum);
                    } else if (op == '-') {
                        ans = Integer.parseInt(fNum) - Integer.parseInt(sNum);
                    } else if (op == '*') {
                        ans = Integer.parseInt(fNum) * Integer.parseInt(sNum);
                    } else if (op == '/') {
                        ans = Integer.parseInt(fNum) / Integer.parseInt(sNum);
                    }
                }
                fNum = "";
                sNum = "";
                operator = "";

                mTvAns.setText(Integer.toString(ans));
                mTvAns.setTextSize(50);

            }
        });
    }
}