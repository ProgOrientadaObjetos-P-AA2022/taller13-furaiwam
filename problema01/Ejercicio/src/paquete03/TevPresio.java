/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

/**
 *
 * @author SALA I
 */
public class TevPresio {
    
    private ArrayList<Televisor> tvs;
    private double totalPrecioTvs;
    private double televisorMasCaro;
    private String listaMar;
    
    public void establecerTv(ArrayList<Televisor> t){
        tvs =t;
    }
    public  ArrayList<Televisor> obtenerTv(){
        return tvs;
    }
     public void establecerPrecioTvs(ArrayList<Televisor> t){
        double s = 0;
        for (int i = 0; i < tvs.size(); i++) {
            s = s + tvs.get(i).obtenerPrecio();
        }
        totalPrecioTvs = s;
    }
    public double obtenerTotalPrecioTvs(){
        return totalPrecioTvs;
    }
    public void establecerTeleMasCaro(ArrayList<Televisor> t){
        televisorMasCaro = t.get(0).obtenerPrecio();
        for (int i = 1; i < t.size(); i++) {
            if(televisorMasCaro <= t.get(i).obtenerPrecio()){
                televisorMasCaro =  t.get(i).obtenerPrecio();
            }
        }
    }
    public double obtenerTeleMasCaro(){
        return televisorMasCaro;
    }

    public void establecerListaMarcas(ArrayList<Televisor> t){
        listaMar = "";
        for (int i = 0; i < t.size(); i++) {
            listaMar = String.format("%s%s\n"
                    ,listaMar
                    ,t.get(i).obtenerMarca());
        }
    }
    public String obtenerListaMarcas(){
        return listaMar;
    }

    @Override
    public String toString() {
        String c = "";
        String cadena;
        for(int i = 0; i < obtenerTv().size();i++){
            c = String.format("%s\nNombre del TV: %s\n"
                            + "Edades: %.2f\n"
                    ,c
                    ,obtenerTv().get(i).obtenerMarca()
                    ,obtenerTv().get(i).obtenerPrecio()
            );
        }
        cadena = String.format("Lista de Tvs...\n"
                        + "%s\n"
                        + "Lista de marcas Vendidas.. \n"
                        + "%s\n"
                        + "Total del precio de Tvs: %.2f\n"
                        + "Televisor mas caro: %.2f\n"
                ,c
                ,obtenerListaMarcas()
                ,obtenerTotalPrecioTvs()
                ,obtenerTeleMasCaro()
        );
        return cadena;
    }

}
    
    
