package entites;

public class Train {
    private String trainName;
    private String trainNumber;

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
