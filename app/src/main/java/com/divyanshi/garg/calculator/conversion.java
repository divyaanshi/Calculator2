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
import android.widget.Toast;


public class conversion extends AppCompatActivity {
    private BottomNavigationView mMainNav;
    Button weight,Length,Volume,Area,Temperature,Currency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        mMainNav = (BottomNavigationView)findViewById(R.id.nav_id);
        Temperature=(Button)findViewById(R.id.temperature);
        weight=(Button)findViewById(R.id.weight);
        Length=(Button)findViewById(R.id.length);
        Area=(Button)findViewById(R.id.area);
        Volume=(Button)findViewById(R.id.volume);
        Currency=(Button)findViewById(R.id.currency);



        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.basic_calculator :{
                        Intent intent =new  Intent(conversion.this,calculator.class);
                        startActivity(intent);
                        return true;

                    }
                    case R.id.scientific_calculator :{
                        Intent intent =new  Intent(conversion.this, scientific_calculator.class);
                        startActivity(intent);
                        return true;

                    }
                    case R.id.conversion :{
                        Intent intent =new  Intent(conversion.this, conversion.class);
                        startActivity(intent);
                        return true;
                    }




                    default:
                        return false;

                }
            }
        });

        Area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(conversion.this, Area.class);
                startActivity(intent);
            }
        });

        Volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(conversion.this, Volume.class);
                startActivity(intent);
            }
        });

        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(conversion.this,weight.class);
                startActivity(intent);
            }
        });
        Length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(conversion.this, Length.class);
                startActivity(intent);
            }
        });

        Temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(conversion.this,temperature.class);
                startActivity(intent);
            }
        });

        Currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(conversion.this,Currency.class);
                startActivity(intent);
            }
        });


    }
}
