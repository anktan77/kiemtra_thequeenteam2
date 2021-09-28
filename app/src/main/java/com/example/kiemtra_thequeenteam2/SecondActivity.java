package com.example.kiemtra_thequeenteam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    ImageView imgPic;
    TextView txtId,txtName,txtPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imgPic = (ImageView) findViewById(R.id.imagePic2);
        txtId = (TextView) findViewById(R.id.textViewId2);
        txtName = (TextView) findViewById(R.id.textViewName2);
        txtPhone= (TextView) findViewById(R.id.textViewPhone2);

        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra("data");
        imgPic.setImageResource(student.getPic());
        txtId.setText(student.getId());
        txtName.setText(student.getName());
        txtPhone.setText(student.getPhone());
    }
}