import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class TimeScheduler {
    //线路号
    private Integer busLine;
    //时刻表
    private HashMap<Date,Integer> timeList= new HashMap<Date,Integer>();
    public HashMap<Date, Integer> getTimeList() {
        return timeList;
    }

    public TimeScheduler setTimeList(HashMap<Date, Integer> timeList) {
        this.timeList = timeList;
        return this;
    }
    public void add(Date time , Integer TimeInterval){
        this.timeList.put(time, TimeInterval);
    }

    public Integer getBusLine() {
        return busLine;
    }

    public TimeScheduler setBusLine(Integer busLine) {
        this.busLine = busLine;
        return this;
    }

}
