package com.example.elashry.aseer.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.elashry.aseer.R;
import com.szugyi.circlemenu.view.CircleImageView;
import com.szugyi.circlemenu.view.CircleLayout;

public class Home extends AppCompatActivity implements CircleLayout.OnItemClickListener, CircleLayout.OnRotationFinishedListener {
    protected CircleLayout circleLayout;
    //private float angle = 90;

Button out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        circleLayout = (CircleLayout) findViewById(R.id.circle);
        circleLayout.setOnItemClickListener(this);
      //  circleLayout.setOnRotationFinishedListener(this);
        out = (Button) findViewById(R.id.btn_out);
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Home.this,Login.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onItemClick(View view) {
        String name = null;
//        if (view instanceof CircleImageView) {
//            name = ((CircleImageView) view).getName();
//            // The angle where the first menu item will be drawn
//
//        }
    //   Toast.makeText(this, "select "+name, Toast.LENGTH_SHORT).show();

        switch (view.getId()) {
            case R.id.activity:
                Intent i1 =new Intent(Home.this,Anshta.class);
                startActivity(i1);
                break;
            case R.id.apsent:
                Intent i2 =new Intent(Home.this,ghyaab.class);
                startActivity(i2);
                break;
            case R.id.arrive:
                Intent i3 =new Intent(Home.this,MapsActivity.class);
                startActivity(i3);
                break;
            case R.id.rsoom:
                Intent i4 =new Intent(Home.this,Rsoom.class);
                startActivity(i4);
                break;
            case R.id.sharf:
                Intent i5 =new Intent(Home.this,Sharf.class);
                startActivity(i5);
                break;
            case R.id.state:
                Intent i6 =new Intent(Home.this,Elmstwa.class);
                startActivity(i6);
                break;
            case R.id.table:
                Intent i7 =new Intent(Home.this,Table.class);
                startActivity(i7);
                break;
            case R.id.news:
                Intent i8 =new Intent(Home.this,News.class);
                startActivity(i8);
                break;
            case R.id.homework:
                Intent i9 =new Intent(Home.this,Works.class);
                startActivity(i9);
                break;
        }
    }

    @Override
    public void onRotationFinished(View view) {
        String name = null;
//        if (view instanceof CircleImageView) {
//            name = ((CircleImageView) view).getName();
//        }
//        Toast.makeText(this, "select "+name, Toast.LENGTH_SHORT).show();

    }
}
