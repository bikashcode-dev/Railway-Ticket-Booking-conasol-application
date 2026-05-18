package entites;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainName;
    private String trainNumber;
    private List<List<Integer>> seats;
    private Map<String, Time> stationTime;

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public Map<String, Time> getStationTime() {
        return stationTime;
    }

    public void setStationTime(Map<String, Time> stationTime) {
        this.stationTime = stationTime;
    }

    public Train(String trainName, String trainNumber) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }
    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }
    public String getTrainNumber() {
        return trainNumber;
    }
    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }
}
