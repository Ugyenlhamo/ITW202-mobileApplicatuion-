package gcit.edu.todo_25;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DataBaseHelper myDb;
    EditText mEditFirstName, mEditSurName,mEditID,mEditMarks;
    Button mbuttonAdd,mbuttonView,mbuttonUpdate,mbuttonDelete;

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DataBaseHelper(this);

        mEditFirstName = findViewById(R.id.editTextFirstName);
        mEditSurName = findViewById(R.id.editTextLastName);
        mEditID = findViewById(R.id.editTextID);
        mEditMarks = findViewById(R.id.editTextMarks);

        mbuttonAdd = findViewById(R.id.buttonAdd);
        mbuttonView = findViewById(R.id.buttonView);
        mbuttonUpdate = findViewById(R.id.buttonUpdate);
        mbuttonDelete = findViewById(R.id.buttonDelete);


    }

    public void AddData(View view) {
                mbuttonAdd.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                boolean isInserted = myDb.insertData(mEditID.getText().toString(),
                                mEditSurName.getText().toString(),
                                        mEditFirstName.getText().toString(),
                                        mEditMarks.getText().toString());

                                if (isInserted == true)
                                    Toast.makeText(MainActivity.this ,"Data Inserted", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(MainActivity.this ,"Data Not Inserted", Toast.LENGTH_SHORT).show();

                            }
                        }
                );
    }
}