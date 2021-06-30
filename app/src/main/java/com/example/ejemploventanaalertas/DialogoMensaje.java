package com.example.ejemploventanaalertas;


//se crea una clase por cuadro de dialogo

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class DialogoMensaje extends DialogFragment {
    //    este es el código en el MainActivity
    //    DialogoMensaje mensajesimple = new DialogoMensaje();
    //    mensajesimple.show(getFragmentManager(), "Cuadro Simple");

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                //ESTABLECEMOS EL ICONO PARA NUESTRO
                //MENSAJE, QUE LO SITUAREMOS DENTRO
//DE LOS RECURSOS DE DRAWABLE Y LO LLAMAREMOS //icmenutick.PNG  en minuscula
                .setIcon(R.drawable.icmenutick)
                //AHORA INDICAMOS EL TEXTO QUE CONTENDRÁ EL MENSAJE
                .setTitle("Este es el Título del mensaje")
                //LO DE INCLUIR BOTONES ES OPCIONAL, AUNQUE
                //EN ESTE TIPO DE MENSAJES DEBERÍA SER
                //OBLIGATORIO, YA QUE NO DESAPARECE EL
                //MENSAJE AL TIEMPO, COMO POR EJEMPLO
                //SUCEDE CON UN MENSAJE TOAST
                //LO QUE HACEMOS ES ESTABLECER UN BOTÓN Y LE ASOCIAMOS
                //UN EVENTO CLICK PARA CAPTURAR SU ACCIÓN
                //EN LA ACTIVIDAD
                .setPositiveButton("Aceptar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                //TENDREMOS UN MÉTODO EN LA ACTIVIDAD
                                //LLAMADO ACCIONACEPTAR Y QUE NOS //PERMITIRÁ
                                //CAPTURAR LA ACCIÓN DE RESPUESTA.
                                ((MainActivity)getActivity()).accionAceptar();  //getactivity devuelve la actividad que me está llamando, pero como no sabe quien le llama la casteo
                            //accionAceptar está en el Mainctivity !!!
                            }
                        }
                )
                //POR ÚLTIMO, CREAMOS EL CUADRO
                .create();
    }
}