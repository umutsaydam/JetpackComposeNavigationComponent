package com.example.jetpacknavigationcomponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Diğer Fragment'lara/aktivitelere ulaşmak için NavController kullanılır.
        NavController navController = Navigation.findNavController(view);

        Button btnShowSecondFragment = view.findViewById(R.id.btnShowSecondFragment);
        btnShowSecondFragment.setOnClickListener(view1 -> {
            //navigate komutu ile hedef nokta yüklenir.
            navController.navigate(R.id.action_firstFragment_to_secondFragment);
        });
    }
}