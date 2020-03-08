package com.example.fragmentwithrv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private RecyclerView rvShoes;
    private ArrayList<ShoesModel> shoesList = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvShoes = view.findViewById(R.id.activitymain_rv);
        rvShoes.setHasFixedSize(true);

        shoesList.addAll(ShoesData.getShoeList());

        showRecyclerList();
    }


    private void showRecyclerList() {
        rvShoes.setLayoutManager(new LinearLayoutManager(getActivity()));
        ShoesAdapter shoesAdapter = new ShoesAdapter(getActivity());
        shoesAdapter.setShoeList(shoesList);
        rvShoes.setAdapter(shoesAdapter);
    }
}
