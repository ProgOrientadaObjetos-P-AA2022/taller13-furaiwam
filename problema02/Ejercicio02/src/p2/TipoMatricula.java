/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    private double promedioMatriculas;
    private ArrayList<Matricula> lista;
    public void establecerLista(ArrayList<Matricula> l) {
        lista = l;
    }
    public ArrayList<Matricula> obtenerLista(){
        return lista;
    }

    public void establecerPromedioTarifas(){
        double suma = 0;
        for (int i = 0; i < obtenerLista().size(); i++) {
            suma = suma + obtenerLista().get(i).obtenerTarifa();
        }
        promedioMatriculas = suma / obtenerLista().size();
    }
    public double obtenerPromedioTarifas(){
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String c = "";
        String cadena;

        for(int i = 0; i < obtenerLista().size(); i++) {
            c = String.format("%s\nTarifa: %.2f\n"
                    ,c
                    ,obtenerLista().get(i).toString()
            );
        }
        cadena = String.format("Lista de tarifas: %s\n"
                        +"Promedio total de tarifas: %.2f\n"
                ,c
                ,obtenerPromedioTarifas()
        );
        return cadena;
    }
}
