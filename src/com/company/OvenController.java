package com.company;

/**
 * Created by Marcel on 27.11.2017.
 */
public interface OvenController {
    void setModel(final OvenModel model);
    public void handleEvent(final OvenEvent event);
}
