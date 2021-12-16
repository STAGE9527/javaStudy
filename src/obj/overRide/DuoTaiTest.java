package obj.overRide;

public class DuoTaiTest {

    public static void main(String[] args) {
        show(new BasketBall());
        show(new FootBall());

        Ball b = new BasketBall();
        b.btype();
        BasketBall bb = (BasketBall)b;
        bb.work();

    }


    public static void show(Ball b){
        b.btype();
        if(b instanceof BasketBall){
            BasketBall bb = (BasketBall)b;
            bb.work();
        }else if(b instanceof FootBall){
            FootBall fb = (FootBall)b;
            fb.work();
        }
    }
}

abstract class Ball {
    abstract void btype();
}

class BasketBall extends Ball {
    public void btype(){
        System.out.println("篮球");
    }

    public void work(){
        System.out.println("NBA");
    }
}

class FootBall extends Ball {
    public void btype(){
        System.out.println("足球");
    }

    public void work(){
        System.out.println("ES");
    }
}