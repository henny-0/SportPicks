package com.example.sportpicks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup sportsRadioGroup;
        sportsRadioGroup = findViewById(R.id.sportsRadioGroup);
        Button submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = sportsRadioGroup.getCheckedRadioButtonId();

                if (selectedId != -1) {
                    RadioButton selectedRadioButton = findViewById(selectedId);
                    String selectedSport = selectedRadioButton.getText().toString();
                    displayConfirmation(selectedSport);
                } else {
                    Toast.makeText(MainActivity.this, "Please select a sport.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void displayConfirmation(String sport) {
        // Display a confirmation dialog or activity with the chosen sport
        Toast.makeText(MainActivity.this, "Your favorite sport is " +
                "" + sport, Toast.LENGTH_SHORT).show();
    }
}