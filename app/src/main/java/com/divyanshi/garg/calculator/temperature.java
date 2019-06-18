package com.divyanshi.garg.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

public class temperature extends AppCompatActivity {
    private
    Button one,two,three,four,five,six,seven,eight,nine,dot,zero,clear,equalss;
    ImageButton cross;
    EditText input,output;
    private converting_units.Temperature ca;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        dot=(Button)findViewById(R.id.dot2);
        output=(EditText) findViewById(R.id.editText2);
        output.setInputType(InputType.TYPE_NULL);
        clear=(Button)findViewById(R.id.clear);
        input = (EditText)findViewById(R.id.editText3);
        input.setInputType(InputType.TYPE_NULL);
        equalss = (Button)findViewById(R.id.EQUAL);
        cross = (ImageButton)findViewById(R.id.crosscross);

        ca=new converting_units.Temperature();

        final Spinner spinner = (Spinner) findViewById(R.id.spinnerinput);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.temperature_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);



        final Spinner spinner1 = (Spinner) findViewById(R.id.spinneroutput);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.temperature_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner1.setAdapter(adapter1);

        cross=(ImageButton)findViewById(R.id.imageButton);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"8");
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"9");
            }
        });


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"0");
            }
        });


        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+".");
            }
        });
        equalss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int item1=spinner.getSelectedItemPosition();
                int item2=spinner1.getSelectedItemPosition();
                if (item1!=0){
                double value1=Double.parseDouble(input.getText().toString());
                double result=evaluate(item1,item2,value1);
                output.setText(result+"");}
            }


        });

        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str=input.getText().toString();
                if(str.length()>1)
                {
                    str=str.substring(0,str.length()-1);
                    input.setText(str);

                }
                else if (str.length()<=1)
                {
                    input.setText("");

                }

            }


        });


    }

    public double evaluate(int item1,int item2,double value){

        double temp=0.0;
        if(item1==item2)
            return value;

        else
        {
            switch (item1)
            {
                case 0:
                    temp=ca.FerToKelvin(value);
                    break;
                case 1:
                    temp=ca.KelvinToFer(value);
                    break;
                case 2:
                    temp=ca.CelsiTokelvin(value);
                    break;
                case 3:
                    temp=ca.KelvinToCelsi(value);
                    break;

            }

            switch (item2)
            {
                case 0:
                    temp=ca.KelvinToFer(temp);
                    break;
                case 1:
                    temp=ca.FerToKelvin(temp);
                    break;
                case 2:
                    temp=ca.KelvinToCelsi(temp);
                    break;
                case 3:
                    temp=ca.CelsiTokelvin(temp);
                    break;
            }
            return temp;
        }

    }
}
