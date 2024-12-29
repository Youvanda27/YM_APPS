package com.makeup.ym_apps;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        // Temukan tombol berdasarkan ID
        Button button2 = findViewById(R.id.button2);

        // Tambahkan OnClickListener untuk navigasi
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register_page.this, home_page.class);
                startActivity(intent);
            }
        });
    }
}
