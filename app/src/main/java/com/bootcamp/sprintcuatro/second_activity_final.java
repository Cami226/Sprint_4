package com.bootcamp.sprintcuatro;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

import com.bootcamp.sprintcuatro.databinding.ActivitySecondFinalBinding;


public class second_activity_final extends AppCompatActivity {


        ActivitySecondFinalBinding binding;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second_final);
            binding = ActivitySecondFinalBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());

            binding.webView.setWebViewClient(new WebViewClient());
            binding.webView.getSettings().setJavaScriptEnabled(true);

            if (savedInstanceState == null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.videoFragmentC, new VideoFragment())
                        .commit();
            }

            binding.btnWeb.setOnClickListener(v -> {
                binding.webView.setVisibility(View.VISIBLE);
                binding.webView.loadUrl("https://yellowstonetvshop.com");

            });

            binding.btnAtras.setOnClickListener(v -> finish());
        }
    }