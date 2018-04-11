package com.sg.tdgarage.structure;

import com.sg.tdgarage.configure.BuildingConfiguration;
import com.sg.tdgarage.core.Constant;

public class Building {
    private int no;
    private ParkingSpot[][] spots;
    private DistanceGraph distanceGraph;
    private Lifter lifter;
    private Shuttle[] shuttles;
    private int allocatingFloor;
    private int[] floorScanSequence;
    private int scanIdx = 0;
    private boolean done = false;

    public Building(int no, BuildingConfiguration config) {
        this.no = no;
        this.distanceGraph = config.distanceGraph;
        this.spots = new ParkingSpot[config.floors + 1][];
        this.shuttles = new Shuttle[config.floors + 1];

        int floor = 1;
        if (config.firstLevelEmpty) {
            ++floor;
        }

        for (; floor <= config.floors; ++floor) {
            ParkingSpot[] levelSpots = spots[floor] = new ParkingSpot[config.parkingSpotPerFloor +
                    1];
            for (int spotNo = 1; spotNo <= config.parkingSpotPerFloor; ++spotNo) {
                levelSpots[spotNo] = new ParkingSpot(floor, spotNo);
            }
        }
    }

    public Shuttle getShuttle(int floor) {
        return shuttles[floor];
    }

    public void setShuttle(int floor, Shuttle shuttle) {
        this.shuttles[floor] = shuttle;
    }

    public Lifter getLifter() {
        return lifter;
    }

    public void useParkingSpot(int floor, int spotNo) {
        spots[floor][spotNo].setUsed(null);
    }

    public void moveShuttleHere(int floor) {
        shuttles[floor].setCurrentBuilding(this);
    }

    public Shuttle getShuttle() {
        return shuttles[allocatingFloor];
    }

    public ParkingSpot getParkingSpot() {
        if (done) {
            return null;
        }
        int allocatingFloor = getAllocatingFloor();
        ParkingSpot chosenSpot = null;
        for (ParkingSpot spot : spots[allocatingFloor]) {
            if (spot == null) {
                continue;
            }
            if (spot.isEmpty()) {
                if (chosenSpot == null ||
                        getDistance(spot.getSpotNo()) > getDistance(chosenSpot.getSpotNo())) {
                    chosenSpot = spot;
                }
            }
        }
        if (chosenSpot != null) {
            return chosenSpot;
        }
        shuttles[allocatingFloor].leaveBuilding(this);
        ++scanIdx;
        if (scanIdx == floorScanSequence.length) {
            done = true;
            return null;
        }
        return getParkingSpot();
    }

    public void setFloorScanSequence(int[] floorScanSequence) {
        this.floorScanSequence = floorScanSequence;
    }

    public int getAllocatingFloor() {
        return floorScanSequence[scanIdx];
    }

    public double getDistance(int spotNum) {
        return distanceGraph.getDistance(spotNum, Constant.LIFTER_SPOT_NO);
    }
}
