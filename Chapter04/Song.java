package Chapter04;

public class Song {

    String title;
    String singer;
    int year;
    String country;

    public Song(String dancing_queen, String abba, int i, String 스웨덴) {
        this.title = dancing_queen;
        this.singer = abba;
        this.year = i;
        this.country = 스웨덴;
    }

    public Song(){

    }

    public void show(){
        System.out.println(title + " "+ singer + " " + year + " " + country);
    }
}
