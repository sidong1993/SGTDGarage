package com.sg.tdgarage.event;

import com.sg.tdgarage.core.Allocator;
import com.sg.tdgarage.structure.Bus;

public class DepartureEvent extends Event {
    private Allocator allocator;
    private Bus bus;

    public DepartureEvent(Bus bus, Allocator allocator) {
        this.time = bus.getDepartureTime();
        this.bus = bus;
        this.allocator = allocator;
    }

    @Override
    public void action() {
        allocator.schedule(this.time);
    }
}
