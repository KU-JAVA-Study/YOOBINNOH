package Chapter04;

public class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {

        int[] c = new int[a.length+b.length];

        for(int i=0; i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length; i++){
            c[i+a.length]=b[i];
        }
        return c;
    }
}
