package com.example.healthierlifestyle;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ViewHolder> {

    private TypedArray imagesE;
    private String[] levels;
    private int lineLayout;
    private Context eContext;

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView ePic;
        public TextView myLevel;

        public ViewHolder(View itemView){
            super(itemView);
            ePic=(ImageView) itemView.findViewById(R.id.exerciseImage);
            myLevel=(TextView) itemView.findViewById(R.id.exerciseLevel);
        }
    }

    public ExerciseAdapter(TypedArray imagesE,String[] levels,int lineLayout,Context econtext){
        this.imagesE=imagesE;
        this.levels=levels;
        this.lineLayout=lineLayout;
        this.eContext=econtext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(lineLayout,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder,int i){
        viewHolder.ePic.setImageResource(imagesE.getResourceId(i,-1));
        viewHolder.myLevel.setText(levels[i]);
        viewHolder.myLevel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(eContext,DetailsExercises.class);
                intent.putExtra("level", levels[i]);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount(){
        return levels==null ? 0 : levels.length;
    }
}
