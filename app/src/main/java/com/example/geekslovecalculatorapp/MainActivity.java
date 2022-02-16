package com.example.geekslovecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    TextView name;
    TextView result;
    Spinner s;

    int language_position;// 1 for 1st language in list 2 for 2nd...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.Name);
        result = (TextView) findViewById(R.id.Result);
        result.setText("");
        s = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        s.setOnItemSelectedListener(this);

    }

    public void calculate(View view){

        ImageView language_logo = (ImageView) findViewById(R.id.imageView);


        Random rand = new Random();
       int percentage = rand.nextInt(101);
       String answer = Integer.toString(percentage);
       language_position = s.getSelectedItemPosition();

        //language_logo.setImageResource(R.drawable.java);

       if (language_position == 0){

           language_logo.setImageResource(R.drawable.java);
           language_logo.setTranslationX(1500);
           language_logo.animate().translationXBy(-1500).rotation(3600).setDuration(1000);
           result.setText(answer + "%");
       }

       else if (language_position == 1){

           language_logo.setImageResource(R.drawable.python);
           language_logo.setTranslationX(1500);
           language_logo.animate().translationXBy(-1500).rotation(3600).setDuration(1000);
           result.setText(answer + "%");
       }

       else if (language_position == 2){

           language_logo.setImageResource(R.drawable.cplusplus);
           language_logo.setTranslationX(1500);
           language_logo.animate().translationXBy(-1500).rotation(3600).setDuration(1000);
           result.setText(answer + "%");
       }

       else if (language_position == 3){

           language_logo.setImageResource(R.drawable.csharp);
           language_logo.setTranslationX(1500);
           language_logo.animate().translationXBy(-1500).rotation(3600).setDuration(1000);
           result.setText(answer + "%");
       }

       else if (language_position == 4){

           language_logo.setImageResource(R.drawable.c);
           language_logo.setTranslationX(1500);
           language_logo.animate().translationXBy(-1500).rotation(3600).setDuration(1000);
           result.setText(answer + "%");
       }





    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}