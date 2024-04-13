/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1diseñodesistemas;

import java.util.ArrayList;

/**
 *
 * @author Ronald
 */
public class Sector {
    private int numero;
    private ArrayList<Animal> listaAnimales;
    private Empleado encargado;
    private double latitud;
    private double longitud;
    private int maxCantidad;
    private Alimentacion alimentacion;

    public Sector(int numero, Empleado encargado, double latitud, double longitud, int maxCantidad, Alimentacion alimentacion) {
        this.numero = numero;
        this.encargado = encargado; 
        this.latitud = latitud;
        this.longitud = longitud;
        this.maxCantidad = maxCantidad;
        this.alimentacion = alimentacion;
        this.listaAnimales = new ArrayList<>();
    }
    
    //creacion de paneles dinamicos con la creacion del sector
    
    public float calcularComida(){
        float comidaSector = 0;
        for (Animal a : listaAnimales) {
            comidaSector = comidaSector + a.getAlimento();
        }
        return comidaSector;
    }
    
    public void agregarAnimal(Animal a){
        if(a.getEsp().getAlimentacion()==this.alimentacion)
        {
             this.listaAnimales.add(a);
        }
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public Empleado getEncargado() {
        return encargado;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public Alimentacion getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(Alimentacion alimentacion) {
        this.alimentacion = alimentacion;
    }

    public int getMaxCantidad() {
        return maxCantidad;
    }

    public void setMaxCantidad(int maxCantidad) {
        this.maxCantidad = maxCantidad;
    }
    
}
