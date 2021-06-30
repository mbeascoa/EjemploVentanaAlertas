package com.example.ejemploventanaalertas;


//se crea una clase por cuadro de dialogo

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;


public class DialogoSeleccionSimpleRadioButton extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        //PARA PODER MOSTRAR UN MENSAJE DE SELECCIÓN SIMPLE,
        //DEBEMOS CREARNOS LA LISTA DE ELEMENTOS
        //QUE DESEAMOS VISUALIZAR EN EL MENSAJE
        final String[] elementos = {"Barcelona", "Real Madrid", "Atletico Madrid", "Atletic BILBAO"};

        return new AlertDialog.Builder(getActivity())
                //ESTABLECEMOS EL ICONO PARA NUESTRO
                //MENSAJE, QUE LO SITUAREMOS DENTRO
                //DE LOS RECURSOS DE DRAWABLE
                .setIcon(R.drawable.ic_menu_love)

                //AHORA INDICAMOS EL TEXTO QUE CONTENDRÁ EL MENSAJE
                .setTitle("¿Quién es el último campeón de liga 2012?")

                //CON EL MÉTODO SETITEMS, LO QUE HACEMOS ES
                //ESTABLECER LA LISTA DE ELEMENTOS PARA VISUALIZAR
                //Y CAPTURAR LA RESPUESTA DEL USUARIO,
                //ENVIANDOLA A LA ACTIVIDAD MEDIANTE EL METODO
                //CAPTURARSELECCIONADO.
                .setSingleChoiceItems(elementos, -1,new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        String datoseleccionado = elementos[item];
                        ((MainActivity)getActivity()).capturarSeleccionado(datoseleccionado);
                    }
                })
                .setPositiveButton("Aceptar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                //TENDREMOS UN MÉTODO EN LA ACTIVIDAD
//LLAMADO ACCIONACEPTAR Y QUE NOS //PERMITIRÁ
                                //CAPTURAR LA ACCIÓN DE RESPUESTA.
                                ((MainActivity)getActivity()).accionAceptar();
                            }
                        }
                )

                //POR ÚLTIMO, CREAMOS EL CUADRO
                .create();
    }
}
