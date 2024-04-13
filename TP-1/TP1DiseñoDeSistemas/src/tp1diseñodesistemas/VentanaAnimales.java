/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1diseñodesistemas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 *
 * @author Ronald
 */
public class VentanaAnimales extends JFrame {
    private JLabel labelPeso, labelEdad, labelValorFijo, labelPais, labelSector, labelEspecie;
    private JTextField campoPeso, campoEdad, campoValorFijo;
    private JComboBox<String> comboBoxPais, comboBoxSector, comboBoxEspecie;
    private JButton botonAgregarAnimal;

    public VentanaAnimales() {
        // Configuración básica de la ventana
        setTitle("Datos del Animal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));

        labelPeso = new JLabel("Peso:");
        campoPeso = new JTextField();
        add(labelPeso);
        add(campoPeso);

        labelEdad = new JLabel("Edad:");
        campoEdad = new JTextField();
        add(labelEdad);
        add(campoEdad);

        labelPais = new JLabel("País:");
        comboBoxPais = new JComboBox<>();
        add(labelPais);
        add(comboBoxPais);

        labelSector = new JLabel("Sector:");
        comboBoxSector = new JComboBox<>();
        add(labelSector);
        add(comboBoxSector);

        labelEspecie = new JLabel("Especie:");
        comboBoxEspecie = new JComboBox<>();
        add(labelEspecie);
        add(comboBoxEspecie);
        
        labelValorFijo = new JLabel("Valor Fijo:");
        campoValorFijo = new JTextField();
        add(labelValorFijo);
        add(campoValorFijo);
        
        botonAgregarAnimal = new JButton("Añadir animal");
        add(botonAgregarAnimal);
        
        ActionListener animal = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Controlador.eventoAgregarNuevo();
            }
        };
        
        botonAgregarAnimal.addActionListener(animal);
    }
    
    public void ponerEnBlanco(){
        campoValorFijo.setText("");
        campoEdad.setText("");
        campoPeso.setText("");
    }
    
    public void mostrarValorFijo() {
        labelValorFijo.setVisible(true);
        campoValorFijo.setVisible(true);
    }

    public void ocultarValorFijo() {
        labelValorFijo.setVisible(false);
        campoValorFijo.setVisible(false);
    }

    public JComboBox<String> getComboBoxPais() {
        return comboBoxPais;
    }

    public JComboBox<String> getComboBoxSector() {
        return comboBoxSector;
    }

    public JComboBox<String> getComboBoxEspecie() {
        return comboBoxEspecie;
    }

    public JTextField getCampoPeso() {
        return campoPeso;
    }

    public JTextField getCampoEdad() {
        return campoEdad;
    }

    public JTextField getCampoValorFijo() {
        return campoValorFijo;
    }
    
    
}
