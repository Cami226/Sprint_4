package com.bootcamp.sprintcuatro;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import com.bootcamp.sprintcuatro.databinding.FragmentVideoBinding;

public class VideoFragment extends Fragment {
    FragmentVideoBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentVideoBinding.inflate(inflater, container, false);

        binding.video.getSettings().setJavaScriptEnabled(true);

        binding.video.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView web, WebResourceRequest request) {
                return false;
            }
        });

        binding.video.loadUrl("https://youtu.be/eL8ZXbj1Qx0?si=H4yQPjdPoGyUEkHN");

        return binding.getRoot();



    }
    }

