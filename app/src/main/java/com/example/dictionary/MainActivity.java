package com.example.dictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import org.json.JSONArray;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Map<String, String> map = new HashMap<String, String>();
    private EditText searchField;
    private TextView displayField;
    String word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchField = (EditText) findViewById(R.id.searchField);
        displayField = (TextView) findViewById(R.id.displayField);
        Button button = (Button) findViewById(R.id.lookupButton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String word = searchField.getText().toString();
                displayField.setText(map.get(word));

                map.put("Lion", "Лав");
                map.put("Bird", "Птица");
                map.put("Father", "Татко");
                map.put("Mother", "Мајка");
                map.put("Brother", "Брат");
                map.put("Store", "Продавница");
                map.put("City", "Град");
                map.put("Home", "Дом");
                map.put("Love", "Љубов");
                map.put("Sun", "Сонце");
                map.put("Family", "Семејство");
                map.put("Name", "Име");
                map.put("Dog", "Куче");
                map.put("Cat", "Маче");
                

            }
        });
    }
}
