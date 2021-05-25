package com.gcit.practise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int Count = 0;
    private Button buttoncount;
    private TextView showcount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttoncount = findViewById(R.id.button);
        showcount = findViewById(R.id.textView);

    }
    public void count(View view){
        Count++;
        if(showcount != null){
            showcount.setText(Integer.toString(Count));
        }
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("count", Count);

    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
        Count = saveInstanceState.getInt("count", 0 );
        showcount.setText("" + Count);
    }

}