package com.gcit.todo_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.gcit.todo_4.REPLY";
    private TextView mtextView;
    private EditText mEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);
    }

    public void reply(View view) {
        mEdit = findViewById(R.id.edit_Text);
        Intent obj = new Intent(this, MainActivity.class);
        setResult(RESULT_OK,obj);
        String message = mEdit.getText().toString();
        obj.putExtra("EXTRA_REPLY", message);
        finish();
    }
}