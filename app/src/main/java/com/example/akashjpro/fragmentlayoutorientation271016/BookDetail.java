package com.example.akashjpro.fragmentlayoutorientation271016;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BookDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        Intent intent = getIntent();
        Book book = (Book) intent.getSerializableExtra("objectSach");

        FragmentBookDetail fragmentBookDetail = (FragmentBookDetail) getFragmentManager().findFragmentById(R.id.fragmentDetailActivity);
        fragmentBookDetail.GanGiaTri(book);
    }
}
