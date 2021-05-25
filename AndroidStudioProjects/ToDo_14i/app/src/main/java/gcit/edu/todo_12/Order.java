package gcit.edu.todo_12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Order extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private TextView tview;
    RadioButton SameDay, NextDay, PickUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        tview = findViewById(R.id.order_textview);
        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        tview.setText(msg);
        SameDay = findViewById(R.id.radio1);
        NextDay = findViewById(R.id.radio2);
        PickUp = findViewById(R.id.radio3);
        Spinner spinner = findViewById(R.id.spinner);
        // call setOnItemselectedLister if spinner is not null
        if(spinner != null){
            spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this, R.array.spinnerDdown, android.R.layout.simple_dropdown_item_1line);
        if(spinner != null){
            spinner.setAdapter(arrayAdapter);
        }
    }


    public void displayToast(String msg){
        Toast.makeText(getApplicationContext(),msg,
                Toast.LENGTH_LONG).show();
    }
    public void radioClicked(View view) {
        boolean checked = ((RadioButton)view).isChecked();

        switch(view.getId()){
            case R.id.radio1:
                if(checked)
                    displayToast(getString(R.string.rb1));
                break;

            case R.id.radio2:
                if (checked)
                    displayToast(getString(R.string.rb2));
                break;

            case R.id.radio3:
                if (checked)
                    displayToast(getString(R.string.rb3));
                break;

            default:
                break;
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String sMsg = parent.getItemAtPosition(position).toString();
        displayToast(sMsg);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //
    }

}
