/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1diseñodesistemas;

/**
 *
 * @author Ronald
 */
public class Carnivoro extends Animal{
    private float porcentaje;

    public Carnivoro(int edad, float peso, Pais pais, Sector s, Especie esp) {
        super(edad, peso, pais, s, esp);
        this.porcentaje = esp.getPorcentaje();
        super.setAlimento(this.calcularAlimento(peso,porcentaje));
    }
    
    public float calcularAlimento(float peso, float porcentaje){
        float a = 0;
        if(peso<500){
           a = (peso*porcentaje)/100;
        }
        
        if(peso>500){
            a = ((peso*porcentaje)/100) + ((peso*10)/100);
        } 
        return a;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
