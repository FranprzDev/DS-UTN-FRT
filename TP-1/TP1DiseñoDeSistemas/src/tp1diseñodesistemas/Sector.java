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
    private Empleado e;
    private float comidaTotal;
    private float latitud;
    private float longitud;

    public Sector(int numero, float latitud, float longitud) {
        this.numero = numero;
        this.listaAnimales = new ArrayList<>();
        this.latitud = latitud;
        this.longitud = longitud;
    }
    
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

    public Empleado getEmpleado() {
        return e;
    }

    public void setEmpleado(Empleado e) {
        this.e = e;
    }

    public float getComidaTotal() {
        return comidaTotal;
    }

    public void setComidaTotal(float comidaTotal) {
        this.comidaTotal = comidaTotal;
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
    
    
    
}
