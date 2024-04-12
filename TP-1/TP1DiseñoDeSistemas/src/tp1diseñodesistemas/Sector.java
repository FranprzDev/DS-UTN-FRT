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
    private float comidaSector;
    private float latitud;
    private float longitud;
    private Alimentacion alimentacion;

    public Sector(int numero, float latitud, float longitud, Alimentacion alimentacion) {
        this.numero = numero;
        this.latitud = latitud;
        this.longitud = longitud;
        this.alimentacion = alimentacion;
        this.listaAnimales = new ArrayList<>();
    }
    
    //Calcular comida sector (sumando a la comida de cada animal
    //enum que dicta el tipo de sector (herbivoros o carnivoros)
    //creacion de paneles dinamicos con la creacion del sector
    
    public void agregarAnimal(Animal a){
        this.listaAnimales.add(a);
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

    public float getComidaSector() {
        return comidaSector;
    }

    public void setComidaSector(float comidaSector) {
        this.comidaSector = comidaSector;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
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
    
}
