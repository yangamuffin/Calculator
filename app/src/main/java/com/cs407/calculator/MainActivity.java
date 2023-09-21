package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void clickAdd(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        double int1 = Integer.parseInt(myTextField.getText().toString());
        double int2 = Integer.parseInt(myTextField2.getText().toString());
        double sum = int1 + int2;
        String result = Double.toString(sum);
        goToActivity(result);
    }

    public void clickMinus(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        double int1 = Integer.parseInt(myTextField.getText().toString());
        double int2 = Integer.parseInt(myTextField2.getText().toString());
        String result = Double.toString(int1 - int2);
        goToActivity(result);
    }

    public void clickMultiply(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        double int1 = Integer.parseInt(myTextField.getText().toString());
        double int2 = Integer.parseInt(myTextField2.getText().toString());
        String result = Double.toString(int1 * int2);
        goToActivity(result);
    }

    public void clickDivide(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        double int1 = Integer.parseInt(myTextField.getText().toString());
        double int2 = Integer.parseInt(myTextField2.getText().toString());
        String result = Double.toString(int1 / int2);
        goToActivity(result);

    }

    public void goToActivity(String s){
        Intent intent = new Intent(this, Calculator2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}