package com.company;

import javax.swing.*;

public class OvenGui {

    public static void main(String[] args) {
        OvenController controller;
        OvenModel oven = new Oven();
        controller = new GeradeausController();
        JFrame mainWin = new OvenView(controller);
        controller.setModel(oven);
        oven.addOvenModelObserver(((OvenModelObserver) mainWin));
        mainWin.setVisible(true);
        mainWin.setTitle("Mikrowellenofen");
        mainWin.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        // write your code here
    }
}
