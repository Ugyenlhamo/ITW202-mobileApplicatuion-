package gcit.edu.todo_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mOperand1;
    private EditText mOperand2;
    private EditText mResult;
    private Calculator mcalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOperand1 = findViewById(R.id.editTextOperand1);
        mOperand2 = findViewById(R.id.editTextOperand2);
        mResult = findViewById(R.id.editTextResult);

        mcalculator = new Calculator();
    }

    public void add(View view) {
        String operand1 = mOperand1.getText().toString();
        String operand2 = mOperand2.getText().toString();

        double value = mcalculator.add(Double.valueOf(operand1),Double.valueOf(operand2));
        mResult.setText(String.valueOf(value));
    }

    public void subtract(View view) {
        String operand1 = mOperand1.getText().toString();
        String operand2 = mOperand2.getText().toString();

        double value = mcalculator.sub(Double.valueOf(operand1),Double.valueOf(operand2));
        mResult.setText(String.valueOf(value));
    }

    public void divide(View view) {
        String operand1 = mOperand1.getText().toString();
        String operand2 = mOperand2.getText().toString();

        double value = mcalculator.div(Double.valueOf(operand1),Double.valueOf(operand2));
        mResult.setText(String.valueOf(value));
    }

    public void multiply(View view) {
        String operand1 = mOperand1.getText().toString();
        String operand2 = mOperand2.getText().toString();

        double value = mcalculator.mul(Double.valueOf(operand1),Double.valueOf(operand2));
        mResult.setText(String.valueOf(value));
    }
}