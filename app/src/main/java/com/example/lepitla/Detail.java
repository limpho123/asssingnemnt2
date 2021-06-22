package com.example.lepitla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Objects;

public
class Detail extends AppCompatActivity {

    TextView first, second, third;
    ImageView img1;

    @Override
    protected
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_detail);

        first = (TextView) findViewById(R.id.fact1);
        second = (TextView) findViewById(R.id.fact2);
        third = (TextView) findViewById(R.id.fact3);
        img1 = (ImageView) findViewById(R.id.collaps);

        Intent recieveIntent = getIntent();
        String message1 = recieveIntent.getStringExtra("message1");
        String message2 = recieveIntent.getStringExtra("message2");
        String message3 = recieveIntent.getStringExtra("message3");
        int image = recieveIntent.getIntExtra("name",0);

        first.setText(message1);
        second.setText(message2);
        third.setText(message3);
        img1.setImageResource(image);
    }
}
