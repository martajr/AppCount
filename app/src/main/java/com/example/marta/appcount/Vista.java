package com.example.marta.appcount;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Vista extends Activity implements  I_Vista {

    private TextView display;
    private Button botonAdd;
    private Button botonSub;
    private I_Presentador presentador;


    @Override
    public void setText(Integer contador) {
        display.setText(contador.toString());
    }


    class ButtonAdd implements View.OnClickListener {
        @Override
        public void onClick(View view){
           presentador.aumentarContador();
           setText(presentador.presentarContador());
        }


    }

    class ButtonSub implements View.OnClickListener {
        @Override
        public void onClick(View view){
            presentador.disminuirContador();
            setText(presentador.presentarContador());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presentador = Presentador.getInstance();

        botonAdd =(Button)findViewById(R.id.button1);
        botonSub =(Button)findViewById(R.id.button2);
        display=(TextView)findViewById(R.id.textView);

        botonAdd.setOnClickListener(new ButtonAdd());
        botonSub.setOnClickListener(new ButtonSub());
    }

}
