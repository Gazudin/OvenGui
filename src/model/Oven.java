package model;

import com.company.OvenModelObserver;
import states.OvenHeatingState;
import states.OvenIdleState;
import states.OvenOpenState;
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

    // States
    private OvenState currentState;
    private OvenState idleState;
    private OvenState heatingState;
    private OvenState openState;

    // Set starting State
    public Oven(){
        idleState = new OvenIdleState(this);
        heatingState = new OvenHeatingState(this);
        openState = new OvenOpenState(this);
        setState(idleState);
    }

    public void setState(OvenState state){
        this.currentState = state;
    }

    public OvenState getState(){
        return this.currentState;
    }

    // State Getters
    public OvenState getIdleState(){
        return idleState;
    }
    public OvenState getHeatingState(){
        return heatingState;
    }
    public OvenState getOpenState(){
        return openState;
    }

    public void start(){
        getState().start(this);
    }

    public void door(){
        getState().door(this);
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
