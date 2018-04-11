package com.sg.tdgarage.event;

import com.sg.tdgarage.structure.TimeSpot;

import java.io.PrintStream;

public abstract class Event implements Comparable<Event> {
    protected TimeSpot time;
    protected PrintStream out;

    @Override
    public int compareTo(Event that) {
        return this.time.interval(that.time);
    }

    public abstract void action();

    public void setPrintStream(PrintStream out) {
        this.out = out;
    }
}
