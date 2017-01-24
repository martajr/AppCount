package com.example.marta.appcount;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView display;
    private Button boton;
    private Integer contador;


    class MyButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view){
            contador++;
            display.setText(contador.toString());
        }
    }
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador =0;
        display.setText(contador.toString());
        boton =(Button)findViewById(R.id.button1);
        display=(TextView)findViewById(R.id.textView);

        boton.setOnClickListener(new MyButtonListener());
    }

}
