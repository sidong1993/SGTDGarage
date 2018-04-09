public class ParkingLot {
    //楼号
    private Integer buildingNum;
    //状态
    private Integer state;
    //车位编号
    private Integer num;
    //车位坐标
    private Position position;
    //楼层编号
    private Integer floorNum;
    //车
    private Bus bus;

    public Bus getBus() {
        return bus;
    }

    public ParkingLot setBus(Bus bus) {
        this.bus = bus;
        return this;
    }

    public Integer getBuildingNum() {
        return buildingNum;
    }

    public ParkingLot setBuildingNum(Integer buildingNum) {
        this.buildingNum = buildingNum;
        return this;
    }

    public Position getPosition() {
        return position;
    }

    public ParkingLot setPosition(Position position) {
        this.position = position;
        return this;
    }


    public ParkingLot(){
        Integer state = Constant.LOT_FREE;
    }

    public Integer getState() {
        return state;
    }

    public ParkingLot setState(Integer state) {
        this.state = state;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public ParkingLot setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getFloorNum() {
        return floorNum;
    }

    public ParkingLot setFloorNum(Integer floorNum) {
        this.floorNum = floorNum;
        return this;
    }
    public ParkingLot build(){
        this.bus = new Bus().setBuildingNum(this.buildingNum).setFloorNum(this.floorNum).setLotNum(this.num);
        return this;
    }

}
