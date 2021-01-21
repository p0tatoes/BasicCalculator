package com.example.basiccalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd, btnSub, btnMulti, btnDiv, btnMod;

        btnAdd = findViewById(R.id.btnPlus);
        btnSub = findViewById(R.id.btnMinus);
        btnMulti = findViewById(R.id.btnMultiply);
        btnDiv = findViewById(R.id.btnDivide);
        btnMod = findViewById(R.id.btnModulo);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMod.setOnClickListener(this);
    }
    @Override
    public void onClick (View v) {

        EditText txtOperand1, txtOperand2;
        TextView txtAnswer;

        txtOperand1 = findViewById(R.id.txtOperand1);
        txtOperand2 = findViewById(R.id.txtOperand2);
        txtAnswer = findViewById(R.id.txtAnswer);



        Double operand1 = 0.0;
        Double operand2 = 0.0;
        Double answer = 0.0;

        operand1 = Double.parseDouble(txtOperand1.getText().toString());
        operand2 = Double.parseDouble(txtOperand2.getText().toString());

        switch (v.getId()) {
            case R.id.btnPlus:
                answer = operand1 + operand2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnMinus:
                answer = operand1 - operand2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnMultiply:
                answer = operand1 * operand2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnDivide:
                answer = operand1 / operand2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnModulo:
                answer = operand1 % operand2;
                txtAnswer.setText(Double.toString(answer));
                break;
        }
    }
}