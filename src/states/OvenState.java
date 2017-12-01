package states;

import model.Oven;
import model.OvenModel;

/**
 * Created by Marcel on 27.11.2017.
 */
public interface OvenState {
    void doAction(OvenContext oontext);
    void door(OvenContext oontext);
}
