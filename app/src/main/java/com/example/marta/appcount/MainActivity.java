package com.example.marta.appcount;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private TextView display;
    private Button boton;
    private Integer contador;


    class MyButtonListener implements OnClickListener{
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
        boton =(Button)findViewById(R.id.button1);
        display=(TextView)findViewById(R.id.textView);

        boton.setOnClickListener(new MyButtonListener());
    }

}
