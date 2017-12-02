package guilauncher;

import model.Oven;
import com.company.OvenModelObserver;
import controller.OvenController;
import controller.StatePatternBasedController;
import view.OvenView;

import javax.swing.*;

public class OvenGui {

    public static void main(String[] args) {
        OvenController controller;
        Oven oven = new Oven();
        controller = new StatePatternBasedController();
        JFrame mainWin = new OvenView(controller);
        controller.setModel(oven);
        oven.addOvenModelObserver(((OvenModelObserver) mainWin));
        mainWin.setVisible(true);
        mainWin.setTitle("Mikrowellenofen");
        mainWin.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

     }
}