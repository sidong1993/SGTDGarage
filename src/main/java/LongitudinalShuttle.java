public class LongitudinalShuttle {
    //状态
    private Integer state;
    //当前行为要花费的时间
    private Double currentCostTime;
    //楼号
    private Integer buildingNum;
    //层号
    private Integer floorNum;

    public LongitudinalShuttle(){
        this.state = Constant.ON_FREE;
    }
    public Integer getState() {
        return state;
    }

    public LongitudinalShuttle setState(Integer state) {
        this.state = state;
        return this;
    }

    public Double getCurrentCostTime() {
        return currentCostTime;
    }

    public LongitudinalShuttle setCurrentCostTime(Double currentCostTime) {
        this.currentCostTime = currentCostTime;
        return this;
    }

    public Integer getBuildingNum() {
        return buildingNum;
    }

    public LongitudinalShuttle setBuildingNum(Integer buildingNum) {
        this.buildingNum = buildingNum;
        return this;
    }

    public Integer getFloorNum() {
        return floorNum;
    }

    public LongitudinalShuttle setFloorNum(Integer floorNum) {
        this.floorNum = floorNum;
        return this;
    }



}
