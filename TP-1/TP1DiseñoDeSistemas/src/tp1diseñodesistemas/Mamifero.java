/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1diseñodesistemas;

/**
 *
 * @author Ronald
 */
public class Mamifero extends Animal{
    private Especie esp;
    private float alimento;

    public Mamifero() {
    }
    
    public Mamifero(Especie esp, int edad, float peso, Pais pais, Sector s) {
        super(edad, peso, pais, s);
        this.esp = esp;
    }
    
    public float calcularAlimento(float peso, float x){
        return alimento;
    }
    
    public Especie getEsp() {
        return esp;
    }

    public void setEsp(Especie esp) {
        this.esp = esp;
    }

    public float getAlimento() {
        return alimento;
    }

    public void setAlimento(float alimento) {
        this.alimento = alimento;
    }
}
