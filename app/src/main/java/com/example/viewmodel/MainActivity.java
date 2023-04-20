package com.example.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.os.Bundle;
import com.example.viewmodel.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {
    Context context ;
    private ActivityMainBinding binding;
    private MainViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        context = getApplicationContext();
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setViewMod(viewModel);
        binding.button.setOnClickListener((v) -> {
            viewModel.check(context,String.valueOf(binding.editTextTextPersonName.getText()));
        });
        binding.setLifecycleOwner(this);
        viewModel.shuffle();

    }
}