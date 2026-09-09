package lecture.lab.lab01;
class Battery{
    int batterylevel ;
    static int width, hight ;

    void charge(int level){
        this.batterylevel += level;
    }
    void use(int level){
        this.batterylevel -= level;
    }
    static void prinwh(){
        System.out.println("폭 :" + width +" " +"높이 :" + hight );
    }
}
public class Lab01_Test {
    public static void main(String[] args) {
       Battery one = new Battery();
       one.batterylevel = 90;
       one.charge(10);
       one.use(90);
       one.prinwh();
    }
}
