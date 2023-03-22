package com.example.dictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchField = (EditText) findViewById(R.id.searchField);
        displayField = (TextView) findViewById(R.id.displayField);
        Button button = (Button)findViewById(R.id.lookupButton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String word = searchField.getText().toString();
                displayField.setText(map.get(word));

                map.put("Absence", "The lack or unavailability of something or someone");
                map.put("Approval", "Having a positive opinion of something or someone");
                map.put("Attention", "Noticing or recognizing something of interest");
                map.put("Banish", "Expel from the situation, often done officially");
                map.put("Care", "extra responsibility and attention");
                map.put("Chip", "a small and thin piece of a larger item");
                map.put("Cease","to eventually stop existing");
                map.put("Decisive", "a person who can make decisions promptly");
                map.put("Eloquent", "an individual who expresses themselves effectively and clearly");
                map.put("Feasible", " an activity that is possible");
                map.put("Feeble", "a person or statement that is unconvincing and weak");
                map.put("Generic", "a group or class that does not have a brand name");
                map.put("Gimmick", "a device or trick delivered to attract attention");
                map.put("Jovial", "a cheerful, merry and good-natured person");
                map.put("Jubilant", "a person or crowd that is full of delight and high spirits.");
            }
        });
    }
}
