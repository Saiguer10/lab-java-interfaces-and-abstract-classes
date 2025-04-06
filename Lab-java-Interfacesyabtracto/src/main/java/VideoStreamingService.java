public abstract class VideoStreamingService {
    protected String title;
    protected int duration;

    public VideoStreamingService(String title, int duration) {

        this.title = title;
        this.duration = duration;
    }

    public abstract String getInfo();

}
