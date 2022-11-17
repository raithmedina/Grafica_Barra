package com.example.vistagraficosejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Data> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dataList=new ArrayList<>();
        dataList.add(new Data("Name1",50,"1"));
        dataList.add(new Data("Name2",70,"2"));
        dataList.add(new Data("Name3",60,"3"));
        dataList.add(new Data("Name4",20,"4"));
        dataList.add(new Data("Name5",50,"5"));
        dataList.add(new Data("Name6",90,"6"));
        dataList.add(new Data("Name7",10,"7"));
        dataList.add(new Data("Name8",20,"8"));

        setContentView(R.layout.activity_main);
        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.linearLayout);
        linearLayout1.addView(new BarChart(this,dataList));

    }
}