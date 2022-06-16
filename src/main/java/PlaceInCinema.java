public class PlaceInCinema {

    private final int number;
    private final int row;
    private boolean isTaken;

    public PlaceInCinema(int number, int row) {
        this.number = number;
        this.row = row;
        this.isTaken = false;
    }

    public int getNumber() {
        return number;
    }

    public int getRow() {
        return row;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

}