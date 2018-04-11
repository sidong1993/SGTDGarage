package com.sg.tdgarage.structure;

public class ParkingSpot {

    //楼号
    private Integer buildingNum;
//    //状态
//    private Integer state;

    /**
     * 状态
     */
    private Status status;

//    //车位编号
//    private Integer num;
//    //车位坐标
//    private Position position;
//    //楼层编号
//    private Integer floorNum;

    /**
     * 车位位置
     */
    private PSPosition position;

    //车
    private Bus bus;

//    public ParkingSpot(){
//        Integer state = Constant.LOT_FREE;
//    }

    public ParkingSpot() {
        this.status = Status.EMPTY;
    }

    public ParkingSpot(int floor, int spotNo) {
        this.status = Status.EMPTY;
        this.position = new PSPosition(floor,spotNo);
    }

    public Bus getBus() {
        return bus;
    }

    public ParkingSpot setBus(Bus bus) {
        this.bus = bus;
        return this;
    }

    public Integer getBuildingNum() {
        return buildingNum;
    }

    public ParkingSpot setBuildingNum(Integer buildingNum) {
        this.buildingNum = buildingNum;
        return this;
    }

    public void setUsed(Bus bus) {
        this.status = Status.USED;
        this.bus = bus;
    }

    public boolean isEmpty() {
        return this.status == Status.EMPTY;
    }

    public int getFloor() {
        return this.position.getFloor();
    }

    public int getSpotNo() {
        return position.getSpotNo();
    }

//    public Position getPosition() {
//        return position;
//    }
//
//    public ParkingSpot setPosition(Position position) {
//        this.position = position;
//        return this;
//    }

//    public Integer getState() {
//        return state;
//    }
//
//    public ParkingSpot setState(Integer state) {
//        this.state = state;
//        return this;
//    }
//
//    public Integer getSpotNo() {
//        return num;
//    }
//
//    public ParkingSpot setNum(Integer num) {
//        this.num = num;
//        return this;
//    }
//    public Integer getFloorNum() {
//        return floorNum;
//    }
//
//    public ParkingSpot setFloorNum(Integer floorNum) {
//        this.floorNum = floorNum;
//        return this;
//    }
//    public ParkingSpot build(){
//        this.bus = new Bus().setBuildingNum(this.buildingNum).setFloorNum(this.floorNum).setLotNum(this.num);
//        return this;
//    }

    private enum Status {
        USED, EMPTY
    }
}
