/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1diseñodesistemas;

/**
 *
 * @author Ronald
 */
public class Controlador {
    static Zoologico zoo = new Zoologico();
    
    static VentanaZoologico vzoo = new VentanaZoologico();
    static VentanaZoo vz = new VentanaZoo();
    static VentanaTipo vt = new VentanaTipo();
    static VentanaAnimales va = new VentanaAnimales();
    
 /*---------------------------------------------------------------------------------------------*/    
    public static void mostrarVentanaZoo(){
        vzoo.agregarPaneles(zoo.getListaSectores());
        vzoo.setVisible(true);
    }
    public static void ocultarVentanaZoo(){vz.setVisible(false);}
    
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
      ocultarVentanaTipo();
      va.ocultarValorFijo();
      mostrarVentanaAnimales();
  }
  public static void eventoHerbivoro(){
      ocultarVentanaTipo();
      va.mostrarValorFijo();
      mostrarVentanaAnimales();
  }
  
  /*---------------------------------------------------------------------------------------------*/    
  public static void mostrarVentanaAnimales(){
        va.setVisible(true);
    }
  public static void ocultarVentanaAnimales(){va.setVisible(false);}
  
  /*---------------------------------------------------------------------------------------------*/    
  
  public static void cargarPaises(){
      
  }
  
  public static void cargarSectoresDisp(){
    
}
  
  public static void cargarEspecies(){
      
  }
  
  public static void eventoAgregarHerbivoro(){
      
  }    
  
 /*---------------------------------------------------------------------------------------------*/    
    public static void llenar(){
        Pais arg = new Pais("Argentina", "ARG");
        Pais bra = new Pais("Brasil","BRA");
        Pais uru = new Pais("Uruguay", "URU");
        Pais chi = new Pais("Chile", "CHI");
        
        Especie leon = new Especie("León", 30, Alimentacion.CARNIVORO);
        Especie lobo = new Especie("Lobo", 20, Alimentacion.CARNIVORO);
        Especie jirafa = new Especie("Jirafa", 0, Alimentacion.HERBIVORO);
        Especie elefante = new Especie("Elefante",0,Alimentacion.HERBIVORO);
        
        Empleado juan = new Empleado("Juan", "Balcarce 500", 40900987);
        zoo.agregarEmpleado(juan);
        Empleado gonchi = new Empleado("Gonzalo", "Juan B Teran 690", 47892000);
        zoo.agregarEmpleado(gonchi);
        Empleado flor = new Empleado("Florencia Noelia", "Rio Sali 777", 44032111);
        zoo.agregarEmpleado(flor);
        
        Sector sector1 = new Sector(1, 80.5437, 66.5766, Alimentacion.CARNIVORO);
        zoo.agregarSector(sector1);
        Sector sector2 = new Sector(2, 11.5437, 64.5766, Alimentacion.HERBIVORO);
        zoo.agregarSector(sector2);
        Sector sector3 = new Sector(3, 90.5437, 65.5766, Alimentacion.CARNIVORO);
        zoo.agregarSector(sector3);
        
        Carnivoro leon1 = new Carnivoro(15, 90000, chi, sector3, leon);
        Carnivoro leon2 = new Carnivoro(5, 400, arg, sector3, leon);
        Herbivoro elefante1 = new Herbivoro(60, 800, 15, chi, sector2, elefante);
      
        sector3.agregarAnimal(leon1);
        sector3.agregarAnimal(leon2);
        sector2.agregarAnimal(elefante1);
    
    }
}
