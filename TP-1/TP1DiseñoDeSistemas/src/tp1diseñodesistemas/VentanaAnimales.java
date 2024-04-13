/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1diseñodesistemas;
import javax.swing.*;
import java.awt.*;
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
        String[] paises = {"País 1", "País 2", "País 3"}; // Ejemplo de opciones para el JComboBox de países
        comboBoxPais = new JComboBox<>(paises);
        add(labelPais);
        add(comboBoxPais);

        labelSector = new JLabel("Sector:");
        String[] sectores = {"Sector 1", "Sector 2", "Sector 3"}; // Ejemplo de opciones para el JComboBox de sectores
        comboBoxSector = new JComboBox<>(sectores);
        add(labelSector);
        add(comboBoxSector);

        labelEspecie = new JLabel("Especie:");
        String[] especies = {"Especie 1", "Especie 2", "Especie 3"}; // Ejemplo de opciones para el JComboBox de especies
        comboBoxEspecie = new JComboBox<>(especies);
        add(labelEspecie);
        add(comboBoxEspecie);
        
        labelValorFijo = new JLabel("Valor Fijo:");
        campoValorFijo = new JTextField();
        add(labelValorFijo);
        add(campoValorFijo);
        
        botonAgregarAnimal = new JButton("Añadir animal");
        add(botonAgregarAnimal);
    }
    
    public void mostrarValorFijo() {
        labelValorFijo.setVisible(true);
        campoValorFijo.setVisible(true);
    }

    public void ocultarValorFijo() {
        labelValorFijo.setVisible(false);
        campoValorFijo.setVisible(false);
    }
}
