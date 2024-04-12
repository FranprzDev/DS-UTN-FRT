/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1diseñodesistemas;

/**
 *
 * @author Ronald
 */
public class Carnivoro extends Mamifero{
    private float porcentaje;

    public Carnivoro(float porcentaje, Especie esp, int edad, float peso, Pais pais, Sector s) {
        super(esp, edad, peso, pais, s);
        this.porcentaje = porcentaje;
        super.setAlimento(this.calcularAlimento(peso,porcentaje));
    }
    
    public float calcularAlimento(float peso, float porcentaje){
        float a = 0;
        if(peso<500){
           a = (peso*100)/porcentaje;
        }
        
        if(peso>500){
            a = ((peso*100)/porcentaje) + ((peso*100)/10);
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
