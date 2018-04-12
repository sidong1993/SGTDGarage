package com.sg.tdgarage.configure;

import com.sg.tdgarage.structure.DistanceGraph;

public class BuildingConfiguration {
    public int floors = 4;
    public int parkingSpotPerFloor = 10;
    public DistanceGraph distanceGraph = new DistanceGraph();
    public boolean firstLevelEmpty = true;
}
