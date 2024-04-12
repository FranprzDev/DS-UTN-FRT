/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1diseñodesistemas;

/**
 *
 * @author Ronald
 */
public class Herbivoro extends Mamifero{
    private float valorFijo;

    public Herbivoro(float valorFijo, Especie esp, int edad, float peso, Pais pais, Sector s) {
        super(esp, edad, peso, pais, s);
        this.valorFijo = valorFijo;
        super.setAlimento(this.calcularAlimento(peso,valorFijo));
    }

    
    @Override
    public float calcularAlimento(float peso, float valorFijo){
        float a = (2*peso)+ valorFijo;
        return a;
    }

    public float getValorFijo() {
        return valorFijo;
    }

    public void setValorFijo(float valorFijo) {
        this.valorFijo = valorFijo;
    }
    
    
}
