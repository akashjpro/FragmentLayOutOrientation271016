package com.example.akashjpro.fragmentlayoutorientation271016;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Akashjpro on 10/27/2016.
 */

public class FragmentBookDetail extends Fragment {
    TextView txtTen, txtGia, txtTrang, txtTheLoai;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.item_book, container, false);
        addControls();
        return view;
    }

    private void addControls() {
        txtTen = (TextView) view.findViewById(R.id.textViewTen);
        txtGia = (TextView) view.findViewById(R.id.textViewGia);
        txtTrang = (TextView) view.findViewById(R.id.textViewSoTrang);
        txtTheLoai = (TextView) view.findViewById(R.id.textViewTheLoai);

    }

    public void GanGiaTri(Book sach){
        txtTen.setText(sach.getTen());
        txtGia.setText("Giá: "+ sach.getGia());
        txtTrang.setText("Số trang: "+ sach.getSoTrang());
        txtTheLoai.setText("Thể loại: " + sach.getTheLoai());
    }


}
