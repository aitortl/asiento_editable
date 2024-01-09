/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asiento;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Aitor Trabanco LLano
 */
public class ColoresAsiento implements Serializable{
    private Color colorLibre;
    private Color colorSeleccionado;
    private Color colorOcupado;
    private Color colorEncima;

    public ColoresAsiento(Color colorLibre, Color colorSeleccionado, Color colorOcupado, Color colorEncima) {
        this.colorLibre = colorLibre;
        this.colorSeleccionado = colorSeleccionado;
        this.colorOcupado = colorOcupado;
        this.colorEncima = colorEncima;
    }

    public Color getColorLibre() {
        return colorLibre;
    }

    public Color getColorSeleccionado() {
        return colorSeleccionado;
    }

    public Color getColorOcupado() {
        return colorOcupado;
    }

    public Color getColorEncima() {
        return colorEncima;
    }
    
    
}
