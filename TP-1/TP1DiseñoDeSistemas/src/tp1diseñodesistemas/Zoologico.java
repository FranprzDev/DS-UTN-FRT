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
    
    //Agregar animal
    //Calcular comida total
    //Calcular comida carnivoros
    //Calcular comida herbivoros
    
    public Zoologico() {
        this.listaEmpleados = new ArrayList<>();
        this.listaSectores = new ArrayList<>();
    }
    
    public void agregarSector(Sector s){
        this.listaSectores.add(s);
    }
    public void agregarEmpleado(Empleado e){
        this.listaEmpleados.add(e);
    }
    
    /*public void asignarEmpleado(int numeroSector, int dniEmpleado){
        int i=0;
        int j=0;
        Sector s = null;
        Empleado e = null;
        
        while(i<listaSectores.size() && this.listaSectores.get(i).getNumero() != numeroSector){   
            i++;
        }
        
        if(i<listaSectores.size()){
            s = listaSectores.get(i);
            
            while(j<listaEmpleados.size() && this.listaEmpleados.get(j).getDni() != dniEmpleado){
                j++;
            }
        
            if(j<listaEmpleados.size()){
                e = listaEmpleados.get(j);
                s.setEncargado(e);
            }
            
            else{
                System.out.println("Empleado no encontrado");
            }
        }
    }*/
}
