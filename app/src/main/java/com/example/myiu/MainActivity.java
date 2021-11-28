package com.example.myiu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View view) {
         name = findViewById(R.id.txtname);
         pass = findViewById(R.id.txtpass);
        Toast toast1 =
                Toast.makeText(getApplicationContext(),
                        "Hola "+name.getText().toString(), Toast.LENGTH_SHORT);

        toast1.show();
    }
}