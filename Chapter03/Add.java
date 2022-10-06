package Chapter03;

public class Add {
    public static void main(String args[]){

    int plus = 0;

    for(int i =0; i< args.length; i++){
        try{
            plus+=Integer.parseInt(args[i]);

        }
        catch(NumberFormatException nfe){
            continue;        }
    }


    }
}
