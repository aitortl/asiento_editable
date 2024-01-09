/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asientos_grada.dto;

/**
 *
 * @author macbook
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private String grada;
    private String asiento;
    private String fecha;
    private String hora;

    public Cliente(String nombre, String apellidos, String grada, String asiento, String fecha, String hora) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.grada = grada;
        this.asiento = asiento;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGrada() {
        return grada;
    }

    public String getAsiento() {
        return asiento;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    
    
    
}
