package com.kol19pl;

import javax.swing.*;

public class MenuBarPliki extends JMenuBar {


    public MenuBarPliki(){
        //JMenuBar MenuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Plik");

        JMenuItem MenuItemWczytaj = new JMenuItem("Wczytaj");
        JMenuItem MenuItemZapisz = new JMenuItem("Zapisz");

        menu1.add(MenuItemWczytaj);
        menu1.add(MenuItemZapisz);

        this.add(menu1);

    }
}
