package com.example.giftfordoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class disease3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease3);


        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/musculo-skeletal-bone-joints-/carpal-tunnel-syndrome";

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
                String url = "https://www.nhp.gov.in/disease/skin/chickenpox";

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
                String url = "https://www.nhp.gov.in/disease/musculo-skeletal-bone-joints-/chikungunya-fever";

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
                String url = "https://www.nhp.gov.in/disease/digestive/intestines/cholera";

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
                String url = "https://www.nhp.gov.in/disease/cardio-vascular/heart/coronary-heart-disease";

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
                String url = "https://www.nhp.gov.in/disease/respiratory/respiratory-tract/cough";

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
                String url = "https://www.nhp.gov.in/disease/eye-ear/childhood-exotropia";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn8 = (Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ear/chalazion";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn9 = (Button)findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/blood-lymphatic/crimean-congo-haemorrhagic-fever-cchf";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        }); Button btn10 = (Button)findViewById(R.id.btn10);
        btn10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/respiratory/chronic-obstructive-pulmonary-disease-copd";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn11 = (Button)findViewById(R.id.btn11);
        btn11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ophthalmology-/conjunctivochalasis";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn12 = (Button)findViewById(R.id.btn12);
        btn12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ophthalmology-/conjunctival-concretions";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn13 = (Button)findViewById(R.id.btn13);
        btn13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/gynaecology-and-obstetrics/congenital-anomalies-birth-defects";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn14 = (Button)findViewById(R.id.btn14);
        btn14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/reproductive-system/female-gynaecological-diseases-/cervical-cancer";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn15 = (Button)findViewById(R.id.btn15);
        btn15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/oncology-cancer-/colorectal-cancer";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn16 = (Button)findViewById(R.id.btn16);
        btn16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/blood-lymphatic/crimean-congo-haemorrhagic-fever-cchf";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn17 = (Button)findViewById(R.id.btn17);
        btn17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ear/chemical-injuries-to-the-eyes";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn18 = (Button)findViewById(R.id.btn18);
        btn18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/communicable-disease/novel-coronavirus-2019-ncov";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn19 = (Button)findViewById(R.id.btn19);
        btn19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ophthalmology-/computer-vision-syndrome";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn20 = (Button)findViewById(R.id.btn20);
        btn20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ophthalmology-/congenital-capillary-haemangioma-of-eyelid";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn21 = (Button)findViewById(R.id.btn21);
        btn21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ophthalmology-/cavernous-haemangioma-of-eyelid";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn22 = (Button)findViewById(R.id.btn22);
        btn22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ophthalmology-/corneal-abrasion";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn23 = (Button)findViewById(R.id.btn23);
        btn23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ophthalmology-/chalcosis";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn24 = (Button)findViewById(R.id.btn24);
        btn24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/eye-ophthalmology-/commotio-retinae";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn25 = (Button)findViewById(R.id.btn25);
        btn25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/oral/cavities";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button btn26 = (Button)findViewById(R.id.btn26);
        btn26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String url = "https://www.nhp.gov.in/disease/oral/cleft-lip-and-cleft-palate";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}
