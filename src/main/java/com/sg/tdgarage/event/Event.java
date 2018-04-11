package com.sg.tdgarage.event;

import com.sg.tdgarage.structure.TimeSpot;

public abstract class Event implements Comparable<Event>{
   protected TimeSpot time;

    @Override
    public int compareTo(Event that) {
        return this.time.interval(that.time);
    }

    public abstract void action();
}
