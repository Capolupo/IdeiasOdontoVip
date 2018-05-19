package com.company.hiro.sandbox.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.company.hiro.sandbox.R;
import com.company.hiro.sandbox.customclass.GriwViewAdapter;
import com.company.hiro.sandbox.customclass.StaticClass;
import com.company.hiro.sandbox.customclass.itemGridView;

/**
 * A simple {@link Fragment} subclass.
 */
public class GridViewFragment extends Fragment {

    public GridView mainGrid;
    public itemGridView[] itemGridViewList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_grid_view, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mainGrid = (GridView) view.findViewById(R.id.mainGrid);

        itemGridView view1 = new itemGridView("Primeiro Item", R.drawable.calendar);
        itemGridView view2 = new itemGridView("Segundo Item", R.drawable.family_time);
        itemGridView view3 = new itemGridView("Terceiro Item", R.drawable.friends);
        itemGridView view4 = new itemGridView("Quarto Item", R.drawable.team_time);
        itemGridView view5 = new itemGridView("Quinto Item", R.drawable.me_time);


        itemGridViewList = new itemGridView[] {view1, view2, view3, view4, view5};
        mainGrid.setAdapter(new GriwViewAdapter(getActivity(), itemGridViewList));

        StaticClass.toast(getContext(), "Grid", false);
    }
}
