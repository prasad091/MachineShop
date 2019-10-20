package com.acceedo.machineshop.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.acceedo.machineshop.R;

import butterknife.ButterKnife;

public class ReportFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_report_master,container,false);
        ButterKnife.bind(this,view);

        return view;
    }

    public static Fragment newInstance(String s) {
        ReportFragment f = new ReportFragment();
        Bundle b = new Bundle();
        b.putString("msg", s);

        f.setArguments(b);
        return f;


    }

}
