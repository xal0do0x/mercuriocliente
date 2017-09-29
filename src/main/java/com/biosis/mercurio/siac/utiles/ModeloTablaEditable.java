/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biosis.mercurio.siac.utiles;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.jdesktop.observablecollections.ObservableList;
import org.jdesktop.observablecollections.ObservableListListener;

/**
 *
 * @author Aldo
 */
public abstract class ModeloTablaEditable<T> extends AbstractTableModel implements ObservableListListener{
    public List<T> datos;
    public String[] nombreColumnas;
    public String[] propiedades;
    
    public ModeloTablaEditable(List<T> datos){
        this.datos = datos;
        inicializacion();
    }

    public ModeloTablaEditable(List<T> datos, String[] nombreColumnas) {
        this.datos = datos;
        this.nombreColumnas = nombreColumnas;
        this.inicializacion();
    }
    
    

    public ModeloTablaEditable(List<T> datos, String[] nombreColumnas, String[] propiedades) {
        this.datos = datos;        
        this.nombreColumnas = nombreColumnas;
        this.propiedades = propiedades;
        this.inicializacion();
    }        
    
    
    
    @Override
    public int getRowCount() {
        return this.datos.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombreColumnas.length;
    }

    @Override
    public String getColumnName(int column) {
        return this.nombreColumnas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.getValorEn(rowIndex,columnIndex);
    }

    @Override
    public void listElementsAdded(ObservableList ol, int i, int i1) {
        this.fireTableRowsInserted(i, i);
        this.fireTableRowsUpdated(i, i);
    }

    @Override
    public void listElementsRemoved(ObservableList ol, int i, List list) {
        this.fireTableRowsDeleted(i, i);
    }

    @Override
    public void listElementReplaced(ObservableList ol, int i, Object o) {
        this.fireTableRowsUpdated(i, i);
    }

    @Override
    public void listElementPropertyChanged(ObservableList ol, int i) {
        this.fireTableRowsUpdated(i, i);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return true;
    }
    
    private void inicializacion() {
        if(datos instanceof ObservableList){
            ((ObservableList)datos).addObservableListListener(this);
        }
    }

    public abstract Object getValorEn(int rowIndex, int columnIndex);

    
}
