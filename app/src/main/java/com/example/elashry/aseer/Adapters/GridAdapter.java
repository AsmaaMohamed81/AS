package com.example.elashry.aseer.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.elashry.aseer.R;

/**
 * Created by elashry on 7/5/2017.
 */

public class GridAdapter extends BaseAdapter {

    private Context context;
    private final String[] gridValues;

    //Constructor to initialize values
    public GridAdapter(Context context, String[ ] gridValues) {

        this.context        = context;
        this.gridValues     = gridValues;
    }

    @Override
    public int getCount() {

        // Number of times getView method call depends upon gridValues.length
        return gridValues.length;
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }


    // Number of times getView method call depends upon gridValues.length

    public View getView(int position, View convertView, ViewGroup parent) {

        // LayoutInflator to call external grid_item.xml file

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(context);

            // get layout from grid_item.xml ( Defined Below )

            gridView = inflater.inflate( R.layout.grid_item , null);

            // set value into textview

            TextView textView = (TextView) gridView
                    .findViewById(R.id.grid_item_label);

            textView.setText(gridValues[position]);

            // set image based on selected text

            ImageView imageView = (ImageView) gridView
                    .findViewById(R.id.grid_item_image);

            String arrLabel = gridValues[ position ];

            if (arrLabel.equals("رياضى")) {

                imageView.setImageResource(R.drawable.aaa);

            } else if (arrLabel.equals("ثقافى")) {

                imageView.setImageResource(R.drawable.reading);

            } else if (arrLabel.equals("اجتماعى")) {

                imageView.setImageResource(R.drawable.classroom);

            } else {

                imageView.setImageResource(R.drawable.parents);
            }

        } else {

            gridView = (View) convertView;
        }

        return gridView;
    }
}