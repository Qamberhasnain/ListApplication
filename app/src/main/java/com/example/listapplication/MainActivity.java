package com.example.listapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
String names[] = {"google","facebook","instagram","linkedin"};
int id[]={R.drawable.google,R.drawable.facebook,R.drawable.instagram,R.drawable.linkedin};
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);

        CustomAdopter obj = new CustomAdopter(MainActivity.this,names,id);
        listView.setAdapter(obj);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Toast.makeText(MainActivity.this, "You Clicked on Google!", Toast.LENGTH_LONG).show();
                }
                if(position == 1) {
                    Toast.makeText(MainActivity.this, "You Clicked on Facebook!", Toast.LENGTH_LONG).show();
                }
                if(position == 2) {
                    Toast.makeText(MainActivity.this, "You Clicked on Instagram!", Toast.LENGTH_LONG).show();
                }
                if(position == 3) {
                    Toast.makeText(MainActivity.this, "You Clicked on LinkedIn!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}