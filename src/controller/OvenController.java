package controller;

import com.company.OvenEvent;
import model.OvenModel;

/**
 * Created by Marcel on 27.11.2017.
 */
public interface OvenController {
    void setModel(final OvenModel model);
    void handleEvent(final OvenEvent event);
}
