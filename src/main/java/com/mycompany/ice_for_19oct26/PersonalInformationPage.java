/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice_for_19oct26;

/**
 *
 * @author Trxy Jxy
 */

import javax.swing.*;
import java.awt.*;

public class PersonalInformationPage extends JFrame {
    
    public PersonalInformationPage() {
       
        super("Personal Information Page");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 15));

        
        JLabel firstNameLabel = new JLabel("First name");
        JTextField firstNameField = new JTextField(15);

        JLabel surnameLabel = new JLabel("Surname");
        JTextField surnameField = new JTextField(15);

        JLabel provinceLabel = new JLabel("Province of residence");

        String[] provinces = {"Province", "Gauteng", "Western Cape", "Eastern Cape", "Mpumalanga", "Free State"};
        JComboBox<String> provinceComboBox = new JComboBox<>(provinces);

        JLabel hobbiesLabel = new JLabel("Select hobbies");

        JCheckBox cricketBox = new JCheckBox("Cricket");
        JCheckBox rugbyBox = new JCheckBox("Rugby");
        JCheckBox footballBox = new JCheckBox("Football");
        JCheckBox volleyballBox = new JCheckBox("Volleyball");

        JButton submitButton = new JButton("Submit");

        add(firstNameLabel);
        add(firstNameField);
        
        add(surnameLabel);
        add(surnameField);

        add(provinceLabel);
        add(provinceComboBox);

        add(hobbiesLabel);

        JPanel hobbyPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        hobbyPanel.add(cricketBox);
        hobbyPanel.add(rugbyBox);
        hobbyPanel.add(footballBox);
        hobbyPanel.add(volleyballBox);
        

        add(hobbyPanel);

        add(submitButton);
    }
}
