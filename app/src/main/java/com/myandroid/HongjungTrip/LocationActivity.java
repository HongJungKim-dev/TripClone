package com.myandroid.HongjungTrip;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LocationActivity extends AppCompatActivity {

    private ArrayList<LocationData> arrayList;
    private LocationAdapter mainAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    Toolbar toolbar;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false); //기본 제목을 없애기
        actionBar.setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.rv);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList = new ArrayList<>();

        mainAdapter = new LocationAdapter(arrayList); //mainAdapter로 생성된 것들을 arrayList에 담아주기
        recyclerView.setAdapter(mainAdapter);


        LocationData mainData1 = new LocationData("홍천", R.mipmap.ic_launcher);
        arrayList.add(mainData1);

        LocationData mainData2 = new LocationData("남이섬", R.mipmap.ic_launcher);
        arrayList.add(mainData2);

        LocationData mainData3 = new LocationData("여수", R.mipmap.ic_launcher);
        arrayList.add(mainData3);

        LocationData mainData4 = new LocationData("정동진", R.mipmap.ic_launcher);
        arrayList.add(mainData4);

        LocationData mainData5 = new LocationData("강릉", R.mipmap.ic_launcher);
        arrayList.add(mainData5);

        LocationData mainData6 = new LocationData("제주도", R.mipmap.ic_launcher);
        arrayList.add(mainData6);

        LocationData mainData7 = new LocationData("부산", R.mipmap.ic_launcher);
        arrayList.add(mainData7);

        LocationData mainData8 = new LocationData("인천", R.mipmap.ic_launcher);
        arrayList.add(mainData8);

        mainAdapter.notifyDataSetChanged();


    }
}
