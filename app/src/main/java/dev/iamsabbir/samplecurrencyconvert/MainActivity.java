package dev.iamsabbir.samplecurrencyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText input1,input2;
    private boolean keepChangingText = true;
    private double identifier = 84.53;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);


        input1.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {

                if (input1.getText().toString().equals("")) {

                }
                else {
                    double number1 = Double.valueOf(input1.getText().toString());
                    double number2 = number1 * identifier;
                    if (keepChangingText) {
                        keepChangingText = false;
                        input2.setText(String.valueOf(number2));
                    } else {
                        keepChangingText = true;
                    }
                }
            }
        });

        input2.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {

                if (input2.getText().toString().equals("")) {

                }
                else {
                    double number2 = Double.valueOf(input2.getText().toString());
                    double number1 = number2 / identifier;
                    if (keepChangingText) {
                        keepChangingText = false;
                        input1.setText(String.valueOf(number1));
                    } else {
                        keepChangingText = true;
                    }

                }
            }
        });
    }
}