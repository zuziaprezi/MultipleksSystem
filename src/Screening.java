//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Screening {
    private Movie movie;
    private LocalDateTime startTime;
    private ScreeningRoom room;
    private List<Seat> seats;
    private boolean is3D;
    private boolean isVIP;
    private Cinema cinema;

    public Screening(Cinema cinema, Movie movie, LocalDateTime startTime, ScreeningRoom room, boolean is3D, boolean isVIP) {
        this.cinema = cinema;
        this.movie = movie;
        this.startTime = startTime;
        this.room = room;
        this.is3D = is3D;
        this.isVIP = isVIP;
        this.seats = new ArrayList();

        for(Seat seat : room.getSeats()) {
            this.seats.add(new Seat(seat.getSeatNumber()));
        }

    }

    public Movie getMovie() {
        return this.movie;
    }

    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    public ScreeningRoom getScreeningRoom() {
        return this.room;
    }

    public Cinema getCinema() {
        return this.cinema;
    }

    public List<Seat> getSeats() {
        return new ArrayList(this.seats);
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public ScreeningRoom getRoom() {
        return this.room;
    }

    public boolean getIs3D() {
        return this.is3D;
    }

    public boolean getIsVIP() {
        return this.isVIP;
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String var10000 = this.movie.getTitle();
        return "Film: " + var10000 + ", Data i godzina: " + this.startTime.format(formatter);
    }
}

