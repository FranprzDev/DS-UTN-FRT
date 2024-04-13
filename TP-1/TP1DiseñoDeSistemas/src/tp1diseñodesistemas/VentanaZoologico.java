/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1diseñodesistemas;

/**
 *
 * @author Ronald
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaZoologico extends JFrame {
    private ArrayList<Sector> listaSectores;
    private JLabel labelKgCarnivoros, labelKgHerbivoros, labelKgTotales;
    private JLabel labelNumCarnivoros, labelNumHerbivoros, labelNumTotales;
    private JButton botonAgregarAnimal, botonCalcularComida;
    
    
    public VentanaZoologico() {
        this.listaSectores = listaSectores;

        setTitle("Zoologico");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // BorderLayout para la ventana principal

        // Crear panel lateral con GridLayout para los botones y etiquetas
        JPanel panelLateral = new JPanel(new GridLayout(8, 1, 10, 10)); // GridLayout de 8 filas y 1 columna

        // Crear botones y etiquetas para el panel lateral
        botonAgregarAnimal = new JButton("Agregar Animal");
        botonCalcularComida = new JButton("Calcular Comida");

        labelKgCarnivoros = new JLabel("Kg Carnívoros: ");
        labelNumCarnivoros = new JLabel("0");

        labelKgHerbivoros = new JLabel("Kg Herbívoros: ");
        labelNumHerbivoros = new JLabel("0");

        labelKgTotales = new JLabel("Kg Totales: ");
        labelNumTotales = new JLabel("0");

        // Agregar botones y etiquetas al panel lateral
        panelLateral.add(botonAgregarAnimal);
        panelLateral.add(botonCalcularComida);
        panelLateral.add(labelKgCarnivoros);
        panelLateral.add(labelNumCarnivoros);
        panelLateral.add(labelKgHerbivoros);
        panelLateral.add(labelNumHerbivoros);
        panelLateral.add(labelKgTotales);
        panelLateral.add(labelNumTotales);

        // Crear panel principal para la lista de animales
        
        ActionListener comida = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Controlador.eventoCalcularComida();
            }
        };
                
        botonCalcularComida.addActionListener(comida);
        
        ActionListener animal = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Controlador.eventoAgregarAnimal();
            }
        };
        
        botonAgregarAnimal.addActionListener(animal);
        // Agregar panel lateral y panel principal a la ventana principal
        add(panelLateral, BorderLayout.EAST);
    }
    
    
    
    public void agregarPaneles(ArrayList<Sector> listaSectores){
        JPanel panelPrincipal = new JPanel(new GridLayout(listaSectores.size(), 1)); // GridLayout con un panel por animal

        // Crear y agregar paneles para cada animal en la lista
        for (Sector s : listaSectores) {
            String especies = "";
            int cont=0;
            JPanel panelSector = new JPanel(new GridLayout(4, 1)); // GridLayout de 1 fila y 4 columnas para las etiquetas
            panelSector.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            
            JLabel labelNumero = new JLabel("Número: " + s.getNumero());
            for(Animal a : s.getListaAnimales()){

                especies = especies + a.getEsp().getNombre() + " - ";
                cont+=1;
            }
            JLabel labelEspecies = new JLabel("Especie: " + especies);
            JLabel labelCantidad = new JLabel("Cantidad: " + cont );
            JLabel labelUbicacion = new JLabel("Ubicación: " + s.getLatitud() + " , " + s.getLongitud());

            panelSector.add(labelNumero);
            panelSector.add(labelEspecies);
            panelSector.add(labelCantidad);
            panelSector.add(labelUbicacion);
            
            panelSector.setPreferredSize(new Dimension(250, 80));
            
            panelPrincipal.add(panelSector);
        }

        add(panelPrincipal, BorderLayout.WEST);
    }

    public void setLabelNumCarnivoros(String x) {
        labelNumCarnivoros.setText(x);
    }

    public void setLabelNumHerbivoros(String x) {
        labelNumHerbivoros.setText(x);
    }

    public void setLabelNumTotales(String x) {
        labelNumTotales.setText(x);
    }

    

}
