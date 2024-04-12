/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1diseñodesistemas;

/**
 *
 * @author Ronald
 */
public class TP1DiseñoDeSistemas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pais arg = new Pais("Argentina", "ARG");
        Pais bra = new Pais("Brasil","BRA");
        Pais uru = new Pais("Uruguay", "URU");
        Pais chi = new Pais("Chile", "CHI");
        
        Especie leon = new Especie("León", 30, Alimentacion.CARNIVORO);
        Especie lobo = new Especie("Lobo", 20, Alimentacion.CARNIVORO);
        Especie jirafa = new Especie("Jirafa", 0, Alimentacion.HERBIVORO);
        Especie elefante = new Especie("Elefante",0,Alimentacion.HERBIVORO);
        
        Zoologico zoo = new Zoologico();
        
        Empleado juan = new Empleado("Juan", "Balcarce 500", 40900987);
        Empleado gonchi = new Empleado("Gonzalo", "Juan B Teran 690", 47892000);
        Empleado flor = new Empleado("Florencia Noelia", "Rio Sali 777", 44032111);
        
        Sector sector1 = new Sector(1, 80.5437, 66.5766, Alimentacion.CARNIVORO);
        Sector sector2 = new Sector(2, 11.5437, 64.5766, Alimentacion.HERBIVORO);
        Sector sector3 = new Sector(3, 90.5437, 65.5766, Alimentacion.CARNIVORO);
                
        VentanaZoo ventana = new VentanaZoo();
        ventana.setVisible(true);
        
    }
    
}
