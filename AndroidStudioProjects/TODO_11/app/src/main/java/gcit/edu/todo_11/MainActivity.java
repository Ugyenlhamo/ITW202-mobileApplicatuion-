package gcit.edu.todo_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView mtextView;
    private  String [] array = {"purple_200","purple_700","purple_500", "teal_700","teal_200","red","pink","green","yellow","purple"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextView = findViewById(R.id.textView);
    }

    public void changeColor(View view) {
        Random random = new Random();
        String colorN = array[random.nextInt(10)];

        int colorRes = getResources().getIdentifier(colorN, "color", getApplicationContext().getPackageName());
        //int colorResources = getResources().getColor(colorRes,this.getTheme());

        int colorName = ContextCompat.getColor(this,colorRes);
        mtextView.setTextColor(colorName);
    }
}