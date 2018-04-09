public class HorizontalShuttle {
    //状态
    private Integer state;
    //梭车相对楼层的位置
    private Position position;
    //楼号
    private Integer buildingNum;
    //层号
    private Integer floorNum;
    //当前行为要花费的时间
    private Double currentCostTime;

    public HorizontalShuttle(int buildingNum){
        this.state = Constant.ON_FREE;
        this.position = new Position(Constant.MID,0);
        this.buildingNum = buildingNum;
    }
    public Integer getState() {
        return state;
    }

    public HorizontalShuttle setState(Integer state) {
        this.state = state;
        return this;
    }

    public Position getPosition() {
        return position;
    }

    public HorizontalShuttle setPosition(Position position) {
        this.position = position;
        return this;
    }

    public Integer getBuildingNum() {
        return buildingNum;
    }

    public HorizontalShuttle setBuildingNum(Integer buildingNum) {
        this.buildingNum = buildingNum;
        return this;
    }

    public Integer getFloorNum() {
        return floorNum;
    }

    public HorizontalShuttle setFloorNum(Integer floorNum) {
        this.floorNum = floorNum;
        return this;
    }

    public Double getCurrentCostTime() {
        return currentCostTime;
    }

    public HorizontalShuttle setCurrentCostTime(Double currentCostTime) {
        this.currentCostTime = currentCostTime;
        return this;
    }




}
