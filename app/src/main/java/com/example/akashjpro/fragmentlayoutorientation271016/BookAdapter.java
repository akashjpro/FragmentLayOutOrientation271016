package com.example.akashjpro.fragmentlayoutorientation271016;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Akashjpro on 10/27/2016.
 */

public class BookAdapter extends BaseAdapter {

    Activity context;
    int layout;
    ArrayList<Book> arrayBook;

    public BookAdapter(Activity context, int layout, ArrayList<Book> arrayBook) {
        this.context = context;
        this.layout = layout;
        this.arrayBook = arrayBook;
    }

    @Override
    public int getCount() {
        return arrayBook.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayBook.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = this.context.getLayoutInflater();
        convertView = inflater.inflate(this.layout, null);

        ImageView hinh = (ImageView) convertView.findViewById(R.id.imageView);
        TextView ten = (TextView) convertView.findViewById(R.id.textViewSach);

        hinh.setImageResource(R.drawable.books);
        ten.setText(arrayBook.get(position).getTen());
        return convertView;
    }
}
