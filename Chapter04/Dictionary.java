package Chapter04;

public class Dictionary {

    private static String [] kor = {"사랑","아기","돈","미래","희망"};
    private static String [] eng = {"love","baby","money","future","hope"};

    public static String kore2eng(String word){

        boolean check = false;

        for(int i=0; i< kor.length;i++){
            if(word.equals(kor[i])){
                return (eng[i]);

            }
        }

        for(int i=0; i< eng.length;i++){
            if(word.equals(eng[i])){
                return (kor[i]);

            }
        }



        return "no";
    }
}
