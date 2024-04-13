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
public class Zoologico {
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Sector> listaSectores;
    private ArrayList<Pais> listaPaises;
    private ArrayList<Especie> listaEspecies;
    
    //Agregar animal
    
    public float calcularComida(Alimentacion alimentacion){
    float comida = 0;
            for (Sector s : listaSectores) {
                if(s.getAlimentacion()== alimentacion)
                comida = comida + s.calcularComida();
            }
            return comida;
}
    
    public Zoologico() {
        this.listaEmpleados = new ArrayList<>();
        this.listaSectores = new ArrayList<>();
        this.listaEspecies = new ArrayList<>();
        this.listaPaises = new ArrayList<>();
    }
    
    public void agregarSector(Sector s){
        this.listaSectores.add(s);
    }
    public void agregarEmpleado(Empleado e){
        this.listaEmpleados.add(e);
    }
    public void agregarPais(Pais p){
        this.listaPaises.add(p);
    }
    public void agregarEspecie(Especie esp){
        this.listaEspecies.add(esp);
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Sector> getListaSectores() {
        return listaSectores;
    }

    public ArrayList<Pais> getListaPaises() {
        return listaPaises;
    }

    public ArrayList<Especie> getListaEspecies() {
        return listaEspecies;
    }
}
