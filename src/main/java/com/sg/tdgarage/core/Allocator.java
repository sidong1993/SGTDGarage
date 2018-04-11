package com.sg.tdgarage.core;

import com.sg.tdgarage.event.DepartureEvent;
import com.sg.tdgarage.event.EventDriver;
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

    public void schedule(TimeSpot time) {

    }

    public void prepare() {
        Building[] buildings = lot.getBuildings();
        for (Building building : buildings) {
            if (building == null) {
                continue;
            }
            building.useParkingSpot(3, 1);
            building.useParkingSpot(3, 10);
            building.useParkingSpot(3, 5);
            building.useParkingSpot(3, 4);
            building.useParkingSpot(4, 1);
            building.useParkingSpot(4, 10);
            building.useParkingSpot(4, 4);
            building.useParkingSpot(4, 5);
        }
        for (int i = 0; i < 32; ++i) {
            Bus bus = busQueue.poll();
            EventDriver.newEnvent(new DepartureEvent(bus, this));
        }

        buildings[2].moveShuttleHere(3);
        buildings[4].moveShuttleHere(3);
    }
}
