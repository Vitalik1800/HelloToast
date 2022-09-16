package com.lab3.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    TextView show_count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show_count = findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG).show();
    }

    public void countUp(View view) {
        count++;
        show_count.setText(String.valueOf(count));
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG).show();
    }
}