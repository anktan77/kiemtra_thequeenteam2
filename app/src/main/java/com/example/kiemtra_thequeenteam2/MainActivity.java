package com.example.kiemtra_thequeenteam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvStudent;
    ArrayList<Student> arrayStudent;
    StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvStudent = (ListView) findViewById(R.id.listviewStudent);
        arrayStudent = new ArrayList<>();
        adapter = new StudentAdapter(this,R.layout.item_student,arrayStudent);

        arrayStudent.add(new Student(R.drawable.pic1,"1811063479","Ngọc Trinh","0389643578"));
        arrayStudent.add(new Student(R.drawable.pic2,"1811063445","Hương Giang","0326649865"));
        arrayStudent.add(new Student(R.drawable.pic3,"1811065689","Chi Pu","0326649558"));

        lvStudent.setAdapter(adapter);

        lvStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("data", (Serializable) arrayStudent.get(position));
                startActivity(intent);
            }
        });

    }
}