package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello1 = findViewById(R.id.btnHello1);
        btnHello1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hello! - Called from anonymous object of type: View.OnClickListener having an onClick method");
            }
        });

        Button btnHello2 = findViewById(R.id.btnHello2);
        btnHello2.setOnClickListener(this);

        Button btnToast = findViewById(R.id.btnToast);
        btnToast.setOnClickListener(this);

        btnToast.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Successful Long Press on Toast Button", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnHello2:
                System.out.println("Hello! - Called from onClick implemented method");
                break;
            case R.id.btnToast:
                Toast.makeText(this, "Hello from Toast Button!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

    }


//    public void onHelloBtnClicked(View view) {
//        TextView txtWelcome = findViewById(R.id.txtWelcome);
//        txtWelcome.setText("Hello Again!");
//    }
}