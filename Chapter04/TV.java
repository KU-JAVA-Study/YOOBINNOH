package Chapter04;

public class TV {

    String name;
    int year;
    int size;

    public TV(String name, int year, int size) {
        this.name = name;
        this.year = year;
        this.size = size;
    }

    public void show() {
        System.out.println(name + " " + year + " "+ size);
    }
}

