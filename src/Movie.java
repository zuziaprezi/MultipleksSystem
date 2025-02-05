public class Movie {
    private String title;
    private String director;
    private String duration;

    public Movie(String title, String director, String duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return this.director;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDuration() {
        return this.duration;
    }
}

