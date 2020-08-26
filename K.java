package com.example.giftfordoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class disease11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease11);

        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/kala-azar-leishmaniasis";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ear/kaposi-s-sarcoma";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ear/keratosis-pilaris";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ear/kerato-conjunctivitis-dry-eye-syndrome";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/communicable-disease/kyasanur-forest-disease";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ophthalmology-/keratoconus";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ophthalmology-/keratoglobus";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
