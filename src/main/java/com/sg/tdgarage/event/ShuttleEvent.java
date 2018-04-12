package com.sg.tdgarage.event;

import com.sg.tdgarage.structure.Shuttle;
import com.sg.tdgarage.structure.TimeSpot;

public class ShuttleEvent extends Event{
    private Shuttle shuttle;

    public ShuttleEvent(Shuttle shuttle, TimeSpot endTime) {
        this.time = endTime;
        this.shuttle = shuttle;
    }

    @Override
    public void action() {

    }
}
