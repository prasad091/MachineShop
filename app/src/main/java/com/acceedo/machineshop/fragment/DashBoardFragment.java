package com.acceedo.machineshop.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.acceedo.machineshop.R;
import com.acceedo.machineshop.adapter.ProductAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DashBoardFragment extends Fragment {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashbaord,container,false);
        ButterKnife.bind(this,view);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        List<String> list = new ArrayList<>();
        list.add("JSIR");
        list.add("ISIR");
        list.add("PDIR");
        list.add("PMS");
        list.add("PIR");
        list.add("SUCCESS");
        recyclerView.setAdapter(new ProductAdapter(getActivity(),list));
        return view;
    }

    public static Fragment newInstance(String s) {
        DashBoardFragment f = new DashBoardFragment();
        Bundle b = new Bundle();
        b.putString("msg", s);

        f.setArguments(b);
        return f;


    }
}
