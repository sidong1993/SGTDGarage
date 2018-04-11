package com.sg.tdgarage.event;

import com.sg.tdgarage.structure.Building;
import com.sg.tdgarage.structure.TimeSpot;

public class MessageEvent extends Event {

    private final String msg;
    private final Object obj;
    private final Building building;

    public MessageEvent(TimeSpot time, Building building, Object obj, String msg) {
        this.time = time;
        this.building = building;
        this.obj = obj;
        this.msg = msg;
    }

    @Override
    public void action() {
        System.out.println(this.time + "~" + building + "~" + obj + "~" + this.msg);
    }
}
