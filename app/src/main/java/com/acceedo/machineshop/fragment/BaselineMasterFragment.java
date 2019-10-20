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

import butterknife.BindView;
import butterknife.ButterKnife;

public class BaselineMasterFragment extends Fragment {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_basleine,container,false);
        ButterKnife.bind(this,view);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));

        return view;
    }

    public static Fragment newInstance(String s) {
        BaselineMasterFragment f = new BaselineMasterFragment();
        Bundle b = new Bundle();
        b.putString("msg", s);

        f.setArguments(b);
        return f;


    }
}
