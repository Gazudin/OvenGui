package states;

import model.Oven;

/**
 * Created by Marcel on 27.11.2017.
 */
public interface OvenState {
    void start(Oven oven);
    void door(Oven oven);
}
