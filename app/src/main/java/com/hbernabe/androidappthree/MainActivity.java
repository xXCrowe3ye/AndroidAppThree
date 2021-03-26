package com.hbernabe.androidappthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    TextView txtViewNum, txtViewResult;

    String numbers = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtViews();

    }

    private void txtViews(){
        txtViewNum = (TextView)findViewById(R.id.txtViewNumbers);
        txtViewResult = (TextView)findViewById(R.id.txtViewResults);
    }

    private void setNumbers(String inputValues){

        numbers = numbers + inputValues;
        txtViewNum.setText(numbers);

    }

    public void onClickEquals(View view){

        Double result = null;

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");

        try {
            result = (double) engine.eval(numbers);
        } catch (ScriptException e){

            Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show();
        }

        txtViewResult.setText((String.valueOf((result.doubleValue()))));



    }

    public void onClickClear(View view){
        txtViewNum.setText("");
        numbers = "";
        txtViewResult.setText("");
    }

    public void onClickAdd(View view){
        setNumbers("+");
    }

    public void onClickSubtract(View view){
        setNumbers("-");
    }

    public void onClickMultiply(View view){
        setNumbers("*");
    }

    public void onClickDivide(View view){
        setNumbers("/");
    }

    public void onClickZero(View view){
        setNumbers("0");
    }

    public void onClickOne(View view){
        setNumbers("1");
    }

    public void onClickTwo(View view){
        setNumbers("2");
    }

    public void onClickThree(View view){
        setNumbers("3");
    }

    public void onClickFour(View view){
        setNumbers("4");
    }

    public void onClickFive(View view){
        setNumbers("5");
    }

    public void onClickSix(View view){
        setNumbers("6");
    }

    public void onClickSeven(View view){
        setNumbers("7");
    }

    public void onClickEight(View view){
        setNumbers("8");
    }

    public void onClickNine(View view){
        setNumbers("9");
    }
}