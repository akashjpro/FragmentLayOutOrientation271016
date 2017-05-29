package com.example.akashjpro.fragmentlayoutorientation271016;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TruyenDuLieu{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void nhanSach(Book book) {
        FragmentBookDetail fragmentBookDetail = (FragmentBookDetail) getFragmentManager().findFragmentById(R.id.fragmentDetail);
        Configuration configuration = getResources().getConfiguration();

        if (fragmentBookDetail != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            fragmentBookDetail.GanGiaTri(book);
        }else {
            Intent intent = new Intent(MainActivity.this, BookDetail.class);
            intent.putExtra("objectSach", book);
            startActivity(intent);
        }

    }



    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
}
