package com.kol19pl;

import javafx.scene.text.Text;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        Okno gluwne = new Okno("Gluwne","Main");
        gluwne.setSize(800,600);
        gluwne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gluwne.setLayout(new FlowLayout(FlowLayout.LEFT));

        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();

        //menuBar
        MenuBarPliki MenuBar = new MenuBarPliki();
        gluwne.setJMenuBar(MenuBar);

        //Panel1
        JPanel panelPytan =new JPanel();
        panelPytan.setLayout(new FlowLayout());
        panelPytan.setPreferredSize(new Dimension(gluwne.getWidth(),gluwne.getHeight()/4));
        panelPytan.setBackground(Color.LIGHT_GRAY);


        //Input boxy
        JTextField  TextFieldPytanie = new JTextField();
        TextFieldPytanie.setText("Pytanie");
        TextFieldPytanie.setPreferredSize(new Dimension(600,24));
        TextFieldPytanie.setVisible(true);
        panelPytan.add(TextFieldPytanie);

        //Input boxy1
        JTextField  TextFieldOdp1 = new JTextField();
        TextFieldOdp1.setText("Odp1");
        TextFieldOdp1.setPreferredSize(new Dimension(600,24));
        TextFieldOdp1.setVisible(true);
        panelPytan.add(TextFieldOdp1);

        //chekbox1
        JCheckBox Odp1Chekbox = new JCheckBox();
        Odp1Chekbox.setText("Poprawna");
        Odp1Chekbox.setVisible(true);
        panelPytan.add(Odp1Chekbox);


        //Input boxy2
        JTextField  TextFieldOdp2 = new JTextField();
        TextFieldOdp2.setText("Odp2");
        TextFieldOdp2.setPreferredSize(new Dimension(600,24));
        TextFieldOdp2.setVisible(true);
        panelPytan.add(TextFieldOdp2);

        //chekbox2
        JCheckBox Odp2Chekbox = new JCheckBox();
        Odp2Chekbox.setText("Poprawna");
        Odp2Chekbox.setVisible(true);
        panelPytan.add(Odp2Chekbox);

        //Input boxy3
        JTextField  TextFieldOdp3 = new JTextField();
        TextFieldOdp3.setText("Odp3");
        TextFieldOdp3.setPreferredSize(new Dimension(600,24));
        TextFieldOdp3.setVisible(true);
        panelPytan.add(TextFieldOdp3);

        //chekbox3
        JCheckBox Odp3Chekbox = new JCheckBox();
        Odp3Chekbox.setText("Poprawna");
        Odp3Chekbox.setVisible(true);
        panelPytan.add(Odp3Chekbox);

        //Input boxy4
        JTextField  TextFieldOdp4 = new JTextField();
        TextFieldOdp4.setText("Odp4");
        TextFieldOdp4.setPreferredSize(new Dimension(600,24));
        TextFieldOdp4.setVisible(true);
        panelPytan.add(TextFieldOdp4);

        //chekbox4
        JCheckBox Odp4Chekbox = new JCheckBox();
        Odp4Chekbox.setText("Poprawna");
        Odp4Chekbox.setVisible(true);
        panelPytan.add(Odp4Chekbox);

        gluwne.add(panelPytan);

        //Buton zapisz
        JButton Butonzapisz = new JButton();
        Butonzapisz.setText("Zapisz");

        Butonzapisz.setSize(600,800);
        Butonzapisz.setVisible(true);
        gluwne.add(Butonzapisz);


        gluwne.setVisible(true);


    }
}
