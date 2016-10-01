package com.example.farrukhmalik.report_card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listView;
        ArrayList<StudentsRecord> list;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        list = new ArrayList<StudentsRecord>();
        list.add(new StudentsRecord("Syed Bakhtiyar", "1st", "present", "A+", R.drawable.a));
        list.add(new StudentsRecord("Syed Bakhtiyar", "2nd", "present", "A", R.drawable.b));
        list.add(new StudentsRecord("Syed Bakhtiyar", "3rd", "present", "B+", R.drawable.c));
        list.add(new StudentsRecord("Syed Bakhtiyar", "4th", "present", "B", R.drawable.d));
        list.add(new StudentsRecord("Syed Bakhtiyar", "5th", "present", "B", R.drawable.e));
        list.add(new StudentsRecord("Syed Bakhtiyar", "6th", "present", "C", R.drawable.f));
        list.add(new StudentsRecord("Syed Bakhtiyar", "7th", "present", "Fail", R.drawable.g));
        list.add(new StudentsRecord("Syed Bakhtiyar", "8th", "Absent", "Fail", R.drawable.h));
        CustomAdapter adaptor = new CustomAdapter(this, list);
        listView.setAdapter(adaptor);
    }
}
