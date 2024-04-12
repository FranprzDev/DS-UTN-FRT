/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1diseñodesistemas;

/**
 *
 * @author Ronald
 */
public abstract class Animal {
    private int edad;
    private float peso;
    private Pais pais;
    private Sector s;
    private Especie esp;
    private float alimento;

    public Animal(){
    }
    
    public Animal(int edad, float peso, Pais pais, Sector s, Especie esp) {
        this.edad = edad;
        this.peso = peso;
        this.pais = pais;
        this.esp = esp;
        this.s = s;
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
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Sector getS() {
        return s;
    }

    public void setS(Sector s) {
        this.s = s;
    }
}
