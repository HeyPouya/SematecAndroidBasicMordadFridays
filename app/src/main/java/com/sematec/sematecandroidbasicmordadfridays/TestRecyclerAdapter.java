package com.sematec.sematecandroidbasicmordadfridays;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestRecyclerAdapter extends RecyclerView.Adapter<TestRecyclerAdapter.TestRecyclerViewHolder> {

    ArrayList<String> myList;

    TestRecyclerAdapter(ArrayList<String> list){
       myList = list;
    }

    @NonNull
    @Override
    public TestRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        TestRecyclerViewHolder holder = new TestRecyclerViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestRecyclerViewHolder holder, int position) {

        String name = myList.get(position);
        holder.txtName.setText(name);

    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    class TestRecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView txtName;


        public TestRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}
