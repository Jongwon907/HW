package com.example.myapplication;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText eTextID,eTextPW,eTextPH;
    private Button eButton;
    private TextView eTextViewID,eTextViewPW,eTextViewPH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        eTextID = (EditText) findViewById(R.id.edittextID);
        eTextPW = (EditText) findViewById(R.id.edittextPW);
        eTextPH = (EditText) findViewById(R.id.edittextPH);
        eButton = (Button) findViewById(R.id.button);
        eTextViewID = (TextView) findViewById(R.id.textViewID);
        eTextViewPW = (TextView) findViewById(R.id.textViewPW);
        eTextViewPH = (TextView) findViewById(R.id.textViewPH);
    }

    public void onClicked(View view) {
        String strID = eTextID.getText().toString();
        eTextViewID.setText("아이디 :" + strID);
        String strPW = eTextPW.getText().toString();
        eTextViewPW.setText("패스워드 :" + strPW);
        String strPH = eTextPH.getText().toString();
        eTextViewPH.setText("전화번호 :" + strPH);
    }
}