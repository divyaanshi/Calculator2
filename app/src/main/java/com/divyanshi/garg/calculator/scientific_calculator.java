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


public class scientific_calculator extends AppCompatActivity {
    Button sqrt,log,one,two,three,four,five,six,seven,eight,nine,zero,multiply,divide,dot,add,subtract,equals,modulus,clear,ln,cos,sin,tan,exponent,fraction,power,factorial,Pi;
    EditText sccalc;
    ImageButton cross;
    private BottomNavigationView mMainNav;

    int input3=0;
    Double input1 =0.0,input2=0.0;
    boolean Addition, Subtract, Multiplication, Division,decimal,Modulus,Power;

    public Double Factorial(Double n) {

        int i;
        Double fact1 = 1.0;
        for (i = 1; i <= n; i++) {
            fact1 = fact1 * i;
        }

        return fact1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);


        sqrt=(Button)findViewById(R.id.sqrt);
        one=(Button)findViewById(R.id.oneone);
        two=(Button)findViewById(R.id.twotwo);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.fourfour);
        five=(Button)findViewById(R.id.fivefive);
        six=(Button)findViewById(R.id.sixsix);
        seven=(Button)findViewById(R.id.sevenseven);
        eight=(Button)findViewById(R.id.eighteight);
        nine=(Button)findViewById(R.id.ninenine);
        zero=(Button)findViewById(R.id.zerozero);
        multiply=(Button)findViewById(R.id.multiplymultiply);
        divide=(Button)findViewById(R.id.dividedivide);
        dot=(Button)findViewById(R.id.dotdot);
        add=(Button)findViewById(R.id.addplus);
        subtract=(Button)findViewById(R.id.subtractsubtract);
        equals=(Button)findViewById(R.id.equalsequals);
        sccalc=(EditText) findViewById(R.id.sccalc);
        sccalc.setInputType(InputType.TYPE_NULL);
        modulus=(Button)findViewById(R.id.modulusmodulus);
        clear=(Button)findViewById(R.id.clearclear);
        cross=(ImageButton)findViewById(R.id.crosscross);
        ln=(Button)findViewById(R.id.ln);
        log = (Button)findViewById(R.id.log);
        cos=(Button)findViewById(R.id.cos);
        sin=(Button)findViewById((R.id.sin));
        tan=(Button)findViewById(R.id.tan);
        exponent=(Button)findViewById(R.id.exponent);
        fraction=(Button)findViewById(R.id.reci);
        power=(Button)findViewById(R.id.poly);
        factorial=(Button)findViewById(R.id.fact);
        Pi=(Button)findViewById(R.id.pi);
        mMainNav = (BottomNavigationView)findViewById(R.id.nav_id);



        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.basic_calculator :{
                        Intent intent =new  Intent(scientific_calculator.this,calculator.class);
                        startActivity(intent);
                        return true;

                    }
                    case R.id.scientific_calculator :{
                        Intent intent =new  Intent(scientific_calculator.this, scientific_calculator.class);
                        startActivity(intent);
                        return true;

                    }
                    case R.id.conversion :{
                        Intent intent =new  Intent(scientific_calculator.this, conversion.class);
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
                sccalc.setText(sccalc.getText()+"1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sccalc.setText(sccalc.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sccalc.setText(sccalc.getText()+"3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sccalc.setText(sccalc.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sccalc.setText(sccalc.getText()+"5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sccalc.setText(sccalc.getText()+"6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sccalc.setText(sccalc.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sccalc.setText(sccalc.getText()+"8");
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sccalc.setText(sccalc.getText()+"9");
            }
        });


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sccalc.setText(sccalc.getText()+"0");
            }
        });


        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sccalc.setText(sccalc.getText()+".");
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Addition || Subtract || Multiplication || Division || Modulus || Power)
                    input2 = Double.parseDouble(sccalc.getText() + "");


                if (Addition) {


                    if (input1 == null) {
                        String a = Double.toString(input2);
                        sccalc.setText(a);
                    } else {
                        sccalc.setText(input1 + input2 + "");
                        Addition = false;
                    }
                }

                if (Subtract) {


                    if (input1 == null) {
                        String a = Double.toString(input2);
                        sccalc.setText(a);
                    } else {
                        sccalc.setText(input1 - input2 + "");
                        Subtract = false;
                    }
                }
                if (Multiplication) {


                    if (input1 == null) {
                        String a = Double.toString(input2);
                        sccalc.setText(a);
                    } else {
                        sccalc.setText(input1 * input2 + "");
                        Multiplication = false;
                    }
                }

                if (Division) {


                    if (input1 == null) {
                        String a = Double.toString(input2);
                        sccalc.setText(a);
                    } else {
                        sccalc.setText(input1 / input2 + "");
                        Division = false;
                    }
                }
                if (Modulus) {


                    if (input1 == null) {
                        String a = Double.toString(input2);
                        sccalc.setText(a);
                    } else {
                        sccalc.setText(input1 % input2 + "");
                        Modulus = false;
                    }

                }
                if (Power) {


                    if (input1 == null) {
                        String a = Double.toString(input2);
                        sccalc.setText(a);
                    } else {
                        Double c=Math.pow(input1,input2);
                        sccalc.setText(c.toString());
                        Power = false;
                    }
                }


            }

        });




        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sccalc.getText().length() != 0) {
                    input1 = Double.parseDouble(sccalc.getText() + "");
                    Addition= true;
                    decimal = false;
                    sccalc.setText(null);
                }
            }



        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sccalc.getText().length() != 0) {
                    input1 = Double.parseDouble(sccalc.getText() + "");
                    Subtract = true;
                    decimal = false;
                    sccalc.setText(null);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sccalc.getText().length() != 0) {
                    input1 = Double.parseDouble(sccalc.getText() + "");
                    Division = true;
                    decimal = false;
                    sccalc.setText(null);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sccalc.getText().length() != 0) {
                    input1 = Double.parseDouble(sccalc.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    sccalc.setText(null);
                }
            }
        });

        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sccalc.getText().length() != 0) {
                    input1 = Double.parseDouble(sccalc.getText() + "");
                    Modulus = true;
                    decimal = false;
                    sccalc.setText(null);
                }
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sccalc.getText().length() != 0) {
                    String b=sccalc.getText().toString();
                    Double input4 = Double.parseDouble(b);
                    Double c =Math.sqrt(input4);
                    String d = c.toString();
                    sccalc.setText(d);
                }
            }
        });

        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sccalc.getText().length() != 0) {
                    String b=sccalc.getText().toString();
                    Double input4 = Double.parseDouble(b);
                    Double c =Math.log(input4);
                    String d = c.toString();
                    sccalc.setText(d);
                }
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sccalc.getText().length()!=0){
                    String b=sccalc.getText().toString();
                    Double input4= Double.parseDouble(b);
                    Double c =Math.log10(input4);
                    String d = c.toString();
                    sccalc.setText(d);
                }
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(sccalc.getText().length()!=0){
                    String b=sccalc.getText().toString();
                    Double input4 = Double.parseDouble(b);
                    Double c =Math.sin(input4);
                    String d = c.toString();
                    sccalc.setText(d);
                }}
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sccalc.getText().length()!=0){
                    String b=sccalc.getText().toString();
                    Double input4 = Double.parseDouble(b);
                    Double c =Math.sin(input4);
                    String d = c.toString();
                    sccalc.setText(d);
                }}
        });


        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sccalc.getText().length() != 0) {
                    String b = sccalc.getText().toString();
                    Double input4 = Double.parseDouble(b);
                    Double c = Math.tan(input4);
                    String d = c.toString();
                    sccalc.setText(d);
                }
            }
        });

        exponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sccalc.getText().length() != 0) {
                    String b = sccalc.getText().toString();
                    Double input4 = Double.parseDouble(b);
                    Double c = Math.exp(input4);
                    String d = c.toString();
                    sccalc.setText(d);
                }
            }
        });



        fraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sccalc.getText().length() != 0) {
                    String b = sccalc.getText().toString();
                    Double input4 = Double.parseDouble(b);
                    Double c= 1/input4;
                    String d = c.toString();
                    sccalc.setText(d);
                }
            }
        });

        Pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sccalc.getText().length()!=0)
                {
                    sccalc.setText("Error");
                }else{
                    Double a= Math.PI;

                    sccalc.setText(a + "");
                }}
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sccalc.getText().length() != 0) {
                    input1 = Double.parseDouble(sccalc.getText() + "");
                    Power = true;
                    decimal = false;
                    sccalc.setText(null);
                }
            }
        });


        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str=sccalc.getText().toString();
                if(str.length()>1)
                {
                    str=str.substring(0,str.length()-1);
                    sccalc.setText(str);

                }
                else if (str.length()<=1)
                {
                    sccalc.setText("");

                }

            }


        });

        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sccalc.getText().length() != 0) {
                    String b = sccalc.getText().toString();
                    Double input4 = Double.parseDouble(b);
                    Double c =   Factorial(input4);
                    String d = c.toString();
                    sccalc.setText(d);
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1=null;
                sccalc.setText(null);
            }
        });


    }
}
