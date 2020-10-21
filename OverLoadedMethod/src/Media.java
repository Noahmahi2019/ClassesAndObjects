public class NetflixApp {
    private String program;
    private String title;
    private String startingDate;
    private double length;
    private boolean advertisement;

    public NetflixApp(String program, String title, String categories, String startingDate, double length) {
        this.program = program;
        this.title = title;
        this.startingDate = startingDate;
        this.advertisement = false;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(boolean advertisement) {
        this.advertisement = advertisement;
    }
}
