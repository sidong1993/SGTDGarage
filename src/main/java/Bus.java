public class Bus {
    //停车位号
    private Integer lotNum;
    //层号
    private Integer floorNum;
    //楼号
    private Integer buildingNum;
    //出车所需时间
    private Double leaveCostTime;
    //线路号
    private Integer busLine;
    public Integer getBusLine() {
        return busLine;
    }

    public Bus setBusLine(Integer busLine) {
        this.busLine = busLine;
        return this;
    }

    public Integer getLotNum() {
        return lotNum;
    }

    public Bus setLotNum(Integer lotNum) {
        this.lotNum = lotNum;
        return this;
    }

    public Integer getFloorNum() {
        return floorNum;
    }

    public Bus setFloorNum(Integer floorNum) {
        this.floorNum = floorNum;
        return this;
    }

    public Integer getBuildingNum() {
        return buildingNum;
    }

    public Bus setBuildingNum(Integer buildingNum) {
        this.buildingNum = buildingNum;
        return this;
    }

    public Double getLeaveCostTime() {
        return leaveCostTime;
    }

    public Bus setLeaveCostTime(Double leaveCostTime) {
        this.leaveCostTime = leaveCostTime;
        return this;
    }
}
