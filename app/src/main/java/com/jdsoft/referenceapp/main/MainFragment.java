package com.jdsoft.referenceapp.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jdsoft.referenceapp.R;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * Created by Joe on 07/02/2018.
 */

public class MainFragment extends Fragment {

    @Inject
    ReferenceViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
