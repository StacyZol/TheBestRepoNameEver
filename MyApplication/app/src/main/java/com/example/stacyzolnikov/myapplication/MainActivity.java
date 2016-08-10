package com.example.stacyzolnikov.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Actor> mActorList;
    ActorBaseAdapter mAdapter;
    ListView mLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mActorList = new ArrayList<>();
        mAdapter = new ActorBaseAdapter(mActorList);
        mLv = (ListView) findViewById(R.id.lv);

        mLv.setAdapter(mAdapter);

    }
}
