/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asiento;

import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Aitor Trabanco LLano
 */
public class ColoresAsientoPropertyEditorSupport extends PropertyEditorSupport{
    private SelectorColores selectorColores = new SelectorColores();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return selectorColores;
    }

    @Override
    public Object getValue() {
        return selectorColores.getPropiedadSeleccionada();
    }

    @Override
    public String getJavaInitializationString() {
        Color colorLibre=selectorColores.getPropiedadSeleccionada().getColorLibre();
        Color colorSeleccionado=selectorColores.getPropiedadSeleccionada().getColorSeleccionado();
        Color colorOcupado=selectorColores.getPropiedadSeleccionada().getColorOcupado();
        Color colorEncima=selectorColores.getPropiedadSeleccionada().getColorEncima();
        return "new asiento.ColoresAsiento(new java.awt.Color("+colorLibre.getRGB()+
                    "),new java.awt.Color("+colorSeleccionado.getRGB()+
                    "),new java.awt.Color("+colorOcupado.getRGB()+
                    "),new java.awt.Color("+colorEncima.getRGB()+"))";
    }
}
