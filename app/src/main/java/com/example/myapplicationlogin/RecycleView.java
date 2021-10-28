package com.example.myapplicationlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class RecycleView extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerviewItemAdapter recyclerviewItemAdapter;
    private List<Items> itemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        itemsList = new ArrayList<>();
        recyclerView = (RecyclerView)findViewById(R.id.recycleView);

        recyclerviewItemAdapter = new RecyclerviewItemAdapter(itemsList);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerviewItemAdapter);

        prepareItems();
    }

    private void prepareItems(){
        Items items = new Items("Sunday");
        itemsList.add(items);
        items = new Items("Monday");
        itemsList.add(items);
        items = new Items("Tuesday");
        itemsList.add(items);
        items = new Items("Wednesday");
        itemsList.add(items);
        items = new Items("Thursday");
        itemsList.add(items);
        items = new Items("Friday");
        itemsList.add(items);
        items = new Items("Saturday");
        itemsList.add(items);
    }
}