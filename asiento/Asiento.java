/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asiento;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author Aitor Trabanco LLano
 */
public class Asiento extends JButton  implements Serializable {
    private ColoresAsiento coloresAsiento;
    private int estado;
   
    public Asiento() {
        
        this.estado = 1;
        //Indico el color de fondo por defecto del botón
        setBackground(coloresAsiento.getColorLibre());
        //Indico las acciones que tendrá el botón al interactuar con el ratón
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (estado == 1) {
                    estado = 2;
                    setBackground(coloresAsiento.getColorSeleccionado());
                } else if (estado == 2) {
                    estado = 1;
                    setBackground(coloresAsiento.getColorLibre());
                } else if (estado == 3) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(coloresAsiento.getColorEncima());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (estado==1){
                    setBackground(coloresAsiento.getColorLibre());
                }else if (estado==2){
                    setBackground(coloresAsiento.getColorSeleccionado());
                }else if (estado==3){
                    setBackground(coloresAsiento.getColorOcupado());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }
        });
    }

    public ColoresAsiento getColoresAsiento() {
        return coloresAsiento;
    }

    public int getEstado() {
        return estado;
    }

    public void setColoresAsiento(ColoresAsiento coloresAsiento) {
        this.coloresAsiento = coloresAsiento;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}

