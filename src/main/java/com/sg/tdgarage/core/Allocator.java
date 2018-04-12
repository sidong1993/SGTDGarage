package com.sg.tdgarage.core;

import com.sg.tdgarage.event.DepartureEvent;
import com.sg.tdgarage.event.EventDriver;
import com.sg.tdgarage.event.EventRecorder;
import com.sg.tdgarage.event.MessageEvent;
import com.sg.tdgarage.structure.*;

import java.util.List;
import java.util.Queue;

public class Allocator {
    private final ParkingLot lot;
    private final Queue<Bus> busQueue;
    private final List<BusLine> lineList;

    public Allocator(ParkingLot lot, Queue<Bus> busQueue, List<BusLine> lineList) {
        this.lot = lot;
        this.busQueue = busQueue;
        this.lineList = lineList;
    }

    public void schedule(Bus departureBus, TimeSpot time) {
        if (busQueue.isEmpty()) {
            EventRecorder.record(new MessageEvent(time, null, departureBus, "发车"));
            return;
        }
        Bus bus = busQueue.poll();
        Building building  = lot.allocateParkingSpot(departureBus, bus, time);
        EventRecorder.record(new MessageEvent(time, building, departureBus, "发车"));
        EventDriver.newEnvent(new DepartureEvent(bus, this));
    }

    public void prepare() {
        Building[] buildings = lot.getBuildings();
        int floor = 4;
        for (Building building : buildings) {
            if (building == null) {
                continue;
            }
            building.useParkingSpot(floor, 1);
            building.useParkingSpot(floor, 10);
            if (floor == 4) {
                floor = 3;
            } else {
                floor = 4;
            }
        }
        for (int i = 0; i < 8; ++i) {
            Bus bus = busQueue.poll();
            EventDriver.newEnvent(new DepartureEvent(bus, this));
        }
        buildings[2].moveShuttleHere(3);
        buildings[4].moveShuttleHere(3);
    }
}
