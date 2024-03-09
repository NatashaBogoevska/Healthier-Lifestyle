package com.example.healthierlifestyle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;

public class Recipes extends Home {

    RecyclerView pRecyclerView, cRecyclerView;
    myAdapter pAdapter, cAdapter;

    String[] titles=null;
    String[] cookTime=null;
    int[] ingredientNum=null;
    TypedArray images=null;

    String[] titlesc=null;
    String[] cookTimec=null;
    int[] ingredientNumc=null;
    TypedArray imagesc=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        pRecyclerView=(RecyclerView) findViewById(R.id.listProtein);
        pRecyclerView.setHasFixedSize(true);
        cRecyclerView=(RecyclerView) findViewById(R.id.listLowCalorie);
        cRecyclerView.setHasFixedSize(true);

        LinearLayoutManager pLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager cLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        pRecyclerView.setLayoutManager(pLayoutManager);
        cRecyclerView.setLayoutManager(cLayoutManager);

        pRecyclerView.setItemAnimator(new DefaultItemAnimator());
        cRecyclerView.setItemAnimator(new DefaultItemAnimator());

        images=getResources().obtainTypedArray(R.array.images);
        titles=getResources().getStringArray(R.array.titles);
        cookTime=getResources().getStringArray(R.array.cookTime);
        ingredientNum=getResources().getIntArray(R.array.ingredientNum);

        imagesc=getResources().obtainTypedArray(R.array.imagesc);
        titlesc=getResources().getStringArray(R.array.titlesc);
        cookTimec=getResources().getStringArray(R.array.cookTimec);
        ingredientNumc=getResources().getIntArray(R.array.ingredientNumc);

        pAdapter=new myAdapter(images,titles,cookTime,ingredientNum,R.layout.my_row,this);
        cAdapter=new myAdapter(imagesc,titlesc,cookTimec,ingredientNumc,R.layout.my_row,this);

        pRecyclerView.setAdapter(pAdapter);
        cRecyclerView.setAdapter(cAdapter);


    }
}