package com.sg.tdgarage.structure;

import com.sg.tdgarage.configure.ParkingLotConfiguration;
import com.sg.tdgarage.configure.ShuttleConfiguration;
import com.sg.tdgarage.core.Constant;
import com.sg.tdgarage.event.EventDriver;

import java.util.LinkedList;
import java.util.List;

public class ParkingLot {
    private Building[] buildings;
    private int buildingNum;
    private List<Shuttle> shuttleList;
    private int roundIdx = 1;

    public ParkingLot(ParkingLotConfiguration config) {
        this.buildings = new Building[config.buildings + 1];
        this.buildingNum = config.buildings;
        this.shuttleList = new LinkedList<>();

        for (int buildingNo = 1; buildingNo <= config.buildings; ++buildingNo) {
            buildings[buildingNo] = new Building(buildingNo, config.buildingConfigs[buildingNo]);
        }

        for (ShuttleConfiguration shuttleConfig : config.shuttleConfigs) {
            int floors = config.buildingConfigs[shuttleConfig.owners[0]].floors;
            int[] ownerNos = shuttleConfig.owners;
            for (int floor = 2; floor <= floors; ++floor) {
                Building[] owners = new Building[]{buildings[ownerNos[0]], buildings[ownerNos[1]]};
                Shuttle shuttle = new Shuttle(owners, floor);
                for (Building owner : owners) {
                    owner.setShuttle(floor, shuttle);
                }
                shuttleList.add(shuttle);
            }
        }
    }

    public Building[] getBuildings() {
        return buildings;
    }

    private Building nextBuilding() {
        Building building = buildings[roundIdx];
        ++roundIdx;
        if (roundIdx == buildingNum) {
            roundIdx = 1;
        }
        return building;
    }


}
