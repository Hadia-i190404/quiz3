package com.hadianoor.quiz3;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    MyAdapter adapter;
    List<MyModel> ls;
    ImageView add;
    TextView name;
    TextView number;
    TextView address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rv);
        add=findViewById(R.id.add);
        name=findViewById(R.id.name);
        number=findViewById(R.id.number);
        address=findViewById(R.id.address);
        ls=new ArrayList<>();
        ls.add(new MyModel("Hello","123456789","qwerty"));
        adapter=new MyAdapter(ls,MainActivity.this);
        rv.setAdapter(adapter);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(MainActivity.this);
        rv.setLayoutManager(lm);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ADD.class);
                startActivity(intent);
            }
        });


    }


}