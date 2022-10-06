package Chapter04;

public class R {
    int x;
    int y;
    int a;
    int b;

    public R(int x, int y, int a, int b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;

    }

    public void show() {
        System.out.println(x+""+y+"에"+a+""+b+"생성");
    }

    public boolean contains(R k) {

        if ((k.x>x)&(k.y>y)&(x+a > k.x+k.a)&(y+b > k.y+k.b)){


            return true;
        }
        else{
            return false;
        }

    }
}
