package controller;

import model.Oven;

/**
 * Created by Marcel on 27.11.2017.
 */
public interface OvenController {
    void setModel(final Oven model);
    void handleStart();
    void handleDoor();
}
