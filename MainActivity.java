package com.example.meet.demo1_vier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvname;
    EditText edtname;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvname = (TextView)findViewById(R.id.tvname);
        edtname = (EditText)findViewById(R.id.edtname);
        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname =edtname.getText().toString();
                tvname.setText("Hello "+uname);
            }
        });
    }
}
