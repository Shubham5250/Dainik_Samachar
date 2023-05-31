package com.example.dainik_samachar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class CustomViewHolder extends RecyclerView.ViewHolder {


    TextView textTitle, textSource;
    ImageView imageHeadline;
    CardView cardView;
    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        textTitle = itemView.findViewById(R.id.textTitle);
        textSource = itemView.findViewById(R.id.textSource);
        imageHeadline = itemView.findViewById(R.id.imageHeadline);
        cardView = itemView.findViewById(R.id.mainContainer);

    }
}
