package com.sg.tdgarage.configure;

public class ParkingLotConfiguration {
    public int buildings = 4;
    public BuildingConfiguration[] buildingConfigs;
    public ShuttleConfiguration[] shuttleConfigs;

    public ParkingLotConfiguration() {
        buildingConfigs = new BuildingConfiguration[buildings + 1];
        for (int i = 1; i <= buildings; ++i) {
            buildingConfigs[i] = new BuildingConfiguration();
        }
        shuttleConfigs = new ShuttleConfiguration[2];
        shuttleConfigs[0] = new ShuttleConfiguration(new int[]{1, 2});
        shuttleConfigs[1] = new ShuttleConfiguration(new int[]{3, 4});
    }
}
