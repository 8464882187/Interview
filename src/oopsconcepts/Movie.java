package oopsconcepts;

public class Movie {
    private String title;
    private String director;
    private int duration;
    public Movie(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }
    public String getTitle() {
        return String.format(title);
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return String.format(director);
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public static void getMovieDetails(String title,String director, Integer duration){
        System.out.println(String.format(title));
        System.out.println(String.format(director));
        System.out.println(Integer.toString(duration));
    }

    public static  void main(String[] args){
        Movie m = new Movie("Devara","Rajamouli",30);
        System.out.println(m.getDirector()+" "+m.getDuration()+" "+m.getTitle());
        getMovieDetails("pushpa","akshay",60);
        System.out.println(m);
    }

}
