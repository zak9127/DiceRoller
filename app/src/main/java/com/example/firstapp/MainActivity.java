package com.example.firstapp;

import android.annotation.SuppressLint;
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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

import static com.example.firstapp.R.id.Points;
import static com.example.firstapp.R.id.numberTextView;
import static com.example.firstapp.R.id.question;

public class MainActivity<userNumber> extends AppCompatActivity {

    private TextView response;
    public EditText guess;
    private TextView points;
    int counter = 0;
    private TextView tv;
    private String randText;
    private View number;
    private View RandomQ;
    private View RanNumber;

    public MainActivity() {
    }

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

    public void on_button_click(View view) {

        TextView tv = this.findViewById(numberTextView);

        response = (TextView) findViewById(R.id.Response);
        points = (TextView) findViewById(R.id.Points);
        guess = (EditText) findViewById(R.id.Number);


        Random r = new Random();
        int number = r.nextInt(6);
        tv.setText(Integer.toString(number));

        int userNumber;
        userNumber = Integer.parseInt(guess.getText().toString());

        if (userNumber < 1 || userNumber > 6) ;
        {

            response.setText("Please guess 1-6");

        }
        if (userNumber == number) {

            counter++;

            points.setText("Points: " + counter);

            response.setText("Congratulations!");

        } else {

            response.setText("Try Again!");
        }


    }

    @SuppressLint("WrongViewCast")
    public void on_button_click1() {

        ArrayList<String> q = new ArrayList<String>();
        q.add("");
        q.add("If you could go anywhere in the world, where would you go?");
        q.add("If you were stranded on a desert island, what three things would you want to take with you?");
        q.add("If you could eat only one food for the rest of your life, what would that be?");
        q.add("If you won a million dollars, what is the first thing you would buy?");
        q.add("If you could spaned the day with one fictional character, who would it be?");
        q.add("If you found a magic lantern and a genie gave you three wishes, what would you wish?");

        response =  findViewById(R.id.Response);
        points =  findViewById(R.id.Points);
        guess = findViewById(R.id.Number);
        RanNumber = findViewById(R.id.numberTextView);
        RandomQ = findViewById(R.id.question);

        Random r = new Random();
        int number = r.nextInt(6);
        tv.setText(Integer.toString(number));

        randText = Integer.toString(number);
        RandomQ.setText()



        int userNumber = Integer.parseInt(guess.getText().toString());

        if (userNumber < 1 || userNumber > 6) {

            response.setText("Please guess 1-6");

        }
        if (userNumber == number) {

            counter++;

            points.setText("Points: " + counter);

            response.setText("Congratulations!");

        } else {

            response.setText("Try Again!");
        }
    }


    public static int roll_the_dice() {

        Random r = new Random();

        int number = r.nextInt(6) + 1;


    {

        return number;

    }

    }}




