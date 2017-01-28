package com.example.marta.appcount;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView display;
    private Button botonAdd;
    private Button botonSub;
    private Integer contador;


    class ButtonAdd implements View.OnClickListener {
        @Override
        public void onClick(View view){
            contador++;
            display.setText(contador.toString());
        }
    }

    class ButtonSub implements View.OnClickListener {
        @Override
        public void onClick(View view){
            contador--;
            display.setText(contador.toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador =0;

        botonAdd =(Button)findViewById(R.id.button1);
        botonSub =(Button)findViewById(R.id.button2);
        display=(TextView)findViewById(R.id.textView);

        botonAdd.setOnClickListener(new ButtonAdd());
        botonSub.setOnClickListener(new ButtonSub());
    }

}
