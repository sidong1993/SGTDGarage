package com.sg.tdgarage.event;

import com.sg.tdgarage.structure.Lifter;
import com.sg.tdgarage.structure.TimeSpot;

public class LifterEvent extends Event{
    private Lifter lifter;

    public LifterEvent(Lifter lifter, TimeSpot endTime) {
        this.lifter = lifter;
        this.time = endTime;
    }

    @Override
    public void action() {
        
    }
}
