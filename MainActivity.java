package com.example.giftfordoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,b11, b12, b13, b14, b15, b16, b17, b18, b19, b23, b20, b21,b22, b24, b25, b26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease1.class);
                startActivity(intent);
            }
        });

        b2 = (Button) findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease2.class);
                startActivity(intent);
            }
        });

        b3 = (Button) findViewById(R.id.btn3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease3.class);
                startActivity(intent);
            }
        });

        b4 = (Button) findViewById(R.id.btn4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease4.class);
                startActivity(intent);
            }
        });

        b5 = (Button) findViewById(R.id.btn5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease5.class);
                startActivity(intent);
            }
        });

        b6 = (Button) findViewById(R.id.btn6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease6.class);
                startActivity(intent);
            }
        });

        b7 = (Button) findViewById(R.id.btn7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease7.class);
                startActivity(intent);
            }
        });

        b8 = (Button) findViewById(R.id.btn8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease8.class);
                startActivity(intent);
            }
        });

        b9 = (Button) findViewById(R.id.btn9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease9.class);
                startActivity(intent);
            }
        });

        b10 = (Button) findViewById(R.id.btn10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease10.class);
                startActivity(intent);
            }
        });

        b11 = (Button) findViewById(R.id.btn11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease11.class);
                startActivity(intent);
            }
        });

        b12 = (Button) findViewById(R.id.btn12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease12.class);
                startActivity(intent);
            }
        });

        b13 = (Button) findViewById(R.id.btn13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease13.class);
                startActivity(intent);
            }
        });

        b14 = (Button) findViewById(R.id.btn14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease14.class);
                startActivity(intent);
            }
        });

        b15 = (Button) findViewById(R.id.btn15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease15.class);
                startActivity(intent);
            }
        });

        b16 = (Button) findViewById(R.id.btn16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease16.class);
                startActivity(intent);
            }
        });

        b17 = (Button) findViewById(R.id.btn17);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease17.class);
                startActivity(intent);
            }
        });

        b18 = (Button) findViewById(R.id.btn18);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease18.class);
                startActivity(intent);
            }
        });

        b19 = (Button) findViewById(R.id.btn19);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease19.class);
                startActivity(intent);
            }
        });

        b20 = (Button) findViewById(R.id.btn20);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease20.class);
                startActivity(intent);
            }
        });

        b21 = (Button) findViewById(R.id.btn21);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease21.class);
                startActivity(intent);
            }
        });

        b22 = (Button) findViewById(R.id.btn22);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease22.class);
                startActivity(intent);
            }
        });

        b23 = (Button) findViewById(R.id.btn23);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease23.class);
                startActivity(intent);
            }
        });

        b24 = (Button) findViewById(R.id.btn24);
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease24.class);
                startActivity(intent);
            }
        });

        b25 = (Button) findViewById(R.id.btn25);
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease25.class);
                startActivity(intent);
            }
        });

        b26 = (Button) findViewById(R.id.btn26);
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,disease26.class);
                startActivity(intent);
            }
        });


    }


}
