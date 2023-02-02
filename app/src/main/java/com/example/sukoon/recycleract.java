package com.example.sukoon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class recycleract extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<modelclass> userlist;
    adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleract);
        initData();
        initRecyclerView();

    }
    public void sendMessage(View view) {
        Intent intent = new Intent(recycleract.this,newpost.class);
        startActivity(intent);
    }
    private void initData() {
        userlist=new ArrayList<>();
        userlist.add(new modelclass(R.drawable.photo,"https://drive.google.com/file/d/1JUXzEpAFRF_UkaLakr4LmjPM__4HjwOS/view?usp=sharing"));
        userlist.add(new modelclass(R.drawable.galileo,"https://drive.google.com/file/d/1JdfdfdfXzEpAFRF_UkaLakr4LmjPM__4HjwOS/view?"));
        userlist.add(new modelclass(R.drawable.hubble,"https://drive.google.com/file/d/1JdfjgdjdfdfXzEpAFRF_Ukkr4LmjPM__4HjwOS/view?"));
        userlist.add(new modelclass(R.drawable.dart,"https://drive.google.com/file/d/1JmanasfdfXzEpAFRF_Ukakr4LmjPM__4HjwOS/view?"));

    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new adapter(userlist);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}