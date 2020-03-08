package com.example.fragmentwithrv;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ShoesDetail extends AppCompatActivity {
    ImageView ivShoes;
    TextView tvName, tvDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoes_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ivShoes = findViewById(R.id.shoes_img);
        tvName = findViewById(R.id.shoes_tv_nama);
        tvDesc = findViewById(R.id.shoes_tv_deskripsi);
        getIncomingIntent();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void getIncomingIntent() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int getImg = bundle.getInt("img_url");
            String getName = bundle.getString("title");
            String getDesc = bundle.getString("detail");

            tvName.setText(getName);
            tvDesc.setText(getDesc);
            ivShoes.setImageResource(getImg);
        } else {
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }
}
