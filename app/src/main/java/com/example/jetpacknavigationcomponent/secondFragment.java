package com.example.jetpacknavigationcomponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class secondFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);

        Button btnShowFirstFragment = view.findViewById(R.id.btnShowFirstFragment);
        btnShowFirstFragment.setOnClickListener(view1 -> {
            /*
                NavOptions tanımlamanın nedeni firstFragment'tan secondFragment'a geçtikten sonra
                pop işlemi yaparak firstFragment'a geri döner.
             */
            NavOptions navOptions = new NavOptions.Builder().setPopUpTo(R.id.firstFragment, true).build();
            navController.navigate(R.id.action_secondFragment_to_firstFragment, null, navOptions);
        });
    }
}