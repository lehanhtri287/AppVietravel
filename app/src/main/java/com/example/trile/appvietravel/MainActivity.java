package com.example.trile.appvietravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<TourInfo> infoList;
    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        infoList = new ArrayList<>();
        infoList.add(new TourInfo("Cáp treo Bà Nà", R.drawable.family_time));
        infoList.add(new TourInfo("Đà Lạt", R.drawable.family_time));
        infoList.add(new TourInfo("Sapa - Cao Bằng - Bắc Kạn", R.drawable.family_time));
        infoList.add(new TourInfo("Nha Trang Vinpearl Land", R.drawable.family_time));
        infoList.add(new TourInfo("Quảng Ngãi - Lý Sơn", R.drawable.family_time));

        adapter = new RecyclerAdapter(this, infoList);
        recyclerView.setAdapter(adapter);
    }
}
