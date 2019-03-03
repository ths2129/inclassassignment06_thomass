package com.example.inclassassignment06_thomass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Animal_Answer extends AppCompatActivity {

    TextView animal, home;
    String theAnimalName, theAnimalHome;

    Spinner choice;
    String habitat;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal__answer);

        Toast.makeText(Animal_Answer.this, "Here is your animal!", Toast.LENGTH_LONG).show();

        animal = findViewById(R.id.the_animal);


        theAnimalName = getIntent().getExtras().getString("answer");

        animal.setText(theAnimalName);


        home = findViewById(R.id.the_home);
        theAnimalHome = getIntent().getExtras().getString("home");
        home.setText(theAnimalHome + " is the animal's home");

    }

/*        animalName = getIntent().getExtras().getString("animal");
        animal.setText("Animal name is:" + animalName);

        //animalLegs = getIntent().getExtras().getInt("legs");
        animalLegs = getIntent().getExtras().getString("legs");
        legs.setText("Number of legs is: " + legs);

        animalInfo = getIntent().getExtras().getString("info");
        info.setText(animalInfo);

        //yesFur = getIntent().getExtras().getString("check");
       // yes.setText(yesFur);
        yesFur = this.getIntent().getBooleanExtra("furs", false);
        String beer = Boolean.toString(yesFur);
        //yesFur.getText(beer);

    }

      public void Name(View view){

        }*/

}
