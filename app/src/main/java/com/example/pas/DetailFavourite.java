package com.example.pas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;

public class DetailFavourite extends AppCompatActivity {

    Bundle extras;
    String title;
    String date;
    String deskripsi;
    String path;
    String id;

    TextView tvjudulFav;
    ImageView ivposterFav;
    TextView txtdeskripsiFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_fovourite);
        extras = getIntent().getExtras();
        tvjudulFav =  findViewById(R.id.tvjudulFav);
        txtdeskripsiFav =  findViewById(R.id.txtdeskripsiFav);
        ivposterFav=  findViewById(R.id.ivposterFav);
        if (extras != null) {
            title = extras.getString("judul");
            date = extras.getString("date");
            deskripsi = extras.getString("deskripsi");
            path = extras.getString("path");
            id = extras.getString("id");
            tvjudulFav.setText(title);
            txtdeskripsiFav.setText(deskripsi);
            Glide.with(DetailFavourite.this)
                    .load(path)
                    .override(Target.SIZE_ORIGINAL)
                    .placeholder(R.mipmap.ic_launcher)
                    .into(ivposterFav);
        }
    }
}