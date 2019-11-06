package com.example.firstapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import static com.example.firstapp.R.id.numberTextView;

public class MainActivity<userNumber> extends AppCompatActivity {

    private TextView response;
    public EditText guess;
    private TextView points;
 int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void on_button_click (View view) {

        TextView tv = this.findViewById(numberTextView);

        response = (TextView)findViewById(R.id.Response);
        points = (TextView)findViewById(R.id.Points);
        guess = (EditText)findViewById(R.id.Number);


        Random r = new Random();
        int number = r.nextInt(6);
        tv.setText(Integer.toString(number));

        int userNumber;
        userNumber = Integer.parseInt(guess.getText().toString());

        if (userNumber < 1 || userNumber > 6);
        {

            response.setText("Please guess 1-6");

        }  if (userNumber == number) {

            counter++;

            points.setText("Points: "+ counter);

            response.setText("Congratulations!");

        } else {

            response.setText("Try Again!");
        }


    }


    }



