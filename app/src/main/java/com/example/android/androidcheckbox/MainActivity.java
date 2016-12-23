package com.example.android.androidcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv01 = (TextView)findViewById(R.id.TextView01);
        final CheckBox cb = (CheckBox)findViewById(R.id.checkbox01);
        final Button bt = (Button)findViewById(R.id.Button01);
        cb.setChecked(false);
        bt.setEnabled(false);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cb.isChecked()){
                    tv01.setText("");
                    bt.setEnabled(true);
                }else {
                    tv01.setText("请勾选我");
                    bt.setEnabled(false);
                }
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cb.isChecked()){
                    tv01.setText("已经选择");
                }
            }
        });
    }
}
