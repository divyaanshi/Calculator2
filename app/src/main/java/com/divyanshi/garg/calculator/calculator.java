package com.divyanshi.garg.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.text.InputType;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class calculator extends AppCompatActivity {
    private BottomNavigationView mMainNav;

    private
    Button one,two,three,four,five,six,seven,eight,nine,dot,multiply,divide,zero,subtract,add,equals,modulus,clear,sc;
    ImageButton cross;
    EditText calc;
    Double input1 =0.0,input2=0.0;
    boolean Addition, Subtract, Multiplication, Division,decimal,Modulus,Clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        mMainNav = (BottomNavigationView)findViewById(R.id.nav_id);
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
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);
        dot=(Button)findViewById(R.id.EQUAL);
        add=(Button)findViewById(R.id.add);
        subtract=(Button)findViewById(R.id.subtract);
        equals=(Button)findViewById(R.id.equals);
        calc=(EditText) findViewById(R.id.editText);
        calc.setInputType(InputType.TYPE_NULL);
        modulus=(Button)findViewById(R.id.modulus);
        clear=(Button)findViewById(R.id.clear);

        cross=(ImageButton)findViewById(R.id.imageButton);


        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.basic_calculator :{
                        Intent intent =new  Intent(calculator.this,calculator.class);
                        startActivity(intent);
                        return true;

                    }
                    case R.id.scientific_calculator :{
                        Intent intent =new  Intent(calculator.this, scientific_calculator.class);
                        startActivity(intent);
                        return true;

                    }
                    case R.id.conversion :{
                        Intent intent =new  Intent(calculator.this, conversion.class);
                        startActivity(intent);
                        return true;
                    }




                    default:
                        return false;

                }
            }
        });



        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.setText(calc.getText()+"1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.setText(calc.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.setText(calc.getText()+"3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.setText(calc.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.setText(calc.getText()+"5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.setText(calc.getText()+"6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.setText(calc.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.setText(calc.getText()+"8");
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.setText(calc.getText()+"9");
            }
        });


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.setText(calc.getText()+"0");
            }
        });


        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc.setText(calc.getText()+".");
            }
        });


        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Addition || Subtract || Multiplication || Division || Modulus) {
                    input2 = Double.parseDouble(calc.getText() + "");
                }

                if (Addition) {

                    if (Double.toString(input2) =="" && input1==null){
                        calc.setText("a");}
                    else if (input1==null)
                    {   String a=Double.toString(input2);
                        calc.setText(a);
                    }else {
                        calc.setText(input1 + input2 + "");
                        Addition = false;}
                }

                if (Subtract) {

                    if (input1==null)
                    {   String a=Double.toString(input2);
                        calc.setText(a);}
                    else
                    {

                        calc.setText(input1 - input2 + "");
                        Subtract = false;
                    }}

                if (Multiplication) {
                    if (input1==null)
                    {   String a=Double.toString(input2);
                        calc.setText(a);}
                    else
                    {
                        calc.setText(input1 * input2 + "");
                        Multiplication = false;
                    }}

                if (Division) {
                    if (input1==null) {
                        String a = Double.toString(input2);
                        calc.setText(a);
                    }
                    else
                    {
                        calc.setText(input1 / input2 + "");
                        Division = false;
                    }}


                if(Modulus)
                {
                    if (input1==null) {
                        String a = Double.toString(input2);
                        calc.setText(a);
                    }
                    else
                    {calc.setText(input1%input2 + "");
                        Modulus=false;
                    }}
                if(Clear)
                {
                    Clear=false;
                }

            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (calc.getText().length() != 0) {
                    input1 = Double.parseDouble(calc.getText() + "");
                    Addition = true;
                    decimal = false;
                    calc.setText(null);
                }
            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (calc.getText().length() != 0) {
                    input1 = Double.parseDouble(calc.getText() + "");
                    Subtract = true;
                    decimal = false;
                    calc.setText(null);
                }
            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (calc.getText().length() != 0) {
                    input1 = Double.parseDouble(calc.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    calc.setText(null);
                }
            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (calc.getText().length() != 0) {
                    input1 = Double.parseDouble(calc.getText() + "");
                    Division= true;
                    decimal = false;
                    calc.setText(null);
                }
            }
        });

        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(calc.getText().length()!=0){
                    input1=Double.parseDouble(calc.getText()+"");
                    Modulus=true;
                    decimal=false;
                    calc.setText(null);
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1=null;
                calc.setText(null);
            }
        });

        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str=calc.getText().toString();
                if(str.length()>1)
                {
                    str=str.substring(0,str.length()-1);
                    calc.setText(str);

                }
                else if (str.length()<=1)
                {
                    calc.setText("");

                }

            }


        });



    }
}
