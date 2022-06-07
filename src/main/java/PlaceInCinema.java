public class PlaceInCinema {

    private int number;
    private int row;
    private boolean isTaken = false;

    public PlaceInCinema(int number, int row, boolean isTaken) {
        this.number = number;
        this.row = row;
        this.isTaken = isTaken;
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