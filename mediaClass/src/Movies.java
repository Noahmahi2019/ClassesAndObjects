public class Movies {
    private String title;
    private int lengthInMinutes;
    private String[] Actors;

    public Movies(String title, int lengthInMinutes, String[] Actors) {

        this.title = title;
        this.lengthInMinutes = lengthInMinutes;
        this.Actors = Actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }
    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }
    public String[] getActors() {
        return Actors;
    }
    public void setActors(String[] actors) {
        this.Actors =Actors;
    }
}
