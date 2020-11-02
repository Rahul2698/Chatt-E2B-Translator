package com.example.chatte2btranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Find the view that shows the numbers category
        TextView numbers=(TextView)findViewById(R.id.numbers);

        //set a click_listener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open activity_numbers.xml
                Intent numbersIntent=new Intent(MainActivity.this,NumbersActivity.class);

                //start the new ACTIVITY
                startActivity(numbersIntent);
            }
        });

        //Find the view that shows the colors category
        TextView colors=(TextView)findViewById(R.id.colors);

        //set a click_listener on that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open activity_colors.xml file
                Intent colorsIntent=new Intent(MainActivity.this,ColorsActivity.class);

                //start the new activity
                startActivity(colorsIntent);
            }
        });

        //Find the view that shows the FamilyMembers category
        TextView FamilyMembers=(TextView)findViewById(R.id.family_members);

        //set a click_listener on that view
        FamilyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open activity_family_members.xml file
                Intent FamilyIntent=new Intent(MainActivity.this,FamilyMembersActivity.class);

                //start the new activity
                startActivity(FamilyIntent);
            }
        });

        //Find the view that shows the phrases category
        TextView phrases=(TextView)findViewById(R.id.phrases);

        //set a click_listener on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open activity_phrases.xml file
                Intent phraseIntent=new Intent(MainActivity.this,PhrasesActivity.class);

                //start the new activity
                startActivity(phraseIntent);
            }
        });
    }
}