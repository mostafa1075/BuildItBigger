package com.mostafa1075.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        if (intent == null)
            finish();
        String joke = null;
        if (intent.hasExtra(JOKE_KEY))
            joke = intent.getStringExtra(JOKE_KEY);
        TextView jokeTV = findViewById(R.id.joke_tv);
        jokeTV.setText(joke);
    }
}
