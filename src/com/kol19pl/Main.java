package com.kol19pl;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Okno gluwne = new Okno("Gluwne","Main");
        gluwne.setSize(800,600);



        MenuBarPliki MenuBar = new MenuBarPliki();
        gluwne.setJMenuBar(MenuBar);

       // gluwne.setLayout(new FlowLayout());
        gluwne.setLayout(new FlowLayout());
        Label test = new Label();
        test.setText("test");

        gluwne.add(test);
        Button button = new Button();
       // button.setSize(20,10);
        button.setLabel("OK");
        gluwne.add(button);

        TextField textField= new TextField();
        textField.setMinimumSize(new Dimension(1000,100));
        gluwne.add(textField);

    }
}
