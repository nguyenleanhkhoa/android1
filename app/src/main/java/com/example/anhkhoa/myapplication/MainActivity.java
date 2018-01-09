package com.example.anhkhoa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout1,linearLayout2;
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout1=findViewById(R.id.linear1);
        linearLayout2=findViewById(R.id.linear2);
        btn1=findViewById(R.id.btntest1);
        btn2=findViewById(R.id.btntest2);
        final LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        btn1.setBackground(getResources().getDrawable(R.drawable.changebackgound));
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout2.setVisibility(View.GONE);
                linearLayout1.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setBackground(getResources().getDrawable(R.drawable.changebackgound));
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linearLayout2.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
