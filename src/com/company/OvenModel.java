package com.company;

/**
 * Created by Marcel on 27.11.2017.
 */
public interface OvenModel {
    public void setLamp(boolean on);
    public boolean isLampOn();
    public void setHeating(boolean on);
    public boolean isHeating();
    public void setDoor(boolean open);
    public boolean isDoorOpen();
    public void addOvenModelObserver(final OvenModelObserver observer);
}
