package com.example.healthierlifestyle;

import android.content.Context;

import android.content.Intent;
import android.content.res.TypedArray;
import android.icu.text.CaseMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {
    private TypedArray images;
    private String[] titles;
    private String[] cookTime;
    private int[] ingredientNum;
    private int rowLayout;
    private Context pContext;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView pic;
        public TextView title;
        public TextView time;
        public TextView num;

        public ViewHolder(View itemView){
            super(itemView);
            pic=(ImageView) itemView.findViewById(R.id.picture);
            title=(TextView) itemView.findViewById(R.id.titl);
            time=(TextView) itemView.findViewById(R.id.tim);
            num=(TextView) itemView.findViewById(R.id.number);
        }
    }

    public myAdapter(TypedArray images,String[] titles,String[] cookTime,int[] ingredientNum,int rowLayout,Context context){
        this.images=images;
        this.titles=titles;
        this.cookTime=cookTime;
        this.ingredientNum=ingredientNum;
        this.rowLayout=rowLayout;
        this.pContext=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup,int i){
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i){

    viewHolder.pic.setImageResource(images.getResourceId(i,-1));
    viewHolder.title.setText(titles[i]);
    viewHolder.time.setText(cookTime[i]);
    viewHolder.num.setText(String.valueOf(ingredientNum[i]));

    viewHolder.pic.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent=new Intent(pContext, DetailsRecipes.class);
            intent.putExtra("title", titles[i]);
            Log.d("TitleDebug", "Title sent: Chicken stroganoff");
            v.getContext().startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount(){
        return images==null ? 0:images.length();
    }
}
