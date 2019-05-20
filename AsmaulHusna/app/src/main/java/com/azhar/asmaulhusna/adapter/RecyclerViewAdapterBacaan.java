package com.azhar.asmaulhusna.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.azhar.asmaulhusna.ActivityAsmaulHusna;
import com.azhar.asmaulhusna.R;
import com.codesgood.views.JustifiedTextView;

import java.util.List;

/**
 * Created by Azhar Rivaldi on 19/05/19.
 */

public class RecyclerViewAdapterBacaan extends RecyclerView.Adapter<RecyclerViewAdapterBacaan.RecyclerViewHolder>{
    List<ActivityAsmaulHusna.User2> values;
    Context context1;

    public RecyclerViewAdapterBacaan(Context context, List<ActivityAsmaulHusna.User2> userInformation) {
        context1 = context;
        values = userInformation;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_layout_bacaan, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, final int position) {
        holder.bacaan.setText(values.get(position).getBacaan());
        holder.arti.setText(values.get(position).getArti());
        holder.bacaan_latin.setText(values.get(position).getBacaanLatin());
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView bacaan;
        JustifiedTextView arti, bacaan_latin;
        CardView cardView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            bacaan = (TextView)itemView.findViewById(R.id.tv_bacaan);
            arti = (JustifiedTextView) itemView.findViewById(R.id.tv_arti);
            bacaan_latin = (JustifiedTextView) itemView.findViewById(R.id.tv_bacaan_latin);
            cardView = (CardView)itemView.findViewById(R.id.card_view);
        }

        @Override
        public void onClick(View view) {

        }
    }
}