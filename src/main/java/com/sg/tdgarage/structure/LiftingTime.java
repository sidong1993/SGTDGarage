package com.sg.tdgarage.structure;

public class LiftingTime {
    private int[] liftingTimes = new int[]{0, 0, 16, 29, 43};

    public int getLiftingTime(int floor) {
        return liftingTimes[floor];
    }
}
