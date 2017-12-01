package controller;

import model.Oven;

/**
 * Created by Marcel on 27.11.2017.
 */
public class StatePatternBasedController implements OvenController {

    private Oven ovenModel;


    public void handleStart() {
        ovenModel.getState().start(ovenModel);
    }

    @Override
    public void handleDoor() {
        ovenModel.getState().door(ovenModel);
    }

    @Override
    public void setModel(Oven model) {
        this.ovenModel = model;
    }
}

