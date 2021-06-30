package com.example.ejemploventanaalertas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView lblrespuesta;
    String datoseleccionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblrespuesta = (TextView) findViewById(R.id.lblRespuesta);
    }

    public void mostrarCuadroSencillo(View view) {  //llama un control de la vista por eso lleva View  se llama desde el boton para generar el cuadro de diálogo,
        DialogoMensaje mensajesimple = new DialogoMensaje();
        mensajesimple.show(getFragmentManager(), "Cuadro Simple");
    }

    public void mostrarCuadroDoble(View view) {  //llama un control de la vista por eso lleva View  se llama desde el boton para generar el cuadro de diálogo,
        DialogoMensajeDosBotones mensajedoble = new DialogoMensajeDosBotones();
        mensajedoble.show(getFragmentManager(), "Cuadro Doble");
    }

    public void mostrarSeleccionSimple(View view) {  //llama un control de la vista por eso lleva View
        DialogoSeleccionSimple mensajeseleccionsimple = new DialogoSeleccionSimple();
        mensajeseleccionsimple.show(getFragmentManager(), "Cuadro Seleccion Simple");
    }

    public void mostrarSeleccionSimpleRadioButton(View view) {  //llama un control de la vista por eso lleva View
        DialogoSeleccionSimpleRadioButton mensajeseleccionsimple = new DialogoSeleccionSimpleRadioButton();
        mensajeseleccionsimple.show(getFragmentManager(), "Cuadro Seleccion Simple");
    }


        public void accionAceptar () {
            //se realizaría la parte del código de programación previsto para cuando le das a aceptar
            Toast.makeText(this, "OJO has pulsado en ACEPTAR", Toast.LENGTH_LONG).show();
            lblrespuesta.setText(("OJO Has pulsado en ACEPTAR"));
        }

        public void accionCancelar () {
            //se realizaría la parte del código de programación previsto para cuando le das a aceptar
            Toast.makeText(this, "OJO has pulsado en CANCELAR", Toast.LENGTH_LONG).show();
            lblrespuesta.setText(("OJO Has pulsado en CANCELAR"));
        }

        public void capturarSeleccionado (String datoseleccionado){
            Toast.makeText(this, datoseleccionado, Toast.LENGTH_LONG).show();
            lblrespuesta.setText((datoseleccionado));
        }

    public void mostrarDialogoSeleccionMultiple() {
        DialogoSeleccionMultipleCheckBox seleccionmultiple  = new DialogoSeleccionMultipleCheckBox();
        seleccionmultiple .show(getFragmentManager(), "Cuadro selección múltiple");
    }

    public void capturarDatos(String dato) {
        lblrespuesta.setText(dato);
    }
}

