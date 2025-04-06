public class Movie extends VideoStreamingService {
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public String getInfo() {
        return "Movie - Title: " + title + ", Duration: " + duration + " minutes, Rating: " + rating;
    }
}
