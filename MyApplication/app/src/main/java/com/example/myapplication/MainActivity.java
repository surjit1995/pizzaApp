package com.example.myapplication;

// Coded By Jaspreet Singh C0761789 (MADT Course)

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener {

    Spinner spinner;
    RadioButton rd, rd1, rd2, rd4;
    CheckBox cb,cb1,cb2,cb3,cb4;
    double price = 0;
    double addedprice = 0;
    double addedtop,addedtop1,addedtop2 = 0;
    double addedcoke,addedpepsi = 0;
    double delivery = 0;

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String ss = adapterView.getItemAtPosition(i).toString();

        if (ss.equals("Brooklyn Pizza")) {

            if (rd.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 5;
                price = price + addedprice;
            } else if (rd1.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 10;
                price = price + addedprice;
            } else if (rd2.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 15;
                price = price + addedprice;
            }

        } else if (ss.equals("Hawaiian Pizza")) {

            if (rd.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 7;
                price = price + addedprice;
            } else if (rd1.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 12;
                price = price + addedprice;
            } else if (rd2.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 17;
                price = price + addedprice;
            }

        } else if (ss.equals("Pepperoni Feast")) {

            if (rd.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 6;
                price = price + addedprice;
            } else if (rd1.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 11;
                price = price + addedprice;
            } else if (rd2.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 16;
                price = price + addedprice;
            }

        }

//        if (rd4.isChecked()) {
//            delivery = 5;
//            price = price + delivery;
//        }else {
//            if(delivery != 0){
//                price = price - delivery;
//                delivery = 0;
//            }
//        }

        changeprice();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayList<String> spinnerdata = new ArrayList<String>();
        spinnerdata.add("Brooklyn Pizza");
        spinnerdata.add("Hawaiian Pizza");
        spinnerdata.add("Pepperoni Feast");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, spinnerdata);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        rd = findViewById(R.id.radioButton);
        rd1 = findViewById(R.id.radioButton1);
        rd2 = findViewById(R.id.radioButton2);
        rd4 = findViewById(R.id.radioButton4);

        RadioGroup rd = findViewById(R.id.radioGroup);
        RadioGroup rd1 = findViewById(R.id.radioGroup1);
        rd.setOnCheckedChangeListener(this);
        rd1.setOnCheckedChangeListener(this);

        cb = findViewById(R.id.checkBox);
        cb1 = findViewById(R.id.checkBox1);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);
        cb4 = findViewById(R.id.checkBox4);

        cb.setOnCheckedChangeListener(this);
        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);
        cb4.setOnCheckedChangeListener(this);

    }

    public void changeprice() {
        TextView tv7 = findViewById(R.id.textView7);
        String finalprice = String.format("%.2f", price);
        tv7.setText("$" + finalprice);

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

        String ss = spinner.getSelectedItem().toString();

        if (ss.equals("Brooklyn Pizza")) {

            if (rd.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 5;
                price = price + addedprice;
            } else if (rd1.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 10;
                price = price + addedprice;
            } else if (rd2.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 15;
                price = price + addedprice;
            }

        } else if (ss.equals("Hawaiian Pizza")) {

            if (rd.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 7;
                price = price + addedprice;
            } else if (rd1.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 12;
                price = price + addedprice;
            } else if (rd2.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 17;
                price = price + addedprice;
            }

        } else if (ss.equals("Pepperoni Feast")) {

            if (rd.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 6;
                price = price + addedprice;
            } else if (rd1.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 11;
                price = price + addedprice;
            } else if (rd2.isChecked()) {
                if(addedprice != 0){
                    price = price - addedprice;
                }
                addedprice = 16;
                price = price + addedprice;
            }

        }

        if (rd4.isChecked()) {
            if(delivery == 0){
                delivery = 5;
                price = price + delivery;
            }
        }else {
            if(delivery != 0){
                price = price - delivery;
                delivery = 0;
            }
        }

        changeprice();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if(cb.isChecked()){
            if(addedtop == 0){
                addedtop = 1.5;
                price = price + addedtop;
            }
        }else{
            if(addedtop != 0){
                price = price - addedtop;
                addedtop = 0;
            }

        }

        if(cb1.isChecked()){
            if(addedtop1 == 0){
                addedtop1 = 1.7;
                price = price + addedtop1;
            }
        }else{
            if(addedtop1 != 0){
                price = price - addedtop1;
                addedtop1 = 0;
            }

        }

        if(cb2.isChecked()){
            if(addedtop2 == 0){
                addedtop2 = 1.9;
                price = price + addedtop2;
            }
        }else{
            if(addedtop2 != 0){
                price = price - addedtop2;
                addedtop2 = 0;
            }

        }

        if(cb3.isChecked()){
            if(addedcoke == 0){
                addedcoke = 1;
                price = price + addedcoke;
            }
        }else{
            if(addedcoke != 0){
                price = price - addedcoke;
                addedcoke = 0;
            }

        }

        if(cb4.isChecked()){
            if(addedpepsi == 0){
                addedpepsi = 1.1;
                price = price + addedpepsi;
            }
        }else{
            if(addedpepsi != 0){
                price = price - addedpepsi;
                addedpepsi = 0;
            }

        }

        changeprice();

    }
}
