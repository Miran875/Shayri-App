package com.imran.shayriapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.imran.shayriapp.adapter.CategoryAdapter;
import com.imran.shayriapp.model.CategoryModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<CategoryModel>list;
    CategoryAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.categoryRecycler);
                list = new ArrayList<>();

        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        list.add(new CategoryModel(R.drawable.kashmir,"Motivational Shayri"));
        list.add(new CategoryModel(R.drawable.kashmir,"Sad Shayri"));
        list.add(new CategoryModel(R.drawable.kashmir,"Love Shayri"));
        list.add(new CategoryModel(R.drawable.kashmir,"Family Shayri"));
        list.add(new CategoryModel(R.drawable.kashmir,"Freindship Shayri"));
        list.add(new CategoryModel(R.drawable.kashmir,"Fun Shayri"));

        adapter = new CategoryAdapter(this,list);
        recyclerView.setAdapter(adapter);
    }
}