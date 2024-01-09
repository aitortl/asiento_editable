/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asientos_grada.logica;

import asientos_grada.dto.Cliente;
import asiento.Asiento;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JButton;

/**
 *
 * @author macbook
 */
public class Logica {
    private ArrayList<Cliente> reservas;

    public Logica() {
        this.reservas = new ArrayList ();
    }

    public ArrayList<Cliente> getReservas() {
        return reservas;
    }

    public void listadoReservas(String nombre, String apellidos, Date date, HashMap<String, Asiento> botonesSeleccionados){
        //Le doy formato a la fecha y la hora
        SimpleDateFormat formatoFecha= new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatoHora= new SimpleDateFormat("HH:mm:ss");
        String fecha=formatoFecha.format(date);
        String hora=formatoHora.format(date);
       //recorro los botones para sacar el nombre de la grada y el asiento
        for (Map.Entry<String, Asiento> entry : botonesSeleccionados.entrySet()) {
            String nombreBoton= entry.getKey();
            String nombreGrada="";
            String nombreAsiento="";
            String [] partes = nombreBoton.split("-"); //esto recorta el string del nombre del botón en función del regex indicado "-"
            if (partes.length ==3){ //
                nombreGrada = partes [0];
                nombreAsiento = partes [1]+"-"+partes[2];
            }
            Cliente cliente = new Cliente (nombre, apellidos,nombreGrada, nombreAsiento, fecha, hora);
            reservas.add(cliente);
        }
    }

    public void borrarReserva(String grada, String asiento) {
        Iterator <Cliente> iterador = reservas.iterator();
        while(iterador.hasNext()){
            Cliente reserva = iterador.next();
            if(reserva.getGrada().equals(grada)&&reserva.getAsiento().equals(asiento)){
                iterador.remove();
                
            }
        }
    }
    
    
}
