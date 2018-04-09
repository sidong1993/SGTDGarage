public class Position {
    //x轴位置
    private Double x;
    //y轴位置
    private Double y;
    //起始点为每层1号车位
    public Position(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public Position setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public Position setY(double y) {
        this.y = y;
        return this;
    }



}
