public class TvSeries extends VideoStreamingService {

    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public String getInfo() {
        return "Tv Series - Title: " + title + ", Duration: " + duration + " minutes, Episodes: " + episodes;
    }
}


