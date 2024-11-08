package com.bootcamp.sprintcuatro;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;

import com.bootcamp.sprintcuatro.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    Intent intent;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAbrir.setOnClickListener(view1 -> {
            intent = new Intent(view1.getContext(), second_activity_final.class);
            view1.getContext().startActivity(intent);
        });

    }
}
