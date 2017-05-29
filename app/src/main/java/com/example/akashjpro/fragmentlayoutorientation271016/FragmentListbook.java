package com.example.akashjpro.fragmentlayoutorientation271016;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Akashjpro on 10/27/2016.
 */

public class FragmentListbook extends ListFragment {

    ArrayList<Book> arrayBook;
    BookAdapter bookAdapter;
    TruyenDuLieu duLieu;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_book, container, false);
        duLieu = (TruyenDuLieu) getActivity();

        arrayBook = new ArrayList<>();
        arrayBook.add(new Book("Lap trinh IOS", 80000, 200, "Lap trinh"));
        arrayBook.add(new Book("Lap trinh Android", 10000, 500, "Lap trinh"));
        arrayBook.add(new Book("Lap trinh Web", 200000, 1000, "Lap trinh"));
        arrayBook.add(new Book("Lap trinh Game", 150000, 730, "Lap trinh"));
        arrayBook.add(new Book("Lap trinh Game", 150000, 730, "Lap trinh"));
        arrayBook.add(new Book("Lap trinh Game", 150000, 730, "Lap trinh"));
        arrayBook.add(new Book("Lap trinh Game", 150000, 730, "Lap trinh"));
        arrayBook.add(new Book("Lap trinh Game", 150000, 730, "Lap trinh"));
        arrayBook.add(new Book("Lap trinh Game", 150000, 730, "Lap trinh"));
        arrayBook.add(new Book("Lap trinh Game", 150000, 730, "Lap trinh"));

        bookAdapter = new BookAdapter(getActivity(), R.layout.new_book, arrayBook);
        setListAdapter(bookAdapter);
        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        duLieu.nhanSach(arrayBook.get(position));
    }
}
