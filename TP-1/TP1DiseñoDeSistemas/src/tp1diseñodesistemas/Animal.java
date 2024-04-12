/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1diseñodesistemas;

/**
 *
 * @author Ronald
 */
public class Animal {
    private int edad;
    private float peso;
    private Pais pais;
    private Sector s;
    private Especie esp;

    public Animal(){
    }
    
    public Animal(int edad, float peso, Pais pais, Sector s) {
        this.edad = edad;
        this.peso = peso;
        this.pais = pais;
        this.s = s;
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
