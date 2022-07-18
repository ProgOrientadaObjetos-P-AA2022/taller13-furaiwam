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
 
    public void establecerListaMarVendida (ArrayList<Televisor> t){
        String s = "";
        for (int i = 0; i < tvs.size(); i++) {
            s = String.format("%s\n%s\n"
            ,s, tvs.get(i).obtenerMarca());       
        }  
        listaMar = s;
    }
    public String obtenerMarcasVendidas(){
        return listaMar;
    }
    public void establecerPrecioTotal(ArrayList<Televisor> t){
        double s = 0;
        for (int i = 0; i < tvs.size(); i++) {
            s = s + tvs.get(i).obtenerPrecio();
            System.out.println(s);
        }
        return s;
    }  

     public double obtenerPrecioTotal(){
        return s;
    }
    public double obtenerTelevisorMasCaro(){
        return televisorMasCaro;
    }
    public String televisorMasCaro(ArrayList<Televisor> t){
        String s = "";
        for (int i = 0; i < t.size(); i++) {
            s = String.format("%s%s\n", s, t.get(i).obtenerMarca());
        }
        return s;
    }
}
    
    
