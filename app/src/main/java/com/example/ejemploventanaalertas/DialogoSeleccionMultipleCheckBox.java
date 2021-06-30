package com.example.ejemploventanaalertas;


//se crea una clase por cuadro de dialogo

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class DialogoSeleccionMultipleCheckBox extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        //PARA PODER MOSTRAR UN MENSAJE DE SELECCIÓN MULTIPLE,
        //DEBEMOS CREARNOS LA LISTA DE ELEMENTOS
        //QUE DESEAMOS VISUALIZAR EN EL MENSAJE
        //Y CREARNOS OTRO ARRAY DE BOOLEAN
        //CON LAS OPCIONES QUE DESEAMOS QUE APAREZCAN
        //SELECCIONADAS, EN NUESTRO EJEMPLO
        //NO APARECERÁ NINGUNA OPCIÓN SELECCIONADA.
        final String[] elementos = {"Español", "Inglés", "Francés", "Alemán"};
        final boolean[] opciones = {false, false, false, false};

        return new AlertDialog.Builder(getActivity())
                //ESTABLECEMOS EL ICONO PARA NUESTRO
                //MENSAJE, QUE LO SITUAREMOS DENTRO
                //DE LOS RECURSOS DE DRAWABLE
                .setIcon(R.drawable.icmenutick)

                //AHORA INDICAMOS EL TEXTO QUE CONTENDRÁ EL MENSAJE
                .setTitle("¿Qué idiomas hablas?")

                //CON EL MÉTODO SETMULTICHOICEITEMS, LO QUE HACEMOS ES
                //ESTABLECER LA LISTA DE ELEMENTOS PARA VISUALIZAR,
                //TAMBIÉN DEBEMOS INDICAR LOS ELEMENTOS
                //QUE DESEAMOS QUE QUEDEN MARCADOS
                //MEDIANTE EL ARRAY DE BOOLEAN.
                .setMultiChoiceItems(elementos, opciones, new DialogInterface.OnMultiChoiceClickListener() {
                    public void onClick(DialogInterface dialog, int item, boolean isChecked) {
                        //LO QUE NOS DEVOLVERÁ LA RESPUESTA DEL USUARIO
                        //ES EL ARRAY DE BOOLEAN CON
                        //LAS OPCIONES QUE HAYAMOS MARCADO
                        //CON EL VALOR DE TRUE.
                        //VAMOS A RECORRERLAS Y HACER UN STRING
                        //CON LOS ELEMENTOS CHEQUEADOS
                        //PARA DEVOLVERLO A LA ACTIVIDAD.
                        String seleccionados="";
                        for (int i = 0; i < opciones.length; i++)
                        {
                            if (opciones[i] == true)
                            {
                                seleccionados += elementos[i] + "\n";
                            }
                        }
                        ((MainActivity)getActivity()).capturarDatos(seleccionados);
                    }
                })
                //POR ÚLTIMO, CREAMOS EL CUADRO
                .create();
    }
}