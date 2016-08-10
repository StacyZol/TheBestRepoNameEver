package com.example.stacyzolnikov.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by joshuagoldberg on 8/10/16.
 */
public class ActorBaseAdapter extends BaseAdapter {

    private ArrayList<Actor> mActorList;

    public ActorBaseAdapter (ArrayList<Actor> actorList) {
        mActorList = actorList;
    }

    @Override
    public int getCount() {
        return mActorList.size();
    }

    @Override
    public Object getItem(int i) {
        return mActorList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;

        if (view == null) {
            LayoutInflater li = LayoutInflater.from(view.getContext());
            v = li.inflate(R.layout.list_item, null);
        }

        TextView name = (TextView) v.findViewById(R.id.actorName);
        TextView dob = (TextView) v.findViewById(R.id.dob);
        TextView oscarsWon = (TextView) v.findViewById(R.id.oscarsWon);


        name.setText("Name: " + mActorList.get(i).getName());
        dob.setText("DOB: " + mActorList.get(i).getDob());
        oscarsWon.setText("Oscars won: " + mActorList.get(i).getOscarsWon());

        return v;
    }
}
