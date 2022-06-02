public class PlaceInTheCinema {

    private int  seatNumber;
    private int seatRow;
    private boolean seatState;

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(int seatRow) {
        this.seatRow = seatRow;
    }

    public boolean isSeatState() {
        return seatState;
    }

    public void setSeatState(boolean seatState) {
        this.seatState = seatState;
    }

    public PlaceInTheCinema(int seatNumber, int seatRow, boolean seatState) {
        this.seatNumber = seatNumber;
        this.seatRow = seatRow;
        this.seatState = seatState;


    }

}

