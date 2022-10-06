package Chapter04;

public class Grade {

    int math;
    int science;
    int english;

    public Grade(int math, int science, int english) {
        this.english = english;
        this.science = science;
        this.math = math;
    }

    public int average(){
        return (math+science+english)/3;
    }
}
