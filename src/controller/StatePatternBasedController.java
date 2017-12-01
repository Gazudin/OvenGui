package controller;

import com.company.OvenEvent;
import model.OvenModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Marcel on 27.11.2017.
 */
public class StatePatternBasedController implements OvenController {

    private OvenModel ovenModel;

    public void handleEvent(final OvenEvent event) {
        switch(event){
            case DOOR:
                if(ovenModel.isDoorOpen()){
                    ovenModel.setLamp(false);
                    ovenModel.setDoor(false);
                }else{
                    ovenModel.setLamp(true);
                    ovenModel.setHeating(false);
                    ovenModel.setDoor(true);
                }
                break;
            case START:
                if(!ovenModel.isDoorOpen() && !ovenModel.isHeating()){
                    ovenModel.setLamp(true);
                    ovenModel.setHeating(true);
                    Timer timer = new Timer(6000, new ActionListener() {
                        public void actionPerformed(final ActionEvent e) {
                            handleEvent(OvenEvent.STOP);
                        }
                    });
                    timer.start();
                }
                break;
            case STOP:
                if(ovenModel.isHeating()){
                    ovenModel.setHeating(false);
                    ovenModel.setLamp(false);
                }
            }
    }

    public void setModel(OvenModel model) {
        this.ovenModel = model;
    }
}

