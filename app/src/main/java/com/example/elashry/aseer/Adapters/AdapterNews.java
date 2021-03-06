package com.example.elashry.aseer.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.elashry.aseer.Activities.Detail;
import com.example.elashry.aseer.Activities.News;
import com.example.elashry.aseer.R;
import com.example.elashry.aseer.dataProccess.DataEncap;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class AdapterNews extends RecyclerView.Adapter<AdapterNews.ViewHolder> implements View.OnClickListener {

    ArrayList<DataEncap> arrayList;
    Context context;
    News news;

    DataEncap encap = new DataEncap();

    public AdapterNews(ArrayList<DataEncap> arrayList, Context context, News news) {
        this.arrayList = arrayList;
        this.context = context;
        this.news = news;
    }

    @Override
    public AdapterNews.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);

        ViewHolder viewHolder = new ViewHolder(layout);
        return viewHolder;
    }
/*

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }
*/

    @Override
    public void onBindViewHolder(AdapterNews.ViewHolder holder, int position) {
        encap = arrayList.get(position);

        holder.cardView.setTag(position);

        holder.textTitle.setText(encap.getTitle());
        holder.textDesc.setText(encap.getDesc());
        holder.date.setText(encap.getDate());
        Picasso.with(context).load(encap.getImg()).into(holder.imageNews);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public void onClick(View v) {

    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CardView cardView;
        ImageView imageNews;
        TextView textTitle;
        TextView textDesc;
        TextView date;


        public ViewHolder(View layout) {
            super(layout);

            cardView = (CardView) layout.findViewById(R.id.list_row_container);
            imageNews = (ImageView) layout.findViewById(R.id.news_image);
            textTitle = (TextView) layout.findViewById(R.id.title_news);
            textDesc = (TextView) layout.findViewById(R.id.desc_news);
            date= (TextView) layout.findViewById(R.id.date_news);
            cardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            int position = (int) view.getTag();

            encap = arrayList.get(position);

            Intent intent = new Intent(news, Detail.class);

            intent.putExtra("title", encap.getTitle());
            intent.putExtra("desc", encap.getDesc());

            intent.putExtra("date", encap.getDate());
            intent.putExtra("image", encap.getImg());

            news.startActivity(intent);

        }

    }

}
