package model;

import com.company.OvenModelObserver;
import model.OvenModel;
import states.OvenIdleState;
import states.OvenState;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcel on 27.11.2017.
 */
public class Oven implements OvenModel {
    private boolean isHeating;
    private boolean isOpen;
    private boolean lampOn;
    private final List<OvenModelObserver> observers = new ArrayList<OvenModelObserver>();
    private OvenState state;


    public Oven(){
        setState(new OvenIdleState(this));
    }

    public void setState(OvenState state){
        this.state = state;
    }

    public OvenState getState(){
        return this.state;
    }

    public void start(){

    }

    public void door(){

    }


    public boolean isDoorOpen() { return isOpen; }

    public boolean isHeating() { return isHeating; }

    public boolean isLampOn() { return lampOn; }


    public void setDoor(final boolean open) {
        isOpen = open;
        updateObservers();
    }
    public void setHeating(final boolean on) {
        isHeating = on;
        updateObservers();
    }
    public void setLamp(final boolean on) {
        lampOn = on;
        updateObservers();
    }
    private void updateObservers() {
        for (OvenModelObserver observer : observers) {
            observer.update(this);
        }
    }
    public void addOvenModelObserver(final OvenModelObserver observer) {
        observers.add(observer);
        updateObservers();
    }
}
