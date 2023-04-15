package com.practicemvvm.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.practicemvvm.models.ModelClass;

import java.util.ArrayList;
import java.util.List;

public class ResAdapter extends RecyclerView.Adapter<ResAdapter.ViewHolderClass> {
    ArrayList<ModelClass>modelClasses;
    Context context;

    public ResAdapter(ArrayList<ModelClass> modelClasses, Context context) {
        this.modelClasses = modelClasses;
        this.context = context;
    }

    public void updateMovieList(ArrayList<ModelClass> list){
        this.modelClasses=list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {

    }

    @Override
    public int getItemCount() {
        return modelClasses.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder{

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
        }
    }
}
