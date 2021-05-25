package com.gcit.todo_7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int Count=0;
    private TextView showcount;
    private Button buttoncount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showcount = findViewById(R.id.textView);
        buttoncount = findViewById(R.id.button);


    }

    public void count(View view) {
        Count++;
        if (showcount!=null){
            showcount.setText(Integer.toString(Count));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", Count);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Count= savedInstanceState.getInt("count", 0);
        showcount.setText("" + Count);
    }
}