//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.List;

public class ScreeningRoom {
    private int roomNumber;
    private int capacity;
    private List<Seat> seats;

    public ScreeningRoom(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.seats = new ArrayList();
        this.addSeats(capacity);
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public List<Seat> getSeats() {
        return this.seats;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addSeats(int capacity) {
        for(int i = 0; i <= capacity; ++i) {
            this.seats.add(new Seat("H" + (0 + i)));
        }

    }
}
