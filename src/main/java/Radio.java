public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationCount = 10;

    public Radio (int stationCount) {
        this.stationCount = stationCount;

    }

    public int getStationCount() {
        return stationCount;
    }

    public void setStationCount(int stationCount) {
        this.stationCount = stationCount;
    }


    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }

    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void add() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 0;
        }
    }

    public void reduce() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            return;
        }
        if (currentVolume >= 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
