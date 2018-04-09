public class Lifter {
    //状态
    private Integer state;
    //当前行为要花费的时间
    private Double currentCostTime;
    //楼号
    private Integer buildNum;

    public Lifter(){
        this.state = Constant.ON_FREE;
    }

    public Integer getState() {
        return state;
    }

    public Lifter setState(Integer state) {
        this.state = state;
        return this;
    }
    public Double getCurrentCostTime() {
        return currentCostTime;
    }

    public Lifter setCurrentCostTime(Double currentCostTime) {
        this.currentCostTime = currentCostTime;
        return this;
    }

    public Integer getBuildNum() {
        return buildNum;
    }

    public Lifter setBuildNum(Integer buildNum) {
        this.buildNum = buildNum;
        return this;
    }


}
