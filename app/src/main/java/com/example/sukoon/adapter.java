package com.example.sukoon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.Viewholder> {

    private List<modelclass> userList;

    public adapter (List<modelclass>userList)
    {
        this.userList=userList;

    }
    @NonNull
    @Override
    public adapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);

        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        int image=userList.get(position).getTemp();
        String text=userList.get(position).getPara();
        holder.setData(image,text);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public  class  Viewholder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.temp);
            textView=itemView.findViewById(R.id.para);


        }

        public void setData(int image ,String text) {


            imageView.setImageResource(image);
        textView.setText(text);

        }
    }
}

