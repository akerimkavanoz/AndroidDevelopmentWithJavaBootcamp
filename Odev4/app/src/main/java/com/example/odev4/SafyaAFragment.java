package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentSafyaABinding;


public class SafyaAFragment extends Fragment {
    private FragmentSafyaABinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSafyaABinding.inflate(inflater, container, false);
        binding.buttonBGit.setOnClickListener(v -> {
           Navigation.findNavController(v).navigate(R.id.gecisB);
        });

        return binding.getRoot();
    }
}