package com.example.hwassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //TODO: need to declare components ( instance variables encapsulate with "private" )
    private Button btn1;
    private EditText firstInput;
    private TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: create method init() and initialize components
        init();
    }

    private void init() {
        // TODO: initialize variables by id
        btn1 = findViewById(R.id.Next);
        firstInput = findViewById(R.id.Hello);
        tvDisplay = findViewById(R.id.welcome);

        // TODO: change placeholder attributes for the editText field
        firstInput.setHint("enter first number");
        firstInput.setHintTextColor(Color.GRAY);

        // TODO: change background of a button
        btn1.setBackgroundColor(Color.CYAN);

        // TODO: get width of the screen and change the size of the button ( width / 2 )
        int width =  Resources.getSystem().getDisplayMetrics().widthPixels;
        btn1.setWidth(width / 2);

        // TODO: change attributes of text of the Button
        btn1.setText( " Click Here!");
        btn1.setTextColor(Color.BLUE);

        // TODO: create an object ml out of the inner class MyListener
        MyListener ml = new MyListener();

        //TODO: attach a listener to the button
        btn1.setOnClickListener( ml );

        //TODO: alternatively without creating the object “ml" you can di-rectly attach the listener
        // btn1.setOnClickListener( new MyListener() );


        // in Java  /* .....  */ is used to comment a whole paragraph
        //TODO: "short cut" you can create the listener object and attach it to the button like this
        /*
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = firstInput.getText().toString();

                tvDisplay.setText(str);
                tvDisplay.setTextSize(40);
                tvDisplay.setTextColor(Color.RED);
            }
        });

        */


    }


    // TODO: create a inner class MyListener that is implementing inter-face View.OnClickListener
    // TODO: and overrides method onClick(View v)
    private class MyListener implements View.OnClickListener {

        @Override
        //TODO: override method onClick(View v) - defines what happens if a component/widget is clicked
        public void onClick(View v) {
            //TODO: get the input from the editText and convert (cast) to a String
            String str = firstInput.getText().toString();

            //TODO: change the attributes of the textView
            tvDisplay.setText(str);
            tvDisplay.setTextSize(40);
            tvDisplay.setTextColor(Color.RED);
        }
    }


}
