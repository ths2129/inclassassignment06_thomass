package com.example.inclassassignment06_thomass;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    Spinner choice;
    ArrayAdapter<CharSequence> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        Spinner spinner1 = (Spinner) findViewById(R.id.animal_habitat);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.habitat, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
    }

    public void CatFace(View view) {
        CheckBox fur = findViewById(R.id.fur);
        boolean hasFur = fur.isChecked();

        EditText animalName = findViewById(R.id.animal_name);
        String hasName = animalName.getText().toString();

        EditText animalLegs = findViewById(R.id.animal_legs);
        String hasLegs = animalLegs.getText().toString();

        EditText info = findViewById(R.id.additional_info);
        String hasInfo = info.getText().toString();

        Spinner hasChoice = findViewById(R.id.animal_habitat);

        String theResults = AnimalResults(hasName, hasLegs, hasFur, hasInfo);

        Intent newActivity = new Intent(MainActivity.this, Animal_Answer.class);
        newActivity.putExtra("answer", theResults);
        newActivity.putExtra("home",String.valueOf(hasChoice.getSelectedItem()));
        startActivity(newActivity);

        //Intent homeActivity = new Intent(MainActivity.this, Animal_Answer.class);
       // homeActivity.putExtra("home",String.valueOf(hasChoice.getSelectedItem()));
       // startActivity(homeActivity);



    }


    private String AnimalResults(String animalName, String hasLegs, boolean hasFur, String moreInfo) { //A method with one locacl variable that is returned with the global variable
        String animalOutcome = "Name: " + animalName;
        animalOutcome = animalOutcome + "\n" + animalName + " has " + hasLegs + " legs";
        animalOutcome = animalOutcome + "\nHas fur: " + hasFur;
        animalOutcome = animalOutcome + "\nAdditional Information: " + moreInfo;
        return animalOutcome;


}}


/*        cat = findViewById(R.id.cat_button);
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent(MainActivity.this, Animal_Answer.class);
                TextView animalName = (TextView) findViewById(R.id.animal_name);
                TextView animalLegs = (TextView) findViewById(R.id.animal_legs);
                TextView animalInfo = (TextView) findViewById(R.id.additional_info);
                CheckBox animalFur = (CheckBox) findViewById(R.id.fur);

                boolean animalFurs = ((CheckBox) findViewById(R.id.fur)).isChecked();

                String animal = animalName.getText().toString();
                String legs = animalLegs.getText().toString();
                String info = animalInfo.getText().toString();
                boolean animalFur = animalFurs.

                result.putExtra("animal", animal);
                result.putExtra("legs", legs);
                result.putExtra("info", info);
                result.getBooleanExtra("furs", animalFurs);
                startActivity(result);
                finish();
            }
        });*/



