package com.kol19pl;

import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame {


    public Okno(String Nazwa,String Tytuł){
        this.setName(Nazwa);
        this.setTitle(Tytuł);
        this.setMinimumSize(new Dimension(800,600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setEnabled(true);
        this.setVisible(true);

    }

}
