/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1diseñodesistemas;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 *
 * @author Ronald
 */
public class Controlador {
    static Zoologico zoo = new Zoologico();
    static Alimentacion key;
    
    static VentanaZoologico vzoo = new VentanaZoologico();
    static VentanaZoo vz = new VentanaZoo();
    static VentanaTipo vt = new VentanaTipo();
    static VentanaAnimales van = new VentanaAnimales();
    
 /*---------------------------------------------------------------------------------------------*/    
    public static void mostrarVentanaZoo(){
        actualizar();
        vzoo.setVisible(true);
    }
    public static void ocultarVentanaZoo(){vzoo.dispose();}
    
    public static void actualizar(){
        vzoo.agregarPaneles(zoo.getListaSectores());
    }
    
    public static void eventoAgregarAnimal(){
        ocultarVentanaZoo();
        mostrarVentanaTipo();
    }
    
    public static void eventoCalcularComida(){
        float comidaTotal;
        float comidaHer;
        float comidaCar;
        
        comidaCar = zoo.calcularComida(Alimentacion.CARNIVORO);
        comidaHer = zoo.calcularComida(Alimentacion.HERBIVORO);
        comidaTotal = comidaCar + comidaHer;
        
        vzoo.setLabelNumHerbivoros(Float.toString(comidaHer));
        vzoo.setLabelNumCarnivoros(Float.toString(comidaCar));
        vzoo.setLabelNumTotales(Float.toString(comidaTotal));
    }
    
 /*---------------------------------------------------------------------------------------------*/    
  public static void mostrarVentanaTipo(){
        vt.setVisible(true);
    }
  public static void ocultarVentanaTipo(){vt.setVisible(false);}
  
  public static void eventoCarnivoro(){
      
      key = Alimentacion.CARNIVORO;
      ocultarVentanaTipo();
      van.ocultarValorFijo();
      mostrarVentanaAnimales();
  }
  public static void eventoHerbivoro(){
      key = Alimentacion.HERBIVORO;
      ocultarVentanaTipo();
      van.mostrarValorFijo();
      mostrarVentanaAnimales();
  }
  
  /*---------------------------------------------------------------------------------------------*/    
  public static void mostrarVentanaAnimales(){
      cargarPaises();
      cargarEspecies();
      cargarSectoresDisp();
      van.setVisible(true);
    }
  public static void ocultarVentanaAnimales(){van.setVisible(false);}
  
  /*---------------------------------------------------------------------------------------------*/    
  
  public static void cargarPaises(){
      van.getComboBoxPais().removeAllItems();
      for (Pais p : zoo.getListaPaises()) {
            String pais = p.getNombre();
            van.getComboBoxPais().addItem(pais);
      }
  }
  
  public static void cargarSectoresDisp(){
    van.getComboBoxSector().removeAllItems();
      for(Sector s : zoo.getListaSectores()){
        if(s.getAlimentacion().equals(key)){
            String sector = "" + s.getNumero();
            van.getComboBoxSector().addItem(sector);
        }
    }
}
  
  public static void cargarEspecies(){
      van.getComboBoxEspecie().removeAllItems();
      for(Especie esp : zoo.getListaEspecies()){
          if(esp.getAlimentacion().equals(key)){
              String especie = esp.getNombre();
              van.getComboBoxEspecie().addItem(especie);
          }
      }
  }
  
  public static void eventoAgregarNuevo(){
     float valorFijo;
     int edad;
     float peso;
     Pais pais;
     Sector s = null;
     int iSector = -1;
     Especie esp = null;
     
     peso = parseFloat(van.getCampoPeso().getText());
     edad = parseInt(van.getCampoEdad().getText());
     
     pais = zoo.getListaPaises().get(van.getComboBoxPais().getSelectedIndex());
     
     for(Sector sec : zoo.getListaSectores()){
         if(parseInt(van.getComboBoxSector().getSelectedItem().toString()) == sec.getNumero()){
             s = sec;
             iSector = zoo.getListaSectores().indexOf(sec);
         }
     }
     
     for(Especie e : zoo.getListaEspecies()){
         if(van.getComboBoxEspecie().getSelectedItem().toString() == e.getNombre()){
             esp = e;
         }
     } 
     
     if(key.equals(Alimentacion.CARNIVORO)){
         Carnivoro c = new Carnivoro(edad, peso, pais, s, esp);
         zoo.getListaSectores().get(iSector).agregarAnimal(c);
     }
     
     if(key.equals(Alimentacion.HERBIVORO)){
         valorFijo = parseFloat(van.getCampoValorFijo().getText());
         Herbivoro h = new Herbivoro(valorFijo, edad, peso, pais, s, esp);
         zoo.getListaSectores().get(iSector).agregarAnimal(h);
     }
     
     vzoo.agregarPaneles(zoo.getListaSectores());
     
     ocultarVentanaAnimales();
     mostrarVentanaZoo();
  }    
  
 /*---------------------------------------------------------------------------------------------*/    
    public static void llenar(){
        Pais arg = new Pais("Argentina", "ARG");
        zoo.agregarPais(arg);
        Pais bra = new Pais("Brasil","BRA");
        zoo.agregarPais(bra);
        Pais uru = new Pais("Uruguay", "URU");
        zoo.agregarPais(uru);
        Pais chi = new Pais("Chile", "CHI");
        zoo.agregarPais(chi);
        
        Especie leon = new Especie("León", 30, Alimentacion.CARNIVORO);
        zoo.agregarEspecie(leon);
        Especie lobo = new Especie("Lobo", 20, Alimentacion.CARNIVORO);
        zoo.agregarEspecie(lobo);
        Especie jirafa = new Especie("Jirafa", 0, Alimentacion.HERBIVORO);
        zoo.agregarEspecie(jirafa);
        Especie elefante = new Especie("Elefante",0,Alimentacion.HERBIVORO);
        zoo.agregarEspecie(elefante);
                
        Empleado juan = new Empleado("Juan", "Balcarce 500", 40900987);
        zoo.agregarEmpleado(juan);
        Empleado gonchi = new Empleado("Gonzalo", "Juan B Teran 690", 47892000);
        zoo.agregarEmpleado(gonchi);
        Empleado flor = new Empleado("Florencia Noelia", "Rio Sali 777", 44032111);
        zoo.agregarEmpleado(flor);
        
        Sector sector1 = new Sector(1, flor,80.5437, 66.5766, 10, Alimentacion.CARNIVORO);
        zoo.agregarSector(sector1);
        Sector sector2 = new Sector(2, gonchi, 11.5437, 64.5766, 20, Alimentacion.HERBIVORO);
        zoo.agregarSector(sector2);
        Sector sector3 = new Sector(3, juan, 90.5437, 65.5766, 30, Alimentacion.CARNIVORO);
        zoo.agregarSector(sector3);
        
        Carnivoro leon1 = new Carnivoro(15, 90000, chi, sector3, leon);
        Carnivoro leon2 = new Carnivoro(5, 400, arg, sector3, leon);
        Herbivoro elefante1 = new Herbivoro(60, 800, 15, chi, sector2, elefante);
      
        sector3.agregarAnimal(leon1);
        sector3.agregarAnimal(leon2);
        sector2.agregarAnimal(elefante1);
    
    }
}
