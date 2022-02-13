package com.kol19pl;

import com.sun.javafx.scene.web.Debugger;
import jdk.nashorn.internal.runtime.Debug;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MenuBarPliki extends JMenuBar {
    PodglondPytan pp = new PodglondPytan();

    public MenuBarPliki(){
        //JMenuBar MenuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Plik");

        JMenuItem MenuItemWczytaj = new JMenuItem("Wczytaj");
        MenuItemWczytaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                int returnVal = fc.showOpenDialog(MenuBarPliki.this);
                if (returnVal == JFileChooser.APPROVE_OPTION)
                {
                    File file = fc.getSelectedFile();
                    System.out.println("Otwieram: " + file.getName() + ".");
                }else {
                    System.out.println("Zjebane.");
                }

            }
        });



        JMenuItem MenuItemZapisz = new JMenuItem("Zapisz");
        MenuItemZapisz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                int returnVal = fc.showSaveDialog(MenuBarPliki.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    //This is where a real application would save the file.
                    System.out.println("Zapisuje w: " + file.getName() + ".");
                } else {
                    System.out.println("Zjebane.");
                }
            }
        });




        JMenuItem MenuItemWczytajOld = new JMenuItem("Wczytaj ext");
        MenuItemWczytajOld.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                int returnVal = fc.showOpenDialog(MenuBarPliki.this);
                if (returnVal == JFileChooser.APPROVE_OPTION)
                {
                    File file = fc.getSelectedFile();
                    System.out.println("Otwieram: " + file.getName() + ".");
                }else {
                    System.out.println("Zjebane.");
                }

            }
        });




        menu1.add(MenuItemWczytaj);
        menu1.add(MenuItemZapisz);
        menu1.add(MenuItemWczytajOld);





        this.add(menu1);




        JMenu menu2 = new JMenu("Okna");
        JMenuItem PodglondPytan = new JMenuItem("Podglond pytań");
        PodglondPytan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                 String[] args = new String[0];
                 pp.main(args);

            }
        });



        menu2.add(PodglondPytan);

        this.add(menu2);

    }
}
