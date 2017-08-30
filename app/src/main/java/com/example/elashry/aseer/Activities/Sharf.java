package com.example.elashry.aseer.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.elashry.aseer.Adapters.RecycleAdapter;
import com.example.elashry.aseer.Models.ListRecycle;
import com.example.elashry.aseer.R;

import java.util.ArrayList;
import java.util.List;

public class Sharf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharf);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        List<ListRecycle> movies=new ArrayList<>();

        int posters[] = {R.drawable.boy, R.drawable.girl,
                R.drawable.boy, R.drawable.girl,R.drawable.boy, R.drawable.girl};

        String movienames[] = {"حسين عبد القادر", "فريده حسين", "ايه محمد", "نسمه احمد","محمد محمود", "مالك علاء"};

        String moviesRates[] = {"", "", "", "", "", ""};

        String moviesStories[] = { "الاول" ,"الثاني" , "الثالث" ,"الاول" ,"الثاني" ,"الثالث"};
        for(int i=0;i<posters.length;i++){
            ListRecycle movie = new ListRecycle(movienames[i],moviesRates[i],moviesStories[i],posters[i]);
            movies.add(movie);


        }

        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleAdapter Adapter= new RecycleAdapter(movies);
        recyclerView.setAdapter(Adapter);
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
